/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senai.easymarket.app;

import br.com.senai.easymarket.model.Cliente;
import br.com.senai.easymarket.persistencia.controller.ClienteController;
import br.com.senai.easymarket.view.JanelaInicial;


/**
 *
 * @author kevin_marques
 */
public class Principal {
    public static void main(String[] args) {
        JanelaInicial jl = new JanelaInicial();
        jl.setVisible(true);
        jl.setResizable(false);
        
//        JanelaGerenciarFuncionarios j = new JanelaGerenciarFuncionarios();
//        j.setVisible(true);
    }
}
