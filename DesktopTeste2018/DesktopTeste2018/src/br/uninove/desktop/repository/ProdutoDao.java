package br.uninove.desktop.repository;

import br.uninove.desktop.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProdutoDao {
    
    public boolean inserirProduto(Produto prod){
        boolean retorno = false;
        
        String sqlQuery = ("INSERT INTO produto(codProd, nomeProd, valorProd, descProd)"+
                "VALUES(?, ?, ?, ?)");
        
        Connection cnn = ConexaoDAO.obterConexao();
        PreparedStatement ps;
        if(cnn != null){
        try {
            ps = cnn.prepareStatement(sqlQuery);
            ps.setInt(1, prod.getCodProd());
            ps.setString(2, prod.getNome());
            ps.setFloat(3, prod.getValorProd());
            ps.setString(4, prod.getDescricao());
            ps.execute();
            
            retorno = true;
            JOptionPane.showMessageDialog(null, "PRODUTO CADASTRADO COM SUCESSO!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception ao inserir produtos!\n\n"+ex.getMessage());
        }finally{
            try {
                cnn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Exception ao fechar a conexao!\n\n"+ex.getMessage());
            }
        }
      }
        return retorno;
        
    }
    
    
    public List<Produto> listarProduto(){
        
        ArrayList<Produto> listaTodosProdutos = new ArrayList<Produto>();
        /* Fazendo com que minha busca fique ordenada.
         * Se quiser crescente, coloco asc depois do id. 
         * Se quiser decrescente, coloco  desc depois do id. 
         */
        String sqlQuery = "SELECT * FROM produto order by id";
        Connection cnn = ConexaoDAO.obterConexao();
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            ps = cnn.prepareStatement(sqlQuery);
            rs = ps.executeQuery();
            
            while(rs.next()){
            Produto prod = new Produto();
            prod.setId(rs.getInt("id"));
            prod.setCodProd(rs.getInt("codProd"));
            prod.setNome(rs.getString("nomeProd"));
            prod.setValorProd(rs.getFloat("valorProd"));
            prod.setDescricao(rs.getString("descProd"));
            
            listaTodosProdutos.add(prod);
            }
            cnn.close();
            rs.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception ao listar produtos!\n\n" +ex.getMessage() );
            return null;
        }
        return listaTodosProdutos;
    }
    
    public List<Produto> listarProdCod(int codigo){
        ArrayList<Produto> listProdCod = new ArrayList<Produto>();
        String sqlQuery = "SELECT * FROM produto WHERE codProd = ? order by id";
        Connection cnn = ConexaoDAO.obterConexao();
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            ps = cnn.prepareStatement(sqlQuery);
            ps.setInt(1, codigo);
            rs = ps.executeQuery();
            
            while(rs.next()){
            Produto prod = new Produto();
            
            prod.setId(rs.getInt("id"));
            prod.setCodProd(rs.getInt("codProd"));
            prod.setNome(rs.getString("nomeProd"));
            prod.setValorProd(rs.getFloat("valorProd"));
            prod.setDescricao(rs.getString("descProd"));
            
            listProdCod.add(prod);
            }
            //feha a conexao
            cnn.close();
            rs.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception ao consultar produto!!\n\n" + ex.getMessage());
        }
        return listProdCod;
    }
    
    public List<Produto> listarProdID(int id){
        ArrayList<Produto> listProdID = new ArrayList<Produto>();
        String sqlQuery = "SELECT * FROM produto WHERE id = ?";
        Connection cnn = ConexaoDAO.obterConexao();
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            ps = cnn.prepareStatement(sqlQuery);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            while(rs.next()){
            Produto prod = new Produto();
            
            prod.setId(rs.getInt("id"));
            prod.setCodProd(rs.getInt("codProd"));
            prod.setNome(rs.getString("nomeProd"));
            prod.setValorProd(rs.getFloat("valorProd"));
            prod.setDescricao(rs.getString("descProd"));
            
            listProdID.add(prod);
            }
            //feha a conexao
            cnn.close();
            rs.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception ao consultar o produto!!\n\n" + ex.getMessage());
        }
        return listProdID;
    }
    
    public boolean excluirProdutoID(int id){
        boolean retorno = false;
        String sqlQuery = "DELETE FROM produto WHERE id =? ";
        Connection cnn = ConexaoDAO.obterConexao();
        PreparedStatement ps;
        
        try {
            ps = cnn.prepareStatement(sqlQuery);
            
            ps.setInt(1, id);
            ps.executeUpdate();
            retorno = true;
            JOptionPane.showMessageDialog(null, "PRODUTO FOI EXCLUÍDO!!\n\nAtualize a página");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception ao excluir o produto!!\n\n"+ex.getMessage());
        }finally{
            try {
                cnn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Exception ao fechar a conexão!!\n\n"+ex.getMessage());
            }
        }
        return retorno;
    }
    
    
    public boolean excluirTodosProd(){
        boolean retorno = false;
        String sqlQuery = "TRUNCATE TABLE produto";
        Connection cnn = ConexaoDAO.obterConexao();
        PreparedStatement ps;
        
        try {
            ps = cnn.prepareStatement(sqlQuery);
            ps.executeUpdate();
            retorno = true;
            JOptionPane.showMessageDialog(null, "PRODUTOS FORAM EXCLUÍDOS!!\n");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception ao excluir os produtos!!\n"+ex.getMessage());
        }finally{
            try {
                cnn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Exception ao fechar a conexão!!\n"+ex.getMessage());
            }
        }
        return retorno;
    }
    
    
    public boolean alterarProduto(Produto prod){
        boolean retorno = false;
         String sqlQuery = "UPDATE produto SET codProd = ?, nomeProd = ?, valorProd = ?, descProd = ? WHERE id = ?";
         Connection cnn = ConexaoDAO.obterConexao();
         PreparedStatement ps;
         
         if(cnn!= null){
             try {
                 ps = cnn.prepareStatement(sqlQuery);
                 ps.setInt(1, prod.getCodProd());
                 ps.setString(2, prod.getNome());
                 ps.setFloat(3, prod.getValorProd());
                 ps.setString(4, prod.getDescricao());
                 
                 ps.setInt(5, prod.getId());
                 
                 ps.executeUpdate();
                 retorno = true;
                 JOptionPane.showMessageDialog(null, "Alteração do produto feito com SUCESSO!!\n");
             } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, "Exception ao alterar o produto!!\n\n"+ex.getMessage());
             }finally{
                 try {
                     cnn.close();
                 } catch (SQLException ex) {
                     JOptionPane.showMessageDialog(null, "Exception ao fechar conexão!!\n\n"+ex.getMessage());
                 }
             }
         }
         return retorno;
    }
    
}
