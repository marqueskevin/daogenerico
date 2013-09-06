package br.com.senai.easymarket.persistencia;


import br.com.senai.easymarket.model.Fornecedor;
import br.com.senai.easymarket.persistencia.dao.FornecedorDAO;
import java.util.List;


/**
 *
 * @author Rosicléia Frasson
 */
public class FornecedorDAOImpl extends DAOImpl<Fornecedor, Integer> implements FornecedorDAO {

     public List<Fornecedor> getByNome (String ano){
        return getEntityManager().createQuery("SELECT * FROM Fornecedor").getResultList();
    }   
}
