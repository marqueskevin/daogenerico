package br.com.senai.easymarket.persistencia.dao;

import br.com.senai.easymarket.model.Fornecedor;
import java.util.List;

/**
 *
 * @author Rosicléia Frasson
 */
public interface FornecedorDAO extends DAO<Fornecedor, Integer>{
      
    List<Fornecedor> getByNome (String ano);
}
