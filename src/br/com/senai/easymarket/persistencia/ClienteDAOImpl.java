package br.com.senai.easymarket.persistencia;


import br.com.senai.easymarket.model.Cliente;
import br.com.senai.easymarket.persistencia.dao.ClienteDAO;
import java.util.List;


/**
 *
 * @author Rosicléia Frasson
 */
public class ClienteDAOImpl extends DAOImpl<Cliente, Integer> implements ClienteDAO {

     public List<Cliente> getByNome (String ano){
        return getEntityManager().createQuery("SELECT * FROM Cliente").getResultList();
    }   
}
