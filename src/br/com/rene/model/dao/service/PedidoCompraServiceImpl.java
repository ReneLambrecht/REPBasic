package br.com.rene.model.dao.service;

import br.com.rene.model.dao.CrudDao;
import br.com.rene.model.dao.CrudDaoImpl;
import br.com.rene.model.dao.PedidoCompraDaoImpl;
import br.com.rene.model.pojo.PedidoCompra;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author Rene
 */
public class PedidoCompraServiceImpl extends UnicastRemoteObject implements PedidoCompraService {
	
	private static final long serialVersionUID = 1L;
	
	private final CrudDao<PedidoCompra> crudDao;
	
	public PedidoCompraServiceImpl() throws RemoteException{
		crudDao = new CrudDaoImpl<>(new PedidoCompraDaoImpl());
	}

	@Override
	public void salvar(PedidoCompra pedidoCompra) throws RemoteException {
		crudDao.salvarAtualizar(pedidoCompra);
	}

	@Override
	public void excluir(PedidoCompra pedidoCompra) throws RemoteException {
		crudDao.excluir(pedidoCompra);
	}

	@Override
	public List<PedidoCompra> pesquisar(PedidoCompra pedidoCompra) throws RemoteException {
		return crudDao.pesquisar(pedidoCompra);
	}

}
