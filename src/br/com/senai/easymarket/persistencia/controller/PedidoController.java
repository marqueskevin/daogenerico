

package br.com.senai.easymarket.persistencia.controller;

import br.com.senai.easymarket.model.Pedido;
import br.com.senai.easymarket.persistencia.PedidoDAOImpl;
import br.com.senai.easymarket.persistencia.dao.PedidoDAO;
import java.util.List;


/**
 *
 * @author Rosicléia Frasson
 */
public class PedidoController {
    
     public boolean salvar(Pedido automovel) {
        PedidoDAO dao = new PedidoDAOImpl();
       return dao.save(automovel);

    }

    public boolean excluir(int id) {
        PedidoDAO dao = new PedidoDAOImpl();
        return dao.remove(Pedido.class, id);

    }
    
    public List<Pedido> listarPedido() {
        PedidoDAO dao = new PedidoDAOImpl();
        return dao.getAll(Pedido.class);
    }
    
    public Pedido listarPedidoById (int id){
        PedidoDAO dao = new PedidoDAOImpl();
        return dao.getById(Pedido.class, id);
    }
    
   public List<Pedido> listarPedidoByCodigo (String ano){
        PedidoDAO dao = new PedidoDAOImpl();
        return dao.getByCodigo(ano);
    }               
}