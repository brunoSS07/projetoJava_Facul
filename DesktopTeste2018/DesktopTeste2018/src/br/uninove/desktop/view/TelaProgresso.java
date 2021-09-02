/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uninove.desktop.view;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JProgressBar;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class TelaProgresso extends javax.swing.JFrame {

    private Timer t;
    private ActionListener ac;
    private int x = 0;
    
    public TelaProgresso() {
        /*Maneira de mudar a cor da barra de progresso
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaProgresso.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(TelaProgresso.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TelaProgresso.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TelaProgresso.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        initComponents();
        
        this.setLocationRelativeTo(null);
        ac = new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                //cria um obejto da tela de login
                TelaDeLogin tL = new TelaDeLogin();
                //atribui mais 1 a variavel do tempo, é isso q vai fazer o valor mudar(avançar)
                x = x+1;
                
                //passando o valor para a barra de progresso. Isso faz a barra correr
                getLoadingBar().setValue(x);
                
               /* passando o valor para a string e convertendo para string, é isso q vai 
                * fazer a o valor mudar na tela e junto concateno com o sinal de porcentagem
                */
                loadingNum.setText(Integer.toString(x)+"%");
                
                
                
                    if((getLoadingBar().getValue()== 100) & (loadingNum.getText().equals("100%"))){
                        //condicao caso a barra e a porcentagem chegue a 100%
                        t.stop();
                        dispose();
                        tL.setVisible(true);
                        
                        //situacao caso nao chegue a 100%
                        }else if(loadingNum.getText().equals("1%")){
                            lblCarregando.setText("Carregando");
                        }else if(loadingNum.getText().equals("3%")){
                            lblCarregando.setText("Carregando.");
                        }else if(loadingNum.getText().equals("6%")){
                            lblCarregando.setText("Carregando..");
                        }else if(loadingNum.getText().equals("9%")){
                            lblCarregando.setText("Carregando...");
                        }else if(loadingNum.getText().equals("12%")){
                            lblCarregando.setText("Carregando");
                        }else if(loadingNum.getText().equals("15%")){
                            lblCarregando.setText("Carregando.");
                        }else if(loadingNum.getText().equals("18%")){
                            lblCarregando.setText("Carregando..");
                        } else if(loadingNum.getText().equals("21%")){
                            lblCarregando.setText("Carregando...");
                        } else if(loadingNum.getText().equals("24%")){
                            lblCarregando.setText("Carregando");
                        }else if(loadingNum.getText().equals("27%")){
                            lblCarregando.setText("Carregando.");
                        }else if(loadingNum.getText().equals("30%")){
                            lblCarregando.setText("Carregando..");
                        }else if(loadingNum.getText().equals("33%")){
                            lblCarregando.setText("Carregando...");
                        }else if(loadingNum.getText().equals("36%")){
                            lblCarregando.setText("Carregando");
                        } else if(loadingNum.getText().equals("39%")){
                            lblCarregando.setText("Carregando.");
                        }else if(loadingNum.getText().equals("42%")){
                            lblCarregando.setText("Carregando..");
                        } else if(loadingNum.getText().equals("45%")){
                            lblCarregando.setText("Carregando...");
                        } else if(loadingNum.getText().equals("48%")){
                            lblCarregando.setText("Carregando");
                        } else if(loadingNum.getText().equals("51%")){
                            lblCarregando.setText("Carregando.");
                        } else if(loadingNum.getText().equals("54%")){
                            lblCarregando.setText("Carregando..");
                        } else if(loadingNum.getText().equals("57%")){
                            lblCarregando.setText("Carregando...");
                        } else if(loadingNum.getText().equals("60%")){
                            lblCarregando.setText("Carregando");
                        } else if(loadingNum.getText().equals("63%")){
                            lblCarregando.setText("Carregando.");
                        } else if(loadingNum.getText().equals("66%")){
                            lblCarregando.setText("Carregando..");
                        } else if(loadingNum.getText().equals("69%")){
                            lblCarregando.setText("Carregando...");
                        } else if(loadingNum.getText().equals("69%")){
                            lblCarregando.setText("Carregando");
                        } else if(loadingNum.getText().equals("72%")){
                            lblCarregando.setText("Carregando.");
                        } else if(loadingNum.getText().equals("75%")){
                            lblCarregando.setText("Carregando..");
                        } else if(loadingNum.getText().equals("78%")){
                            lblCarregando.setText("Carregando...");
                        } else if(loadingNum.getText().equals("81%")){
                            lblCarregando.setText("Carregando");
                        } else if(loadingNum.getText().equals("84%")){
                            lblCarregando.setText("Carregando.");
                        } else if(loadingNum.getText().equals("87%")){
                            lblCarregando.setText("Carregando..");
                        } else if(loadingNum.getText().equals("90%")){
                            lblCarregando.setText("Carregando...");
                        } else if(loadingNum.getText().equals("93%")){
                            lblCarregando.setText("ABRINDO TELA!!!");
                        } 
                    
            }   
        };
        t = new Timer(10, ac);
        t.start();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        loadingNum = new javax.swing.JLabel();
        loadingBar = new javax.swing.JProgressBar();
        lblCarregando = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WV DATABASE | Versão 1.0.0 | 2018 ");
        setLocation(new java.awt.Point(400, 100));
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(0, 204, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo_WVTrata3.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "WEB VISUAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 102, 51))); // NOI18N

        loadingNum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loadingNum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loadingNum.setText("99%");

        loadingBar.setBackground(new java.awt.Color(204, 204, 204));
        loadingBar.setForeground(new java.awt.Color(51, 204, 0));

        lblCarregando.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCarregando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCarregando.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(loadingNum)
                .addGap(196, 196, 196))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(loadingBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(lblCarregando)))
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(loadingNum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loadingBar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCarregando, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        setBounds(0, 0, 452, 355);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaProgresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProgresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProgresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProgresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProgresso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCarregando;
    private javax.swing.JProgressBar loadingBar;
    public javax.swing.JLabel loadingNum;
    // End of variables declaration//GEN-END:variables
    
    
    public JProgressBar getLoadingBar() {
        return loadingBar;
    }

    public void setLoadingBar(JProgressBar loadingBar) {
        this.loadingBar = loadingBar;
    }
}

