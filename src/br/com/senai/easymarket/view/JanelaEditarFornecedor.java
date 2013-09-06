/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senai.easymarket.view;

import br.com.senai.easymarket.model.Fornecedor;
import br.com.senai.easymarket.persistencia.controller.FornecedorController;



/**
 *
 * @author Kevin Marques
 */
public class JanelaEditarFornecedor extends javax.swing.JFrame {
private int idFornecedor;
    /**
     * Creates new form JanelaEditarFornecedor
     */
    public JanelaEditarFornecedor(int id) {
        initComponents();
       idFornecedor = id;
        setLocationRelativeTo(null);
        FornecedorController pc = new FornecedorController();
        pc.listarFornecedorById(id);
        Fornecedor p = new Fornecedor();
        p = pc.listarFornecedorById(id);
        
        campoNome.setText(p.getNome());

        campoTelefone.setText(p.getTelefone());
         areaObservacoes.setText(p.getObservacoes());
         campoEndereco.setText(p.getEndereco());
         campoCPF.setText(p.getCpf());
         campoRG.setText(p.getRg());
         campoDataNascimento.setText(p.getDataNascimento());
         campoProduto.setText(p.getProduto());
         campoCNPJ.setText(p.getCnpj());
         campoEmpresa.setText(p.getEmpresa());
                  
        if (p.getSexo().equals("Feminino")){
            comboSexo.setSelectedIndex(1);
        }if(p.getSexo().equals("Outro")){
            comboSexo.setSelectedIndex(2);
        }else{
            comboSexo.setSelectedIndex(0);
           
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelCliente = new javax.swing.JPanel();
        labelNome = new java.awt.Label();
        labelCPF = new java.awt.Label();
        labelDataNascimento = new java.awt.Label();
        labelRG = new java.awt.Label();
        labelSexo = new java.awt.Label();
        botaoCadastrarCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaObservacoes = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelEndereco = new javax.swing.JLabel();
        labelProduto = new javax.swing.JLabel();
        LabelTelefone = new javax.swing.JLabel();
        campoProduto = new javax.swing.JTextField();
        campoTelefone = new javax.swing.JTextField();
        comboSexo = new javax.swing.JComboBox();
        campoNome = new javax.swing.JTextField();
        campoDataNascimento = new javax.swing.JTextField();
        campoCPF = new javax.swing.JTextField();
        campoRG = new javax.swing.JTextField();
        campoEndereco = new javax.swing.JTextField();
        botaoExcluir = new javax.swing.JButton();
        labelCNPJ = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        campoCNPJ = new javax.swing.JTextField();
        campoEmpresa = new javax.swing.JTextField();
        LabelDescricao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelCliente.setBackground(new java.awt.Color(16, 156, 208));

        labelNome.setText("Nome:");

        labelCPF.setText("CPF:");

        labelDataNascimento.setText("Data Nascimento:");

        labelRG.setText("RG:");

        labelSexo.setText("Sexo:");

        botaoCadastrarCliente.setText("Alterar");
        botaoCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarClienteActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(areaObservacoes);

        jLabel1.setText("Observações:");

        labelEndereco.setText("Endereco:");

        labelProduto.setText("Produto:");

        LabelTelefone.setText("Telefone:");

        campoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoProdutoActionPerformed(evt);
            }
        });

        campoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTelefoneActionPerformed(evt);
            }
        });

        comboSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino", "Outro" }));

        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });

        campoDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDataNascimentoActionPerformed(evt);
            }
        });

        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        labelCNPJ.setText("Cnpj:");

        labelUsuario.setText("Empresa:");

        LabelDescricao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LabelDescricao.setText("Editar Fornecedor");

        javax.swing.GroupLayout painelClienteLayout = new javax.swing.GroupLayout(painelCliente);
        painelCliente.setLayout(painelClienteLayout);
        painelClienteLayout.setHorizontalGroup(
            painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClienteLayout.createSequentialGroup()
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botaoCadastrarCliente)
                        .addGap(18, 18, 18)
                        .addComponent(botaoExcluir))
                    .addGroup(painelClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(painelClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelClienteLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEndereco)
                            .addComponent(labelProduto)
                            .addComponent(LabelTelefone)
                            .addComponent(labelCNPJ)
                            .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelClienteLayout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(painelClienteLayout.createSequentialGroup()
                                            .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(labelSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelClienteLayout.createSequentialGroup()
                                    .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelUsuario)
                                        .addComponent(labelRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(148, 148, 148)
                                    .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(comboSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(campoCPF)
                                        .addComponent(campoRG)
                                        .addComponent(campoEndereco)
                                        .addComponent(campoProduto)
                                        .addComponent(campoTelefone)
                                        .addComponent(campoCNPJ)
                                        .addComponent(campoEmpresa)
                                        .addComponent(campoDataNascimento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(painelClienteLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(LabelDescricao)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        painelClienteLayout.setVerticalGroup(
            painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelDescricao)
                .addGap(8, 8, 8)
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelClienteLayout.createSequentialGroup()
                        .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelClienteLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(labelDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelClienteLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEndereco)
                    .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelProduto)
                    .addComponent(campoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelTelefone)
                    .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCNPJ)
                    .addComponent(campoCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelUsuario)
                    .addComponent(campoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastrarCliente)
                    .addComponent(botaoExcluir))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarClienteActionPerformed
        Fornecedor c = new Fornecedor();
        c.setId(idFornecedor);
        c.setNome(campoNome.getText());
        c.setSexo(comboSexo.getSelectedItem().toString());
        c.setTelefone(campoTelefone.getText());
        c.setObservacoes(areaObservacoes.getText());
        c.setEndereco(campoEndereco.getText());
        c.setRg(campoRG.getText());
        c.setCpf(campoCPF.getText());
        c.setDataNascimento(campoDataNascimento.getText());
        c.setProduto(campoProduto.getText());
        c.setCnpj(campoCNPJ.getText());
        c.setEmpresa(campoEmpresa.getText());
       
        FornecedorController cc = new FornecedorController();
        if(cc.salvar(c)){
            dispose();
            JanelaGerenciarFornecedores jc = new JanelaGerenciarFornecedores();
            jc.setVisible(true);
        }
    }//GEN-LAST:event_botaoCadastrarClienteActionPerformed

    private void campoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoProdutoActionPerformed

    private void campoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTelefoneActionPerformed

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void campoDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDataNascimentoActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed

     FornecedorController pc = new FornecedorController();
       if(pc.excluir(idFornecedor)){     
            dispose();
            JanelaGerenciarFornecedores jc = new JanelaGerenciarFornecedores();
            jc.setVisible(true);
       }
    }//GEN-LAST:event_botaoExcluirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelDescricao;
    private javax.swing.JLabel LabelTelefone;
    private javax.swing.JTextPane areaObservacoes;
    private javax.swing.JButton botaoCadastrarCliente;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JTextField campoCNPJ;
    private javax.swing.JTextField campoCPF;
    private javax.swing.JTextField campoDataNascimento;
    private javax.swing.JTextField campoEmpresa;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoProduto;
    private javax.swing.JTextField campoRG;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JComboBox comboSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelCNPJ;
    private java.awt.Label labelCPF;
    private java.awt.Label labelDataNascimento;
    private javax.swing.JLabel labelEndereco;
    private java.awt.Label labelNome;
    private javax.swing.JLabel labelProduto;
    private java.awt.Label labelRG;
    private java.awt.Label labelSexo;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPanel painelCliente;
    // End of variables declaration//GEN-END:variables
}
