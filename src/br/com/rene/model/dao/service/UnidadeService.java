package br.com.rene.model.dao.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import br.com.rene.model.pojo.Unidade;

public interface UnidadeService extends Remote {

    public void salvar(Unidade unidade) throws RemoteException;

    public void excluir(Unidade unidade) throws RemoteException;

    public List<Unidade> pesquisar(Unidade unidade) throws RemoteException;

}
