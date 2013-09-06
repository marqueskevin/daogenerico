package br.com.senai.easymarket.persistencia;


import br.com.senai.easymarket.model.Pedido;
import br.com.senai.easymarket.persistencia.dao.PedidoDAO;
import java.util.List;


/**
 *
 * @author Rosicléia Frasson
 */
public class PedidoDAOImpl extends DAOImpl<Pedido, Integer> implements PedidoDAO {

     public List<Pedido> getByCodigo(String ano){
        return getEntityManager().createQuery("SELECT * FROM Codigo").getResultList();
    }   
}
