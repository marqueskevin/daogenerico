package br.com.senai.easymarket.persistencia.dao;

import br.com.senai.easymarket.model.Pedido;
import java.util.List;

/**
 *
 * @author Rosicléia Frasson
 */
public interface PedidoDAO extends DAO<Pedido, Integer>{
      
    List<Pedido> getByCodigo (String ano);
}
