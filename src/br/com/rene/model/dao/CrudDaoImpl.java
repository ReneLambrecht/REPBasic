package br.com.rene.model.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class CrudDaoImpl<E extends Serializable, I> implements CrudDao<E> {

    private final Crudavel<E, I> crudavel;

    public CrudDaoImpl(Crudavel<E, I> crudavel) {
        this.crudavel = crudavel;
    }

    @Override
    public void salvarAtualizar(E e) throws ExceptionInInitializerError{
        EntityManager em = ConnectionFactory.getEntityManager();
        try {
            em.getTransaction().begin();
            if (crudavel.getChave(e) != null) {
                e = em.merge(e);
            }
            em.persist(e);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
            throw ex;
        } finally {
            em.close();
        }
    }

    @Override
    public void excluir(E e) {
        EntityManager em = ConnectionFactory.getEntityManager();
        em.getTransaction().begin();
        e = em.merge(e);
        em.remove(e);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<E> pesquisar(E e) {
        EntityManager em = ConnectionFactory.getEntityManager();
        Query query = em.createQuery(crudavel.getConsultaSql(e));
        Map<String, Object> parametros = crudavel.getParametrosMapa(e);
        parametros.keySet().stream().forEach((chave) -> {
            query.setParameter(chave, parametros.get(chave));
        });
        return query.getResultList();
    }

}
