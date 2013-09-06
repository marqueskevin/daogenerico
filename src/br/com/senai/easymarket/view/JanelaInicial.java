/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senai.easymarket.view;


import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kevin_marques
 */
public class JanelaInicial extends javax.swing.JFrame {
    
   

    /**
     * Construtor da JanelaInicial
     */
    public JanelaInicial() {
        initComponents();
    }

   

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jFrame1 = new javax.swing.JFrame();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        painelPrincipal = new javax.swing.JPanel();
        painelNomeSoftware = new javax.swing.JPanel();
        labelNomeSoftware = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        SubmenuFornecedor = new javax.swing.JMenuItem();
        SubmenuCliente = new javax.swing.JMenuItem();
        SubmenuProduto = new javax.swing.JMenuItem();
        SubmenuPedido = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        menuFornecedores = new javax.swing.JMenuItem();
        menuClientes = new javax.swing.JMenuItem();
        menuProdutos = new javax.swing.JMenuItem();
        menuPedidos = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenuItem1.setText("jMenuItem1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenuItem4.setText("jMenuItem4");

        jMenuItem5.setText("jMenuItem5");

        jMenuItem7.setText("jMenuItem7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelPrincipal.setBackground(new java.awt.Color(16, 156, 208));

        painelNomeSoftware.setBackground(new java.awt.Color(16, 156, 208));

        labelNomeSoftware.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelNomeSoftware.setText("Easy Market Pro");

        javax.swing.GroupLayout painelNomeSoftwareLayout = new javax.swing.GroupLayout(painelNomeSoftware);
        painelNomeSoftware.setLayout(painelNomeSoftwareLayout);
        painelNomeSoftwareLayout.setHorizontalGroup(
            painelNomeSoftwareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNomeSoftwareLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(labelNomeSoftware, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(223, Short.MAX_VALUE))
        );
        painelNomeSoftwareLayout.setVerticalGroup(
            painelNomeSoftwareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelNomeSoftwareLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(labelNomeSoftware, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Bem Vindo...");

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelNomeSoftware, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(464, 464, 464))
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(painelNomeSoftware, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );

        jMenu1.setText("Arquivo");

        jMenu8.setText("Novo");

        SubmenuFornecedor.setText("Fornecedor");
        SubmenuFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmenuFornecedorActionPerformed(evt);
            }
        });
        jMenu8.add(SubmenuFornecedor);

        SubmenuCliente.setText("Cliente");
        SubmenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmenuClienteActionPerformed(evt);
            }
        });
        jMenu8.add(SubmenuCliente);

        SubmenuProduto.setText("Produto");
        SubmenuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmenuProdutoActionPerformed(evt);
            }
        });
        jMenu8.add(SubmenuProduto);

        SubmenuPedido.setText("Pedido");
        SubmenuPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmenuPedidoActionPerformed(evt);
            }
        });
        jMenu8.add(SubmenuPedido);

        jMenu1.add(jMenu8);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem3.setText("Sair");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");
        jMenuBar1.add(jMenu2);

        jMenu5.setText("Exibir");
        jMenuBar1.add(jMenu5);

        jMenu7.setText("Gerenciar");

        menuFornecedores.setText("Fornecedores");
        menuFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFornecedoresActionPerformed(evt);
            }
        });
        jMenu7.add(menuFornecedores);

        menuClientes.setText("Clientes");
        menuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClientesActionPerformed(evt);
            }
        });
        jMenu7.add(menuClientes);

        menuProdutos.setText("Produtos");
        menuProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProdutosActionPerformed(evt);
            }
        });
        jMenu7.add(menuProdutos);

        menuPedidos.setText("Pedidos");
        menuPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPedidosActionPerformed(evt);
            }
        });
        jMenu7.add(menuPedidos);

        jMenuBar1.add(jMenu7);

        jMenu6.setText("Sobre");
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClientesActionPerformed
      JanelaGerenciarClientes jc = new JanelaGerenciarClientes();
        jc.setVisible(true);
        jc.setDefaultCloseOperation(1);
    }//GEN-LAST:event_menuClientesActionPerformed

    private void menuPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPedidosActionPerformed
        JanelaGerenciarPedidos jg = new JanelaGerenciarPedidos();
        jg.setVisible(true);
        jg.setDefaultCloseOperation(1);
    }//GEN-LAST:event_menuPedidosActionPerformed

    private void menuFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFornecedoresActionPerformed
        JanelaGerenciarFornecedores jg = new JanelaGerenciarFornecedores();
        jg.setVisible(true);
        jg.setDefaultCloseOperation(1);
    }//GEN-LAST:event_menuFornecedoresActionPerformed

    private void menuProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProdutosActionPerformed
       JanelaGerenciarProdutos jg = new JanelaGerenciarProdutos();
        jg.setVisible(true);
        jg.setDefaultCloseOperation(1);
    }//GEN-LAST:event_menuProdutosActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void SubmenuPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmenuPedidoActionPerformed
       JanelaInserirPedido jg = new JanelaInserirPedido();
        jg.setVisible(true);
        jg.setDefaultCloseOperation(1);
    }//GEN-LAST:event_SubmenuPedidoActionPerformed

    private void SubmenuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmenuProdutoActionPerformed
        JanelaInserirProduto jg = new JanelaInserirProduto();
        jg.setVisible(true);
        jg.setDefaultCloseOperation(1);
    }//GEN-LAST:event_SubmenuProdutoActionPerformed

    private void SubmenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmenuClienteActionPerformed
        JanelaInserirCliente jg = new JanelaInserirCliente();
        jg.setVisible(true);
        jg.setDefaultCloseOperation(1);
    }//GEN-LAST:event_SubmenuClienteActionPerformed

    private void SubmenuFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmenuFornecedorActionPerformed
       JanelaInserirFornecedor jg = new JanelaInserirFornecedor();
        jg.setVisible(true);
        jg.setDefaultCloseOperation(1);
    }//GEN-LAST:event_SubmenuFornecedorActionPerformed

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed
        JOptionPane.showMessageDialog(null, "O EasyMarket é um sistema para gerenciamento de mercearias e pequenos mercados."+
                "\n Esta é a versão Trial ainda faltam alguns módulos, em breve estarão disponibilizadas novas atualizações!");
    }//GEN-LAST:event_jMenu6ActionPerformed

    
    
    public JanelaInicial(GraphicsConfiguration gc) {
        super(gc);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem SubmenuCliente;
    private javax.swing.JMenuItem SubmenuFornecedor;
    private javax.swing.JMenuItem SubmenuPedido;
    private javax.swing.JMenuItem SubmenuProduto;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JLabel labelNomeSoftware;
    private javax.swing.JMenuItem menuClientes;
    private javax.swing.JMenuItem menuFornecedores;
    private javax.swing.JMenuItem menuPedidos;
    private javax.swing.JMenuItem menuProdutos;
    private javax.swing.JPanel painelNomeSoftware;
    private javax.swing.JPanel painelPrincipal;
    // End of variables declaration//GEN-END:variables


}
