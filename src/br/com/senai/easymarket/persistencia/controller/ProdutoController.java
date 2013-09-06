

package br.com.senai.easymarket.persistencia.controller;

import br.com.senai.easymarket.model.Produto;
import br.com.senai.easymarket.persistencia.ProdutoDAOImpl;
import br.com.senai.easymarket.persistencia.dao.ProdutoDAO;
import java.util.List;


/**
 *
 * @author Rosicléia Frasson
 */
public class ProdutoController {
    
     public boolean salvar(Produto automovel) {
        ProdutoDAO dao = new ProdutoDAOImpl();
       return dao.save(automovel);

    }

    public boolean excluir(int id) {
        ProdutoDAO dao = new ProdutoDAOImpl();
        return dao.remove(Produto.class, id);

    }
    
    public List<Produto> listarProduto() {
        ProdutoDAO dao = new ProdutoDAOImpl();
        return dao.getAll(Produto.class);
    }
    
    public Produto listarProdutoById (int id){
        ProdutoDAO dao = new ProdutoDAOImpl();
        return dao.getById(Produto.class, id);
    }
    
   public List<Produto> listarProdutoByNome (String ano){
        ProdutoDAO dao = new ProdutoDAOImpl();
        return dao.getByNome(ano);
    }               
}