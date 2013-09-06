package br.com.senai.easymarket.persistencia;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 *
 * @author Rosicléia Frasson
 */
public class ConnectionFactory {
    private static final String UNIT_NAME = "EasyMarketPU";
    private EntityManagerFactory emf = null;
    private EntityManager em = null;

    public EntityManager getEntityManager() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory(UNIT_NAME);
        }
        if (em == null) {
            em = emf.createEntityManager();
        }
        return em;
    }
}
