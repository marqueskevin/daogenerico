package br.com.senai.easymarket.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author kevin_marques
 */
@Entity
public class Fornecedor extends Pessoa{
    @Id
    @GeneratedValue
    private int id;
    private String cnpj;
    private String empresa;
    private String produto;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }   
    
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
