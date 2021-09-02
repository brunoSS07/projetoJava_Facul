package br.uninove.desktop.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.Timer;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblHora = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMnVendas = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMnProdutos = new javax.swing.JMenu();
        jMnCadastrarProduto = new javax.swing.JMenuItem();
        jMnConsultarProduto = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMnClientes = new javax.swing.JMenu();
        jMnCadastrarCliente = new javax.swing.JMenuItem();
        jMnAltCadCli = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMnFuncionarios = new javax.swing.JMenu();
        jMnCadFunc = new javax.swing.JMenuItem();
        jMnAltCadFunc = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMnEstoque = new javax.swing.JMenu();
        jMnConsuEst = new javax.swing.JMenuItem();
        jMnSair = new javax.swing.JMenu();
        jMnItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WV DATABASE | Versão 1.0.0 | 2018");
        setLocation(new java.awt.Point(200, 75));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logoMenuAtua2.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblHora.setBackground(new java.awt.Color(204, 204, 255));
        lblHora.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        lblHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHora.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lblData.setBackground(new java.awt.Color(204, 204, 255));
        lblData.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        lblData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblData.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setMargin(new java.awt.Insets(10, 10, 10, 10));

        jMnVendas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMnVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/dinheiroMod3.png"))); // NOI18N
        jMnVendas.setText("Vendas");
        jMnVendas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMnVendas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMnVendas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/nVMod.png"))); // NOI18N
        jMenuItem1.setText("Nova Venda");
        jMenuItem1.setBorder(null);
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMnVendas.add(jMenuItem1);

        jMenuBar1.add(jMnVendas);

        jMnProdutos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMnProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtosMod3.png"))); // NOI18N
        jMnProdutos.setText("Produtos");
        jMnProdutos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMnProdutos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMnProdutos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jMnCadastrarProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMnCadastrarProduto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMnCadastrarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadMod1.png"))); // NOI18N
        jMnCadastrarProduto.setText("Cadastrar Produto");
        jMnCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnCadastrarProdutoActionPerformed(evt);
            }
        });
        jMnProdutos.add(jMnCadastrarProduto);

        jMnConsultarProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMnConsultarProduto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMnConsultarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupaPhoto2.png"))); // NOI18N
        jMnConsultarProduto.setText("Consultar Produto");
        jMnConsultarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnConsultarProdutoActionPerformed(evt);
            }
        });
        jMnProdutos.add(jMnConsultarProduto);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar2Mod.png"))); // NOI18N
        jMenuItem2.setText("Alterar Produto");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMnProdutos.add(jMenuItem2);

        jMenuBar1.add(jMnProdutos);

        jMnClientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/clientesMod3.png"))); // NOI18N
        jMnClientes.setText("Clientes");
        jMnClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMnClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMnClientes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jMnCadastrarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMnCadastrarCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMnCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadMod1.png"))); // NOI18N
        jMnCadastrarCliente.setText("Cadastrar Cliente");
        jMnCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnCadastrarClienteActionPerformed(evt);
            }
        });
        jMnClientes.add(jMnCadastrarCliente);

        jMnAltCadCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMnAltCadCli.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMnAltCadCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupaPhoto2.png"))); // NOI18N
        jMnAltCadCli.setText("Consultar Cliente");
        jMnAltCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnAltCadCliActionPerformed(evt);
            }
        });
        jMnClientes.add(jMnAltCadCli);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar2Mod.png"))); // NOI18N
        jMenuItem3.setText("Alterar Cliente");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMnClientes.add(jMenuItem3);

        jMenuBar1.add(jMnClientes);

        jMnFuncionarios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMnFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcMod3.png"))); // NOI18N
        jMnFuncionarios.setText("Funcionarios");
        jMnFuncionarios.setAlignmentX(2);
        jMnFuncionarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMnCadFunc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMnCadFunc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMnCadFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadMod1.png"))); // NOI18N
        jMnCadFunc.setText("Cadastrar Funcionário");
        jMnCadFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnCadFuncActionPerformed(evt);
            }
        });
        jMnFuncionarios.add(jMnCadFunc);

        jMnAltCadFunc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMnAltCadFunc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMnAltCadFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupaPhoto2.png"))); // NOI18N
        jMnAltCadFunc.setText("Consultar Funcionário");
        jMnAltCadFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnAltCadFuncActionPerformed(evt);
            }
        });
        jMnFuncionarios.add(jMnAltCadFunc);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar2Mod.png"))); // NOI18N
        jMenuItem4.setText("Alterar Funcionário");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMnFuncionarios.add(jMenuItem4);

        jMenuBar1.add(jMnFuncionarios);

        jMnEstoque.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMnEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/estoqueMod3.png"))); // NOI18N
        jMnEstoque.setText("Estoque");
        jMnEstoque.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMnEstoque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMnEstoque.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jMnConsuEst.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMnConsuEst.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMnConsuEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupaPhoto2.png"))); // NOI18N
        jMnConsuEst.setText("Consultar Estoque");
        jMnConsuEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnConsuEstActionPerformed(evt);
            }
        });
        jMnEstoque.add(jMnConsuEst);

        jMenuBar1.add(jMnEstoque);

        jMnSair.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sairMod1.png"))); // NOI18N
        jMnSair.setText("Sair");
        jMnSair.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMnSair.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMnSair.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMnSair.setMargin(new java.awt.Insets(0, 10, 0, 0));

        jMnItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMnItemSair.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMnItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lixo2.png"))); // NOI18N
        jMnItemSair.setText("Sair");
        jMnItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnItemSairActionPerformed(evt);
            }
        });
        jMnSair.add(jMnItemSair);

        jMenuBar1.add(jMnSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMnItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMnItemSairActionPerformed

    private void jMnCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnCadastrarProdutoActionPerformed
        //indo pra tela cadastrar produto 
        CadastrarProduto telaCadProd = new CadastrarProduto();
        telaCadProd.setVisible(true);
    }//GEN-LAST:event_jMnCadastrarProdutoActionPerformed

    private void jMnConsultarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnConsultarProdutoActionPerformed
        //indo pra tela cadastrar produto 
        ConsultarProduto telaConsulProd = new ConsultarProduto();
        telaConsulProd.setVisible(true);
    }//GEN-LAST:event_jMnConsultarProdutoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        NovaVenda nV = new NovaVenda();
         nV.setVisible(true);
    
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMnCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnCadastrarClienteActionPerformed
        CadastrarCliente cadCli = new CadastrarCliente();
        
        cadCli.setVisible(true);
    }//GEN-LAST:event_jMnCadastrarClienteActionPerformed

    private void jMnAltCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnAltCadCliActionPerformed
        ConsultarCliente altCli = new ConsultarCliente();
        
        altCli.setVisible(true);
    }//GEN-LAST:event_jMnAltCadCliActionPerformed

    private void jMnCadFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnCadFuncActionPerformed
       CadastrarFuncionario cadFunc = new CadastrarFuncionario();
       
       cadFunc.setVisible(true);
    }//GEN-LAST:event_jMnCadFuncActionPerformed

    private void jMnAltCadFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnAltCadFuncActionPerformed
        ConsultarFuncionario altFunc = new ConsultarFuncionario();
        
        altFunc.setVisible(true);
    }//GEN-LAST:event_jMnAltCadFuncActionPerformed

    private void jMnConsuEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnConsuEstActionPerformed
        ConsultarEstoque consuEst = new ConsultarEstoque();
        
        consuEst.setVisible(true);
    }//GEN-LAST:event_jMnConsuEstActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = formatar.format(data);
        lblData.setText(dataFormatada);
        
        Timer timer = new Timer(1000, new hora());
        timer.start();
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CadastrarProduto altProduto = new CadastrarProduto();
        
        altProduto.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        CadastrarCliente altCliente = new CadastrarCliente();
        
        altCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        CadastrarFuncionario cadFunc = new CadastrarFuncionario();
        
        cadFunc.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMnAltCadCli;
    private javax.swing.JMenuItem jMnAltCadFunc;
    private javax.swing.JMenuItem jMnCadFunc;
    private javax.swing.JMenuItem jMnCadastrarCliente;
    private javax.swing.JMenuItem jMnCadastrarProduto;
    private javax.swing.JMenu jMnClientes;
    private javax.swing.JMenuItem jMnConsuEst;
    private javax.swing.JMenuItem jMnConsultarProduto;
    private javax.swing.JMenu jMnEstoque;
    private javax.swing.JMenu jMnFuncionarios;
    private javax.swing.JMenuItem jMnItemSair;
    private javax.swing.JMenu jMnProdutos;
    private javax.swing.JMenu jMnSair;
    private javax.swing.JMenu jMnVendas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblHora;
    // End of variables declaration//GEN-END:variables

   class hora implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            
               java.util.Calendar now = java.util.Calendar.getInstance();
            lblHora.setText(String.format("%1$tH:%1$tM:%1$tS",now));
            
        }
    }
}
