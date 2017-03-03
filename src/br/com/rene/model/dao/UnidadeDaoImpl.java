package br.com.rene.model.dao;


import br.com.rene.model.pojo.Unidade;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Rene
 */
public class UnidadeDaoImpl implements Crudavel<Unidade, String> {

    @Override
    public String getChave(Unidade unidade) {
        return unidade.getCod();
    }

    @Override
    public String getConsultaSql(Unidade unidade) {
        StringBuilder sql = new StringBuilder("from Unidade c "
                + "where 1 = 1 ");
        if (unidade.getCod() != null) {
            sql.append("and c.cod = :cod ");
        }
        if (unidade.getDescricao() != null
                && !unidade.getDescricao().equals("")) {
            sql.append("and c.descricao like :descricao");
        }
        return sql.toString();
    }

    @Override
    public Map<String, Object> getParametrosMapa(Unidade unidade) {
        Map<String, Object> mapa = new HashMap<>();
        if (unidade.getCod() != null) {
            mapa.put("cod", unidade.getCod());
        }
        if (unidade.getDescricao() != null
                && !unidade.getDescricao().equals("")) {
            mapa.put("descricao", unidade.getDescricao());
        }
        return mapa;
    }
}
