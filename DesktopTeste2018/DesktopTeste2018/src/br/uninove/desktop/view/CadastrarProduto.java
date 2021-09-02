package br.uninove.desktop.view;

import javax.swing.JOptionPane;
import br.uninove.desktop.model.Produto;
import br.uninove.desktop.repository.ProdutoDao;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CadastrarProduto extends javax.swing.JFrame {
    DecimalFormat deci = new DecimalFormat("0.00");
    Produto produto = new Produto();
    ProdutoDao pDao = new ProdutoDao();
    
            
    public CadastrarProduto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodProd = new javax.swing.JTextField();
        txtNomeProd = new javax.swing.JTextField();
        txtValorProd = new javax.swing.JTextField();
        btnIncluirProd = new javax.swing.JButton();
        btnLimparProd = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtArDesc = new javax.swing.JTextArea();
        lblLogo = new javax.swing.JLabel();
        btnConsutProd = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtInseriProdID = new javax.swing.JTextField();
        btnAltProd = new javax.swing.JButton();
        btnMostrarProd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("WV DATABASE | CADASTRAR E ALTERAR PRODUTO | Versão 1.0.0 | 2018");
        setLocation(new java.awt.Point(365, 150));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Código do Produto:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome do Produto:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Valor do Produto:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Descrição do Produto:");

        btnIncluirProd.setBackground(new java.awt.Color(0, 102, 102));
        btnIncluirProd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIncluirProd.setForeground(new java.awt.Color(204, 204, 204));
        btnIncluirProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadMod1.png"))); // NOI18N
        btnIncluirProd.setText("Cadastrar");
        btnIncluirProd.setToolTipText("INSIRA OS DADOS DO PRODUTO NOS CAMPOS AO LADO E CLIQUE NO BOTÃO!");
        btnIncluirProd.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnIncluirProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirProdActionPerformed(evt);
            }
        });

        btnLimparProd.setBackground(new java.awt.Color(204, 204, 0));
        btnLimparProd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLimparProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/limpar2Mod.png"))); // NOI18N
        btnLimparProd.setText("Limpar");
        btnLimparProd.setToolTipText("CLIQUE AQUI PARA LIMPAR OS DADOS PREENCHIDOS!");
        btnLimparProd.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnLimparProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparProdActionPerformed(evt);
            }
        });

        txtArDesc.setColumns(20);
        txtArDesc.setRows(5);
        jScrollPane3.setViewportView(txtArDesc);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo_WVTrata3.png"))); // NOI18N
        lblLogo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btnConsutProd.setBackground(new java.awt.Color(0, 102, 102));
        btnConsutProd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConsutProd.setForeground(new java.awt.Color(204, 204, 204));
        btnConsutProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupaPhoto2.png"))); // NOI18N
        btnConsutProd.setText("Consultar");
        btnConsutProd.setToolTipText("CLIQUE AQUI PARA ABRIR A TELA DE CONSULTA!");
        btnConsutProd.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnConsutProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsutProdActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Insira o ID:");

        btnAltProd.setBackground(new java.awt.Color(0, 153, 153));
        btnAltProd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAltProd.setForeground(new java.awt.Color(102, 102, 102));
        btnAltProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar2Mod.png"))); // NOI18N
        btnAltProd.setText("Alterar");
        btnAltProd.setToolTipText("INSIRA O ID DO PRODUTO NO CAMPO AO LADO, PREENCHA OS CAMPOS COM OS DADOS NOVOS E CLIQUE NO BOTÃO!");
        btnAltProd.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnAltProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltProdActionPerformed(evt);
            }
        });

        btnMostrarProd.setBackground(new java.awt.Color(0, 153, 153));
        btnMostrarProd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMostrarProd.setForeground(new java.awt.Color(102, 102, 102));
        btnMostrarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mostrar2Mod.png"))); // NOI18N
        btnMostrarProd.setText("Mostrar");
        btnMostrarProd.setToolTipText("INSIRA O ID DO PRODUTO NO CAMPO AO LADO E CLIQUE NO BOTÃO PARA MOSTRAR OS DADOS NOS CAMPOS AO LADO!");
        btnMostrarProd.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnMostrarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarProdActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("OBS: Insira o ID somente para ALTERAÇÃO! ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtValorProd, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(txtNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txtInseriProdID, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAltProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMostrarProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 9, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLogo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnIncluirProd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConsutProd))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnLimparProd, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnConsutProd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIncluirProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimparProd)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMostrarProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAltProd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInseriProdID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparProdActionPerformed
        // limpar todos os campos
        int opc = JOptionPane.showConfirmDialog(this,"Você quer mesmo Limpar?","LIMPAR TELA",
                  JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(opc == 0){
            txtCodProd.setText("");
            txtArDesc.setText("");
            txtValorProd.setText("");
            txtNomeProd.setText("");
            txtCodProd.grabFocus();
        }
    }//GEN-LAST:event_btnLimparProdActionPerformed

    private void btnIncluirProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirProdActionPerformed
        
        
        int codigo = Integer.parseInt(txtCodProd.getText());
        String nomeProd = txtNomeProd.getText();
        float vlrProd = Float.valueOf(txtValorProd.getText());
        String descricao = txtArDesc.getText();
        
        produto.setCodProd(codigo);
        produto.setNome(nomeProd);
        produto.setValorProd(vlrProd);
        produto.setDescricao(descricao);
        
        pDao.inserirProduto(produto);
        
    }//GEN-LAST:event_btnIncluirProdActionPerformed

    private void btnConsutProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsutProdActionPerformed
        ConsultarProduto consuProd = new ConsultarProduto();
        
        consuProd.setVisible(true);
                
    }//GEN-LAST:event_btnConsutProdActionPerformed

    private void btnMostrarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarProdActionPerformed
        List<Produto> listProd = new ArrayList<Produto>();
        
        int idProd = Integer.parseInt(txtInseriProdID.getText());
        
        listProd = pDao.listarProdID(idProd);
        
        for(int indice = 0; indice < listProd.size();indice++){
            Produto prod = (Produto) listProd.get(indice);
            txtCodProd.setText(Integer.toString(prod.getCodProd()));
            txtNomeProd.setText(prod.getNome());
            //pasando o valor pra duas casas decimais
            String valorProd = deci.format(prod.getValorProd());
            txtValorProd.setText(valorProd);
            txtArDesc.setText(prod.getDescricao());
            
        }
    }//GEN-LAST:event_btnMostrarProdActionPerformed

    private void btnAltProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltProdActionPerformed
       int codigo = Integer.parseInt(txtCodProd.getText());
        String nomeProd = txtNomeProd.getText();
        float vlrProd = Float.valueOf(txtValorProd.getText());
        String descricao = txtArDesc.getText();
    
        int idProd = Integer.parseInt(txtInseriProdID.getText());
        
        produto.setId(idProd);
        
        produto.setCodProd(codigo);
        produto.setNome(nomeProd);
        produto.setValorProd(vlrProd);
        produto.setDescricao(descricao);
        
        pDao.alterarProduto(produto);
        
    }//GEN-LAST:event_btnAltProdActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltProd;
    private javax.swing.JButton btnConsutProd;
    private javax.swing.JButton btnIncluirProd;
    private javax.swing.JButton btnLimparProd;
    private javax.swing.JButton btnMostrarProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JTextArea txtArDesc;
    private javax.swing.JTextField txtCodProd;
    private javax.swing.JTextField txtInseriProdID;
    private javax.swing.JTextField txtNomeProd;
    private javax.swing.JTextField txtValorProd;
    // End of variables declaration//GEN-END:variables
}
