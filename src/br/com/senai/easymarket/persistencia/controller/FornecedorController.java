

package br.com.senai.easymarket.persistencia.controller;

import br.com.senai.easymarket.model.Fornecedor;
import br.com.senai.easymarket.persistencia.FornecedorDAOImpl;
import br.com.senai.easymarket.persistencia.dao.FornecedorDAO;
import java.util.List;


/**
 *
 * @author Rosicléia Frasson
 */
public class FornecedorController {
    
     public boolean salvar(Fornecedor automovel) {
        FornecedorDAO dao = new FornecedorDAOImpl();
       return dao.save(automovel);

    }

    public boolean excluir(int id) {
        FornecedorDAO dao = new FornecedorDAOImpl();
        return dao.remove(Fornecedor.class, id);

    }
    
    public List<Fornecedor> listarFornecedor() {
        FornecedorDAO dao = new FornecedorDAOImpl();
        return dao.getAll(Fornecedor.class);
    }
    
    public Fornecedor listarFornecedorById (int id){
        FornecedorDAO dao = new FornecedorDAOImpl();
        return dao.getById(Fornecedor.class, id);
    }
    
   public List<Fornecedor> listarFornecedorByNome (String ano){
        FornecedorDAO dao = new FornecedorDAOImpl();
        return dao.getByNome(ano);
    }               
}
