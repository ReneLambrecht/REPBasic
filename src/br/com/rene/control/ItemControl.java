package br.com.rene.control;

import br.com.rene.model.dao.service.ItemService;
import br.com.rene.model.pojo.Item;
import br.com.rene.service.ServiceLocator;
import br.com.rene.util.ValidacaoException;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 *
 * @author Rene
 */
public class ItemControl {

    private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    private Item itemDigitado;
    
    private List<Item> itemLista;

    private final ItemService itemDao;
    
    public ItemControl() throws RemoteException {
        itemDao = ServiceLocator.getItemService();
        itemDigitado = new Item();
        itemLista = ObservableCollections.observableList(itemLista = new ArrayList<>());
    }

    public void novo() {
        setItemDigitado(new Item());
    }
    
    public void pesquisaExistencia() throws RemoteException{
       itemLista.clear();
       itemLista.addAll(itemDao.pesquisar(itemDigitado));
        if (!itemLista.isEmpty()) {
        }
    }

    public void salvarAtualizar() throws ValidacaoException, RemoteException {
        itemDigitado.validar();
        itemDao.salvar(itemDigitado);
    }

    public void excluir() throws RemoteException {
        itemDao.excluir(itemDigitado);
    }

    public Item getItemDigitado() {
        return itemDigitado;
    }

    public void setItemDigitado(Item itemDigitado) {
        Item oldItemDigitado = this.itemDigitado;
        this.itemDigitado = itemDigitado;
        propertyChangeSupport.firePropertyChange("itemDigitado", oldItemDigitado, this.itemDigitado);
    }
    
    public List<Item> getItemLista() {
        return itemLista;
    }

    public void setItemLista(List<Item> itemLista) {
        this.itemLista = itemLista;
    }

    public void addPropertyChangeListener(PropertyChangeListener e) {
        propertyChangeSupport.addPropertyChangeListener(e);
    }

    public void removePropertyChangeListener(PropertyChangeListener e) {
        propertyChangeSupport.removePropertyChangeListener(e);
    }
}
