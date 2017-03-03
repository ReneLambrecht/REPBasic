package br.com.rene.model.dao.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import br.com.rene.model.dao.UnidadeDaoImpl;
import br.com.rene.model.dao.CrudDao;
import br.com.rene.model.dao.CrudDaoImpl;
import br.com.rene.model.pojo.Unidade;

public class UnidadeServiceImpl	extends UnicastRemoteObject 
implements UnidadeService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final CrudDao<Unidade> crudDao;

	public UnidadeServiceImpl() throws RemoteException {
		crudDao = new CrudDaoImpl<>(new UnidadeDaoImpl());
	}

	@Override
	public void salvar(Unidade unidade) throws RemoteException {
		crudDao.salvarAtualizar(unidade);
	}

	@Override
	public void excluir(Unidade unidade) throws RemoteException {
		crudDao.excluir(unidade);
	}

	@Override
	public List<Unidade> pesquisar(Unidade unidade) throws RemoteException {
		return crudDao.pesquisar(unidade);
	}
}
