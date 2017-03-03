/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rene.service;

import br.com.rene.model.dao.service.ItemService;
import br.com.rene.model.dao.service.ItemServiceImpl;
import br.com.rene.model.dao.service.PedidoCompraService;
import br.com.rene.model.dao.service.UnidadeService;
import br.com.rene.model.dao.service.UnidadeServiceImpl;
import br.com.rene.model.dao.service.UsuarioService;
import br.com.rene.model.dao.service.UsuarioServiceImpl;
import java.rmi.RemoteException;

/**
 *
 * @author Rene_sever
 */
public class ServiceLocator {

     public static UnidadeService getUnidadeService() throws RemoteException{
            return new UnidadeServiceImpl();
    }

    public static ItemService getItemService() throws RemoteException {
        return new ItemServiceImpl();
    }
    public static UsuarioService getUsuarioService() throws RemoteException {
        return new UsuarioServiceImpl();
    }

    public static PedidoCompraService getPedidoComrpaService() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
