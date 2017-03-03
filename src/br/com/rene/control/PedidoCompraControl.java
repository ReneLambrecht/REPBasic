package br.com.rene.control;

import br.com.rene.model.dao.service.PedidoCompraService;
import br.com.rene.model.pojo.PedidoCompra;
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
public class PedidoCompraControl {

    private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    private PedidoCompra pedidoCompraDigitado;
    
    private List<PedidoCompra> pedidoCompraLista;

    private final PedidoCompraService pedidoCompraDao;
    
    public PedidoCompraControl() throws RemoteException {
        pedidoCompraDao = ServiceLocator.getPedidoComrpaService();
        pedidoCompraDigitado = new PedidoCompra();
        pedidoCompraLista = ObservableCollections.observableList(pedidoCompraLista = new ArrayList<>());
    }

    public void novo() {
        setPedidoCompraDigitado(new PedidoCompra());
    }
    
    public void pesquisaExistencia() throws RemoteException{
       pedidoCompraLista.clear();
       pedidoCompraLista.addAll(pedidoCompraDao.pesquisar(pedidoCompraDigitado));
        if (!pedidoCompraLista.isEmpty()) {
        }
    }

    public void salvarAtualizar() throws ValidacaoException, RemoteException {
        pedidoCompraDigitado.validar();
        pedidoCompraDao.salvar(pedidoCompraDigitado);
    }

    public void excluir() throws RemoteException {
        pedidoCompraDao.excluir(pedidoCompraDigitado);
    }

    public PedidoCompra getItemDigitado() {
        return pedidoCompraDigitado;
    }

    public void setPedidoCompraDigitado(PedidoCompra itemDigitado) {
        PedidoCompra oldItemDigitado = this.pedidoCompraDigitado;
        this.pedidoCompraDigitado = itemDigitado;
        propertyChangeSupport.firePropertyChange("itemDigitado", oldItemDigitado, this.pedidoCompraDigitado);
    }
    
    public List<PedidoCompra> getItemLista() {
        return pedidoCompraLista;
    }

    public void setItemLista(List<PedidoCompra> itemLista) {
        this.pedidoCompraLista = itemLista;
    }

    public void addPropertyChangeListener(PropertyChangeListener e) {
        propertyChangeSupport.addPropertyChangeListener(e);
    }

    public void removePropertyChangeListener(PropertyChangeListener e) {
        propertyChangeSupport.removePropertyChangeListener(e);
    }
    
}
