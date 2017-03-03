package br.com.rene.model.dao.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import br.com.rene.model.dao.CrudDao;
import br.com.rene.model.dao.CrudDaoImpl;
import br.com.rene.model.dao.UsuarioDaoImpl;
import br.com.rene.model.pojo.Usuario;

public class UsuarioServiceImpl	extends UnicastRemoteObject 
implements UsuarioService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final CrudDao<Usuario> crudDao;

	public UsuarioServiceImpl() throws RemoteException {
		crudDao = new CrudDaoImpl<>(new UsuarioDaoImpl());
	}

	@Override
	public void salvar(Usuario usuario) throws RemoteException {
		crudDao.salvarAtualizar(usuario);
	}

	@Override
	public void excluir(Usuario usuario) throws RemoteException {
		crudDao.excluir(usuario);
	}

	@Override
	public List<Usuario> pesquisar(Usuario usuario) throws RemoteException {
		return crudDao.pesquisar(usuario);
	}
}
