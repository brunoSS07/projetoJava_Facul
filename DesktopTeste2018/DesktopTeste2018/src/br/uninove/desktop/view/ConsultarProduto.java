package br.uninove.desktop.view;

import br.uninove.desktop.model.Produto;
import br.uninove.desktop.repository.ProdutoDao;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ConsultarProduto extends javax.swing.JFrame {
    Produto produto = new Produto();
    DecimalFormat deci = new DecimalFormat("0.00");
    
    public ConsultarProduto() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblResultProduto = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtNumConsultaProd = new javax.swing.JTextField();
        btnConUm = new javax.swing.JButton();
        btnConsultodoProd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnExcluirUm = new javax.swing.JButton();
        btnExcTodosProd = new javax.swing.JButton();
        txtExcluiProdID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("WV DATABASE | CONSULTAR PRODUTO | Versão 1.0.0 | 2018");
        setLocation(new java.awt.Point(360, 150));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Insira o Código:");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CÓDIGO", "NOME DO PRODUTO", "VALOR DO PRODUTO", "DESCRIÇÃO DO PRODUTO"
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblResultProduto)
                .addGap(579, 579, 579))
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(lblResultProduto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnConUm.setBackground(new java.awt.Color(0, 102, 102));
        btnConUm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConUm.setForeground(new java.awt.Color(204, 204, 204));
        btnConUm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupaPhoto2.png"))); // NOI18N
        btnConUm.setText("Consultar Produto");
        btnConUm.setToolTipText("INSIRA O CÓDIGO DO PRODUTO PARA CONSULTÁ - LO!");
        btnConUm.setBorder(null);
        btnConUm.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnConUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConUmActionPerformed(evt);
            }
        });

        btnConsultodoProd.setBackground(new java.awt.Color(0, 102, 102));
        btnConsultodoProd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConsultodoProd.setForeground(new java.awt.Color(204, 204, 204));
        btnConsultodoProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupaPhoto2.png"))); // NOI18N
        btnConsultodoProd.setText("Consultar Todos");
        btnConsultodoProd.setToolTipText("CLIQUE NO BOTÃO PARA CONSULTAR TODOS OS PRODUTOS!");
        btnConsultodoProd.setBorder(null);
        btnConsultodoProd.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnConsultodoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultodoProdActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo_WVTrata3.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btnExcluirUm.setBackground(new java.awt.Color(153, 0, 0));
        btnExcluirUm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExcluirUm.setForeground(new java.awt.Color(204, 204, 204));
        btnExcluirUm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lixo2.png"))); // NOI18N
        btnExcluirUm.setText("Excluir Produto");
        btnExcluirUm.setToolTipText("INSIRA O ID DO PRODUTO PARA EXCLUÍ - LO!");
        btnExcluirUm.setBorder(null);
        btnExcluirUm.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnExcluirUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirUmActionPerformed(evt);
            }
        });

        btnExcTodosProd.setBackground(new java.awt.Color(153, 0, 0));
        btnExcTodosProd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExcTodosProd.setForeground(new java.awt.Color(204, 204, 204));
        btnExcTodosProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lixo2.png"))); // NOI18N
        btnExcTodosProd.setText("Excluir Todos");
        btnExcTodosProd.setToolTipText("CLIQUE NO BOTÃO PARA EXCLUIR TODOS OS PRODUTOS!");
        btnExcTodosProd.setBorder(null);
        btnExcTodosProd.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnExcTodosProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcTodosProdActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Insira o ID: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumConsultaProd, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtExcluiProdID, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(btnConUm, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(btnExcluirUm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnConsultodoProd, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                    .addComponent(btnExcTodosProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(txtNumConsultaProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnConUm, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConsultodoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtExcluiProdID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnExcTodosProd, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(btnExcluirUm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(49, 49, 49)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void colunaTabela(DefaultTableModel tabelaModel){
        
        tabelaModel.addColumn("ID");
        tabelaModel.addColumn("CÓDIGO"); 
        tabelaModel.addColumn("NOME DO PRODUTO");
        tabelaModel.addColumn("VALOR DO PRODUTO");
        tabelaModel.addColumn("DESCRIÇÃO DO PRODUTO");
        
    }
    
    private void btnConUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConUmActionPerformed

         ProdutoDao pDao = new ProdutoDao();
         
         int codigo = Integer.parseInt(txtNumConsultaProd.getText());
         List<Produto> listProdCod = new ArrayList<Produto>();
         listProdCod = pDao.listarProdCod(codigo);
         
         DefaultTableModel tabelaModel = new DefaultTableModel();
         
         colunaTabela(tabelaModel);
         
         for(Produto listProdLocal : listProdCod){
             tabelaModel.addRow(new Object[]{
             
                 listProdLocal.getId(),
                 listProdLocal.getCodProd(),
                 listProdLocal.getNome(),
                 "R$ "+deci.format(listProdLocal.getValorProd()),
                 listProdLocal.getDescricao()
             });
         }
         jTable1.setModel(tabelaModel);
         jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
         jTable1.getColumnModel().getColumn(1).setPreferredWidth(75);
         jTable1.getColumnModel().getColumn(2).setPreferredWidth(150);
         jTable1.getColumnModel().getColumn(3).setPreferredWidth(150);
         jTable1.getColumnModel().getColumn(4).setPreferredWidth(180);
                       
    }//GEN-LAST:event_btnConUmActionPerformed

    private void btnConsultodoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultodoProdActionPerformed
        ProdutoDao pDao = new ProdutoDao();
        List<Produto> listaTodosProd = new ArrayList<Produto>();
        
        listaTodosProd = pDao.listarProduto();
        
        DefaultTableModel tabelaModel = new DefaultTableModel();
        
        colunaTabela(tabelaModel);
        
        for(Produto prodLocal : listaTodosProd){
            tabelaModel.addRow(new Object[]{
            
                prodLocal.getId(),
                prodLocal.getCodProd(),
                prodLocal.getNome(),
                "R$ "+deci.format(prodLocal.getValorProd()),
                prodLocal.getDescricao()
            });
        }
        jTable1.setModel(tabelaModel);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
         jTable1.getColumnModel().getColumn(1).setPreferredWidth(75);
         jTable1.getColumnModel().getColumn(2).setPreferredWidth(150);
         jTable1.getColumnModel().getColumn(3).setPreferredWidth(150);
         jTable1.getColumnModel().getColumn(4).setPreferredWidth(180);
    }//GEN-LAST:event_btnConsultodoProdActionPerformed


    private void btnExcTodosProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcTodosProdActionPerformed
      ProdutoDao pDao = new ProdutoDao();
      int excluiTodos = JOptionPane.showConfirmDialog(this, "Você quer mesmo excluir todos os produtos cadastrados?","Limpa Tela",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(excluiTodos == 0){
            pDao.excluirTodosProd();
        }
      
      
    }//GEN-LAST:event_btnExcTodosProdActionPerformed

    private void btnExcluirUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirUmActionPerformed
        ProdutoDao pDao = new ProdutoDao();
        int id = Integer.parseInt(txtExcluiProdID.getText());
        
        pDao.excluirProdutoID(id);
        /* Eu chamo a minha lista atualizada e logo em seguida o botao 
         * pra mostrar os produtos atualizados
         */
        pDao.listarProduto();
        btnConsultodoProdActionPerformed(evt);
        
    }//GEN-LAST:event_btnExcluirUmActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConUm;
    private javax.swing.JButton btnConsultodoProd;
    private javax.swing.JButton btnExcTodosProd;
    private javax.swing.JButton btnExcluirUm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblResultProduto;
    private javax.swing.JTextField txtExcluiProdID;
    private javax.swing.JTextField txtNumConsultaProd;
    // End of variables declaration//GEN-END:variables
}
