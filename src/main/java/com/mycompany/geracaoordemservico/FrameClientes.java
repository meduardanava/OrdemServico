/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.geracaoordemservico;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Maria Eduarda
 */
public final class FrameClientes extends javax.swing.JFrame {

    DefaultTableModel tabela;
   
    public FrameClientes() {
        initComponents();
        setLocationRelativeTo(this);
        this.tabela = new DefaultTableModel();
        carregarTabela();
    }
    
    public void carregarTabela(){
        
        JTable tabelaClientes = new JTable(tabela);
        
        tabela.addColumn("Nome");
        tabela.addColumn("Telefone");
        tabela.addColumn("Email");
        tabela.addColumn("Endereço");
        tabela.addColumn("Marca");
        tabela.addColumn("Modelo");
        tabela.addColumn("Placa");
        tabela.addColumn("Ano");
        tabela.addColumn("Problema");
        tabelaClientes.setModel(tabela);
        tabelaClientes.getColumnModel().getColumn(0).setPreferredWidth(120);
        tabelaClientes.getColumnModel().getColumn(1).setPreferredWidth(15);
        tabelaClientes.getColumnModel().getColumn(2).setPreferredWidth(50);
        tabelaClientes.getColumnModel().getColumn(3).setPreferredWidth(50);
        tabelaClientes.getColumnModel().getColumn(4).setPreferredWidth(20);
        tabelaClientes.getColumnModel().getColumn(5).setPreferredWidth(20);
        tabelaClientes.getColumnModel().getColumn(6).setPreferredWidth(4);
        tabelaClientes.getColumnModel().getColumn(7).setPreferredWidth(10);
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setLocationRelativeTo(this);
        jScrollPane1.setViewportView(tabelaClientes);
    }
    public void adicionarCliente(String nome, String telefone, String email, 
            String endereco, String marca, String modelo, String placa,
            String ano, String problema) {
        
        tabela.addRow(new Object[]{nome, telefone, email, endereco, marca,
            modelo, placa, ano, problema});
    }
    
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCliente = new javax.swing.JTable();
        btVoltar = new javax.swing.JButton();
        btSelecionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ordem de Serviço"));

        tbCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Telefone", "Email", "Endereço", "Marca", "Modelo", "Placa", "Ano", "Problema"
            }
        ));
        tbCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.E_RESIZE_CURSOR));
        tbCliente.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbClienteAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tbCliente);

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btSelecionar.setText("Selecionar");
        btSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelecionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 952, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSelecionar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar)
                    .addComponent(btSelecionar))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        new FrameTelaInicial().setVisible(true);
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecionarActionPerformed
        new FrameExibirOSCompleta().setVisible(true);
    }//GEN-LAST:event_btSelecionarActionPerformed

    private void tbClienteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbClienteAncestorAdded
        
    }//GEN-LAST:event_tbClienteAncestorAdded



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSelecionar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbCliente;
    // End of variables declaration//GEN-END:variables
}
