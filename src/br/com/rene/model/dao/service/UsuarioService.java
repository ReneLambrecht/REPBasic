package br.com.rene.model.dao.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import br.com.rene.model.pojo.Usuario;

public interface UsuarioService extends Remote {

    public void salvar(Usuario usuario) throws RemoteException;

    public void excluir(Usuario usuario) throws RemoteException;

    public List<Usuario> pesquisar(Usuario usuario) throws RemoteException;

}
