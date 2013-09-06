/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senai.easymarket.view;


import br.com.senai.easymarket.model.Produto;
import br.com.senai.easymarket.persistencia.controller.ProdutoController;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kevin Marques
 */
public class JanelaGerenciarProdutos extends javax.swing.JFrame {
// Declaração das variáveis
    private JTable tabela;
    private DefaultTableModel modelo = new DefaultTableModel();
    /**
     * Construtor da  JanelaGerenciarProdutos
     */
    public JanelaGerenciarProdutos() {
        initComponents();
        criaTabela();
        scrollTabela.setViewportView(tabela);
    }

    

    

    private void criaTabela() {
        // criando a lista de produtos cadastrados
        tabela = new JTable(modelo);
        modelo.addColumn("Id"); // coluna 0
        modelo.addColumn("Nome"); // coluna 1

        tabela.getColumnModel().getColumn(0).setPreferredWidth(20);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(20);
        preencherTabela();
    }

    /**
     * Método para carregar os dados da base de dados e carregar na tabela.
     */
    private void preencherTabela() {
        // adicionando itens na tabela criada
        modelo.setNumRows(0);
        ProdutoController pc = new ProdutoController();

        for (Produto c : pc.listarProduto()) {
            modelo.addRow(new Object[]{c.getId(), c.getNome()});
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botaoInserir = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        scrollTabela = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelPrincipal.setBackground(new java.awt.Color(16, 156, 208));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Produtos Cadastrados");

        botaoInserir.setText("Inserir");
        botaoInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirActionPerformed(evt);
            }
        });

        botaoEditar.setText("Editar");
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(botaoInserir)
                        .addGap(18, 18, 18)
                        .addComponent(botaoEditar)
                        .addGap(18, 18, 18)
                        .addComponent(botaoExcluir))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrollTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoInserir)
                    .addComponent(botaoEditar)
                    .addComponent(botaoExcluir))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirActionPerformed
        this.dispose();
        JanelaInserirProduto ji = new JanelaInserirProduto();
        ji.setVisible(true);
        ji.setDefaultCloseOperation(1);
    }//GEN-LAST:event_botaoInserirActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        this.dispose();
        //pegar a linha que esta selecionada
        int linha = tabela.getSelectedRow();
        //pega o id da linha que esta selecionada.
        int id = (int)tabela.getValueAt(linha, 0);
        JanelaEditarProduto ji = new JanelaEditarProduto(id);
        ji.setVisible(true);
        ji.setDefaultCloseOperation(1);
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
       
        //pegar a linha que esta selecionada
        int linha = tabela.getSelectedRow();
        //pega o id da linha que esta selecionada.
        int id = (int)tabela.getValueAt(linha, 0);
        ProdutoController pc = new ProdutoController();
        if(pc.excluir(id)){
            preencherTabela();
        }    
    }//GEN-LAST:event_botaoExcluirActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoInserir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JScrollPane scrollTabela;
    // End of variables declaration//GEN-END:variables
}
