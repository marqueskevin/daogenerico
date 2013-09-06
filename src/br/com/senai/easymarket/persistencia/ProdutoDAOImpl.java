package br.com.senai.easymarket.persistencia;


import br.com.senai.easymarket.model.Produto;
import br.com.senai.easymarket.persistencia.dao.ProdutoDAO;
import java.util.List;


/**
 *
 * @author Rosicléia Frasson
 */
public class ProdutoDAOImpl extends DAOImpl<Produto, Integer> implements ProdutoDAO {

     public List<Produto> getByNome (String ano){
        return getEntityManager().createQuery("SELECT * FROM Produto").getResultList();
    }   
}
