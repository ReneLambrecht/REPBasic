package br.com.rene.control;

import br.com.rene.model.dao.service.UnidadeService;
import br.com.rene.model.pojo.Unidade;
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
 * @author Rene
 */
public final class UnidadeControl {
    
    private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    
    private Unidade unidadeDigitado;
    
    private Unidade unidadeSelecionado;
    
    private List<Unidade> unidadeTabela;
    
    private final UnidadeService unidadeDao;

    public UnidadeControl() throws RemoteException {
        unidadeDao = ServiceLocator.getUnidadeService();
        unidadeTabela = ObservableCollections.observableList(unidadeTabela = new ArrayList<>());
        novo();
        pesquisar();
    }

    public void novo() {
        setUnidadeDigitado(new Unidade());
        
    }

    public void pesquisar() throws RemoteException {
        unidadeTabela.clear();
        unidadeTabela.addAll(unidadeDao.pesquisar(unidadeDigitado));
        
    }
          
      public void salvarAtualizar() throws ValidacaoException, RemoteException {
          unidadeDigitado.validar();
          unidadeDao.salvar(unidadeDigitado);
          novo();
          pesquisar();
      }
      
       public void excluir() throws RemoteException {
          unidadeDao.excluir(unidadeDigitado);
          novo();
          pesquisar();
      }
    public Unidade getUnidadeDigitado() {
        return unidadeDigitado;
    }

    public void setUnidadeDigitado(Unidade unidadeDigitado) {
        Unidade oldUnidadeDigitado = this.unidadeDigitado;
        this.unidadeDigitado = unidadeDigitado;
        propertyChangeSupport.firePropertyChange("unidadeDigitado", oldUnidadeDigitado,this.unidadeDigitado);
    }

    public Unidade getUnidadeSelecionado() {
        return unidadeSelecionado;
    }

    public void setUnidadeSelecionado(Unidade unidadeSelecionado) {
        this.unidadeSelecionado = unidadeSelecionado;
        if (this.unidadeSelecionado != null) {
            setUnidadeDigitado(unidadeSelecionado);
        }
    }

    public List<Unidade> getUnidadeTabela() {
        return unidadeTabela;
    }

    public void setUnidadeTabela(List<Unidade> unidadeTabela) {
        this.unidadeTabela = unidadeTabela;
    }
    
    public void addPropertyChangeListener(PropertyChangeListener e) {
        propertyChangeSupport.addPropertyChangeListener(e);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener e) {
        propertyChangeSupport.removePropertyChangeListener(e);
    }
}
