package br.com.senai.easymarket.persistencia.dao;

import br.com.senai.easymarket.model.Produto;
import java.util.List;

/**
 *
 * @author Rosicléia Frasson
 */
public interface ProdutoDAO extends DAO<Produto, Integer>{
      
    List<Produto> getByNome (String ano);
}
