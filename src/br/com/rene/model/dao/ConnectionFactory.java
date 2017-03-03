package br.com.rene.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Rene
 */
public class ConnectionFactory {
    
    private static EntityManagerFactory emf;
    private static ConnectionFactory conexao;

    //Fabrica uma conexão
    private ConnectionFactory() {
        emf = Persistence.createEntityManagerFactory("dadoserpbasic");
    }
    
    //Se for nula cria a conexão
    public synchronized static EntityManager getEntityManager() {
        if (conexao == null) {
            conexao = new ConnectionFactory();
        }
        return emf.createEntityManager();
            
    }
}