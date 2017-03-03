/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rene.control;

import br.com.rene.model.dao.service.UsuarioService;
import br.com.rene.model.pojo.Usuario;
import br.com.rene.service.ServiceLocator;
import br.com.rene.util.ValidacaoException;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 *
 * @author Rene_sever
 */
public final class UsuarioControl {
    
    private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    
    private Usuario usuarioDigitado;
    
    private Usuario usuarioSelecionado;
    
    private List<Usuario> usuarioTabela;
    
    private final UsuarioService usuarioDao;

    public UsuarioControl() throws RemoteException {
        usuarioDao = ServiceLocator.getUsuarioService();
        usuarioTabela = ObservableCollections.observableList(usuarioTabela = new ArrayList<>());
        novo();
        pesquisar();
    }

    public void novo() {
        setUsuarioDigitado(new Usuario());
        
    }

    public void pesquisar() throws RemoteException {
        usuarioTabela.clear();
        usuarioTabela.addAll(usuarioDao.pesquisar(usuarioDigitado));
        
    }
          
      public void salvarAtualizar() throws ValidacaoException, RemoteException {
          usuarioDigitado.validar();
          usuarioDao.salvar(usuarioDigitado);
          novo();
          pesquisar();
      }
      
       public void excluir() throws RemoteException {
          usuarioDao.excluir(usuarioDigitado);
          novo();
          pesquisar();
      }
    public Usuario getUsuarioDigitado() {
        return usuarioDigitado;
    }

    public void setUsuarioDigitado(Usuario UsuarioDigitado) {
        Usuario oldUsuarioDigitado = this.usuarioDigitado;
        this.usuarioDigitado = UsuarioDigitado;
        propertyChangeSupport.firePropertyChange("usuarioDigitado", oldUsuarioDigitado,this.usuarioDigitado);
    }

    public Usuario getUsuarioSelecionado() {
        return usuarioSelecionado;
    }

    public void setUsuarioSelecionado(Usuario usuarioSelecionado) {
        this.usuarioSelecionado = usuarioSelecionado;
        if (this.usuarioSelecionado != null) {
            setUsuarioDigitado(usuarioSelecionado);
        }
    }

    public List<Usuario> getUsuarioTabela() {
        return usuarioTabela;
    }

    public void setUsuarioTabela(List<Usuario> usuarioTabela) {
        this.usuarioTabela = usuarioTabela;
    }
    
    public void addPropertyChangeListener(PropertyChangeListener e) {
        propertyChangeSupport.addPropertyChangeListener(e);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener e) {
        propertyChangeSupport.removePropertyChangeListener(e);
    }
}
