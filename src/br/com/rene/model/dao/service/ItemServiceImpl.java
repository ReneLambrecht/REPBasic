package br.com.rene.model.dao.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import br.com.rene.model.pojo.Item;
import br.com.rene.model.dao.CrudDao;
import br.com.rene.model.dao.CrudDaoImpl;
import br.com.rene.model.dao.ItemDaoImpl;

public class ItemServiceImpl extends UnicastRemoteObject
	implements ItemService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final CrudDao<Item> crudDao;
	
	public ItemServiceImpl() throws RemoteException{
		crudDao = new CrudDaoImpl<>(new ItemDaoImpl());
	}

	@Override
	public void salvar(Item item) throws RemoteException {
		crudDao.salvarAtualizar(item);
	}

	@Override
	public void excluir(Item item) throws RemoteException {
		crudDao.excluir(item);
	}

	@Override
	public List<Item> pesquisar(Item item) throws RemoteException {
		return crudDao.pesquisar(item);
	}

}
