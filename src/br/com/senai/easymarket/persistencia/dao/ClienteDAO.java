package br.com.senai.easymarket.persistencia.dao;

import br.com.senai.easymarket.model.Cliente;
import java.util.List;

/**
 *
 * @author Rosicléia Frasson
 */
public interface ClienteDAO extends DAO<Cliente, Integer>{
      
    List<Cliente> getByNome (String ano);
}
