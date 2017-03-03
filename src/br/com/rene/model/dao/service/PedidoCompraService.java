package br.com.rene.model.dao.service;

import br.com.rene.model.pojo.PedidoCompra;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Rene
 */
    
    public interface PedidoCompraService extends Remote {
	
	public void salvar(PedidoCompra pedidoCompra) throws RemoteException;
	
	public void excluir(PedidoCompra pedidoCompra) throws RemoteException;
	
	public List<PedidoCompra> pesquisar(PedidoCompra pedidoCompra) throws RemoteException;
    
    
}
