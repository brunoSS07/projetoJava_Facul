package br.uninove.desktop.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/projeto2018";
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    
   public static Connection obterConexao(){
       Connection cnn = null;
       try {
           cnn = DriverManager.getConnection(URL,USUARIO,SENHA);
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "EXCEPTION: "+ex.getMessage());
       }
       return cnn;
   }
}
