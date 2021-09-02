package br.uninove.desktop.repository;

import br.uninove.desktop.model.Endereco;
import br.uninove.desktop.model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FuncionarioDAO {
    public boolean inserirFuncionario(Funcionario func){
        boolean retorno = false;
        String sqlQuery = ("INSERT INTO `projeto2018`.`funcionario`(`nome`, `dataNasc`,`dataAdm`, `cpf`, `email`, `salario`, `codFunc`, `telefone`, `rua`, `numero`, `bairro`, `cidade`, `estado`, `cep`)"+"VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        Connection cnn = ConexaoDAO.obterConexao();
        PreparedStatement ps;
        
        if(cnn !=null){
            try {
                ps = cnn.prepareStatement(sqlQuery);
                ps.setString(1, func.getNome());
                ps.setString(2, func.getData_nasc());
                ps.setString(3, func.getData_admissao());
                ps.setString(4, func.getCpf());
                ps.setString(5, func.getEmail());
                ps.setFloat(6, func.getSalario());
                ps.setString(7, func.getCodFunc());
                ps.setString(8, func.getTelefone());
                ps.setString(9, func.getEndereco().getRua());
                ps.setInt(10, func.getEndereco().getNumero());
                ps.setString(11, func.getEndereco().getBairro());
                ps.setString(12, func.getEndereco().getCidade());
                ps.setString(13, func.getEndereco().getEstado());
                ps.setInt(14, func.getEndereco().getCep());
                
                ps.execute();
                retorno = true;
                JOptionPane.showMessageDialog(null, "Cadastrado com SUCESSO!!\n");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Exception ao inserir funcionário!!\n"+ex.getMessage());
            }finally{
                try {
                    cnn.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Exception ao fechar a conexão!!\n"+ex.getMessage());
                }
            }
        }
        return retorno;
    }
    
    
    public List<Funcionario> listaFuncionario(){
        ArrayList<Funcionario> listarFuncionario = new ArrayList<Funcionario>();
        String sqlQuery = "SELECT * FROM funcionario order by id";
        Connection cnn = ConexaoDAO.obterConexao();
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            ps = cnn.prepareStatement(sqlQuery);
            rs = ps.executeQuery();
            while(rs.next()){
                Funcionario func = new Funcionario();
                Endereco end = new Endereco();
                
            func.setId(rs.getInt("id"));
            func.setNome(rs.getString("nome"));
            func.setData_nasc(rs.getString("dataNasc"));
            func.setData_admissao(rs.getString("dataAdm"));
            func.setCpf(rs.getString("cpf"));
            func.setEmail(rs.getString("email"));
            func.setSalario(rs.getFloat("salario"));
            func.setCodFunc(rs.getString("codFunc"));
            func.setTelefone(rs.getString("telefone"));
            
            end.setRua(rs.getString("rua"));
            end.setNumero(rs.getInt("numero"));
            end.setBairro(rs.getString("bairro"));
            end.setCidade(rs.getString("cidade"));
            end.setEstado(rs.getString("estado"));
            end.setCep(rs.getInt("cep"));
            
            func.setEndereco(end);
            
            listarFuncionario.add(func);
            }
            cnn.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception ao listar funcionários!\n\n" +ex.getMessage() );
            return null;
        }
        return listarFuncionario;
    }
    
    
    public List<Funcionario> listarFuncNome(String nome){
        ArrayList<Funcionario> listFuncNome = new ArrayList<Funcionario>();
        String sqlQuery = "SELECT * FROM funcionario WHERE nome like? order by id";
        Connection cnn = ConexaoDAO.obterConexao();
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            ps = cnn.prepareStatement(sqlQuery);
            ps.setString(1,"%"+nome+"%");
            rs = ps.executeQuery();
            while(rs.next()){
            Funcionario func = new Funcionario();
            Endereco end = new Endereco();
            
            func.setId(rs.getInt("id"));
            func.setNome(rs.getString("nome"));
            func.setData_nasc(rs.getString("dataNasc"));
            func.setData_admissao(rs.getString("dataAdm"));
            func.setCpf(rs.getString("cpf"));
            func.setEmail(rs.getString("email"));
            func.setSalario(rs.getFloat("salario"));
            func.setCodFunc(rs.getString("codFunc"));
            func.setTelefone(rs.getString("telefone"));
            
            end.setRua(rs.getString("rua"));
            end.setNumero(rs.getInt("numero"));
            end.setBairro(rs.getString("bairro"));
            end.setCidade(rs.getString("cidade"));
            end.setEstado(rs.getString("estado"));
            end.setCep(rs.getInt("cep"));
            
            func.setEndereco(end);
            
            listFuncNome.add(func);
            }
            //fecha a conexao
            cnn.close();
            rs.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception ao consultar funcionário!!\n\n" + ex.getMessage());
        }
        return listFuncNome;
    }
    
    public List<Funcionario> listarFuncID(int id){
        ArrayList<Funcionario> listaFuncID = new ArrayList<Funcionario>();
        String sqlQuery = "SELECT * FROM funcionario WHERE id =?";
        Connection cnn = ConexaoDAO.obterConexao();
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            ps = cnn.prepareStatement(sqlQuery);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while(rs.next()){
            Funcionario func = new Funcionario();
            Endereco end = new Endereco();
            
            func.setId(rs.getInt("id"));
            func.setNome(rs.getString("nome"));
            func.setData_nasc(rs.getString("dataNasc"));
            func.setData_admissao(rs.getString("dataAdm"));
            func.setCpf(rs.getString("cpf"));
            func.setEmail(rs.getString("email"));
            func.setSalario(rs.getFloat("salario"));
            func.setCodFunc(rs.getString("codFunc"));
            func.setTelefone(rs.getString("telefone"));
            
            end.setRua(rs.getString("rua"));
            end.setNumero(rs.getInt("numero"));
            end.setBairro(rs.getString("bairro"));
            end.setCidade(rs.getString("cidade"));
            end.setEstado(rs.getString("estado"));
            end.setCep(rs.getInt("cep"));
            
            func.setEndereco(end);
            
            listaFuncID.add(func);
            }
            //feha a conexao
            cnn.close();
            rs.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception ao consultar funcionário!!\n\n" + ex.getMessage());
        }
        return listaFuncID;
    }
    
    
    public boolean excluirFuncID(int id){
        boolean retorno = false;
        String sqlQuery = "DELETE FROM funcionario WHERE id =? ";
        Connection cnn = ConexaoDAO.obterConexao();
        PreparedStatement ps;
        
        try {
            ps = cnn.prepareStatement(sqlQuery);
            
            ps.setInt(1, id);
            ps.executeUpdate();
            retorno = true;
            JOptionPane.showMessageDialog(null, "FUNCIONÁRIO FOI EXCLUÍDO!!\n");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception ao excluir o Funcionário!!\n"+ex.getMessage());
        }finally{
            try {
                cnn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Exception ao fechar a conexão!!\n"+ex.getMessage());
            }
        }
        return retorno;
    }
    
    
    public boolean excluirTodosFunc(){
        boolean retorno = false;
        String sqlQuery = "TRUNCATE TABLE funcionario";
        Connection cnn = ConexaoDAO.obterConexao();
        PreparedStatement ps;
        
        try {
            ps = cnn.prepareStatement(sqlQuery);
            ps.executeUpdate();
            retorno = true;
            JOptionPane.showMessageDialog(null, "FUNCIONÁRIOS FORAM EXCLUÍDOS!!\n");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception ao excluir os Funcionários!!\n"+ex.getMessage());
        }finally{
            try {
                cnn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Exception ao fechar a conexão!!\n"+ex.getMessage());
            }
        }
        return retorno;
    }
    
    
    public boolean alterarFuncionario(Funcionario func){
        boolean retorno = false;
         String sqlQuery = "UPDATE funcionario SET nome = ?, dataNasc = ?, dataAdm = ?, cpf = ?, email = ?, salario = ?, codFunc = ?, telefone = ?, rua = ?, numero = ?, bairro = ?, cidade = ?, estado = ?, cep = ? WHERE id =?";
         Connection cnn = ConexaoDAO.obterConexao();
         PreparedStatement ps;
         
         if(cnn!= null){
             try {
                 ps = cnn.prepareStatement(sqlQuery);
                 ps.setString(1, func.getNome());
                 ps.setString(2, func.getData_nasc());
                 ps.setString(3, func.getData_admissao());
                 ps.setString(4, func.getCpf());
                 ps.setString(5, func.getEmail());
                 ps.setFloat(6, func.getSalario());
                 ps.setString(7, func.getCodFunc());
                 ps.setString(8, func.getTelefone());
                 ps.setString(9, func.getEndereco().getRua());
                 ps.setInt(10, func.getEndereco().getNumero());
                 ps.setString(11, func.getEndereco().getBairro());
                 ps.setString(12, func.getEndereco().getCidade());
                 ps.setString(13, func.getEndereco().getEstado());
                 ps.setInt(14, func.getEndereco().getCep());
                 
                 ps.setInt(15, func.getId());
                 
                 ps.executeUpdate();
                 
                 retorno = true;
                 
                 JOptionPane.showMessageDialog(null, "Alteração do funcionário feito com SUCESSO!!\n");
             } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, "Exception ao alterar o funcionário!!\n\n"+ex.getMessage());
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
