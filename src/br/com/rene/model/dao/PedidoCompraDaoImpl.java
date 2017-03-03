package br.com.rene.model.dao;

import br.com.rene.model.pojo.PedidoCompra;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Rene
 */
public class PedidoCompraDaoImpl implements Crudavel<PedidoCompra, Integer>{

    @Override
    public Integer getChave(PedidoCompra e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getConsultaSql(PedidoCompra e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Map<String, Object> getParametrosMapa(PedidoCompra e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     /*  @Override
    public Integer getChave(PedidoCompra pedidoCompra) {
        return pedidoCompra.getCodigo();
    }

    @Override
    public String getConsultaSql(PedidoCompra pedidoCompra) {
        StringBuilder sql = new StringBuilder("from Item c "
                + "where 1 = 1 ");
        if (pedidoCompra.getCodigo() != null) {
            sql.append("and c.codigo = :codigo ");
        }
        if (pedidoCompra.getDataLancamento()!= null
                && !pedidoCompra.getDataLancamento().equals("")) {
            sql.append("and c.nome like :nome");
        }
        return sql.toString();
    }

    @Override
    public Map<String, Object> getParametrosMapa(PedidoCompra pedidoCompra) {
        Map<String, Object> mapa = new HashMap<>();
        if (pedidoCompra.getCodigo() != ) {
            mapa.put("codigo", pedidoCompra.getCodigo());
        }
        if (pedidoCompra.getDataLancamento()!= null
                && !pedidoCompra.getDataLancamento().equals("")) {
            mapa.put("nome", pedidoCompra.getDataLancamento());
        }
        return mapa;
    }
*/
    
}
