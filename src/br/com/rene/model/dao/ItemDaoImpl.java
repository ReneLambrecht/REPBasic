/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rene.model.dao;

import br.com.rene.model.pojo.Item;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author PLASMAT
 */
public class ItemDaoImpl implements Crudavel<Item, String> {

    @Override
    public String getChave(Item item) {
        return item.getCodigo();
    }

    @Override
    public String getConsultaSql(Item item) {
        StringBuilder sql = new StringBuilder("from Item c "
                + "where 1 = 1 ");
        if (item.getCodigo() != null) {
            sql.append("and c.codigo = :codigo ");
        }
        if (item.getNome() != null
                && !item.getNome().equals("")) {
            sql.append("and c.nome like :nome");
        }
        return sql.toString();
    }

    @Override
    public Map<String, Object> getParametrosMapa(Item item) {
        Map<String, Object> mapa = new HashMap<>();
        if (item.getCodigo() != null) {
            mapa.put("codigo", item.getCodigo());
        }
        if (item.getNome() != null
                && !item.getNome().equals("")) {
            mapa.put("nome", item.getNome());
        }
        return mapa;
    }
}
