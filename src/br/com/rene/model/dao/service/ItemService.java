package br.com.rene.model.dao.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import br.com.rene.model.pojo.Item;

public interface ItemService extends Remote {
	
	public void salvar(Item item) throws RemoteException;
	
	public void excluir(Item item) throws RemoteException;
	
	public List<Item> pesquisar(Item item) throws RemoteException;
    
}
