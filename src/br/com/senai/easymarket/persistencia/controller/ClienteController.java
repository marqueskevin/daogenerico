

package br.com.senai.easymarket.persistencia.controller;

import br.com.senai.easymarket.model.Cliente;
import br.com.senai.easymarket.persistencia.ClienteDAOImpl;
import br.com.senai.easymarket.persistencia.dao.ClienteDAO;
import java.util.List;


/**
 *
 * @author Rosicléia Frasson
 */
public class ClienteController {
    
     public boolean salvar(Cliente automovel) {
        ClienteDAO dao = new ClienteDAOImpl();
       return dao.save(automovel);

    }

    public boolean excluir(int id) {
        ClienteDAO dao = new ClienteDAOImpl();
        return dao.remove(Cliente.class, id);

    }
    
    public List<Cliente> listarCliente() {
        ClienteDAO dao = new ClienteDAOImpl();
        return dao.getAll(Cliente.class);
    }
    
    public Cliente listarClienteById (int id){
        ClienteDAO dao = new ClienteDAOImpl();
        return dao.getById(Cliente.class, id);
    }
    
   public List<Cliente> listarClienteByNome (String ano){
        ClienteDAO dao = new ClienteDAOImpl();
        return dao.getByNome(ano);
    }               
}
