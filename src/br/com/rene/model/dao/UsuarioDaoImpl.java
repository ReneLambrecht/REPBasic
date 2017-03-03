/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rene.model.dao;


import br.com.rene.model.pojo.Usuario;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Rene_sever
 */
public class UsuarioDaoImpl implements Crudavel<Usuario, Integer> {

    @Override
    public Integer getChave(Usuario usuario) {
        return usuario.getCodigo();
    }
   
    @Override
    public String getConsultaSql(Usuario usuario) {
        StringBuilder sql = new StringBuilder("from Usuario c "
                + "where 1 = 1 ");
        if (usuario.getNome() != null
                && !usuario.getNome().equals("")) {
            sql.append("and c.nome like :nome");
        }
         if (usuario.getLogim()!= null
                && !usuario.getLogim().equals("")) {
            sql.append("and c.logim like :l");
         }
        return sql.toString();
    }

    @Override
    public Map<String, Object> getParametrosMapa(Usuario usuario) {
        Map<String, Object> mapa = new HashMap<>();
        if (usuario.getNome()!= null
                && !usuario.getNome().equals("")) {
            mapa.put("nome", usuario.getNome());
        }
        return mapa;
    }
}
