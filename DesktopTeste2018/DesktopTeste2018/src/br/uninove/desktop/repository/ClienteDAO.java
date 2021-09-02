package br.uninove.desktop.repository;

import br.uninove.desktop.model.Cliente;
import br.uninove.desktop.model.Endereco;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClienteDAO {
    
    public boolean inserirCliente(Cliente cliente){
        boolean retorno = false;
        
        String sqlQuery = ("INSERT INTO `projeto2018`.`cliente`(`nome`,`dataNasc`,`telefone`,`cpf`,`email`,`rua`,`numero`,`bairro`,`cidade`,`estado`,`cep`)"+
                "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        
        Connection cnn = ConexaoDAO.obterConexao();
        PreparedStatement ps;
        if(cnn != null){
            try {
                ps = cnn.prepareStatement(sqlQuery);
                ps.setString(1, cliente.getNome());
                ps.setString(2, cliente.getData_nasc());
                ps.setString(3, cliente.getTelefone());
                ps.setString(4, cliente.getCpf());
                ps.setString(5, cliente.getEmail());
                //Utilizo o metodo getEndereco() para poder pegar os valores da classe Endereco
                ps.setString(6, cliente.getEndereco().getRua());
                ps.setInt(7, cliente.getEndereco().getNumero());
                ps.setString(8, cliente.getEndereco().getBairro());
                ps.setString(9, cliente.getEndereco().getCidade());
                ps.setString(10, cliente.getEndereco().getEstado());
                ps.setInt(11, cliente.getEndereco().getCep());
                
                ps.execute();
                retorno = true;
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Exception ao inserir cliente ao banco!\n\n"+ ex.getMessage());
            }finally{
                try {
                    cnn.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Exception ao fechar a conexao!\n\n"+ ex.getMessage());
                }
            }
        }JOptionPane.showMessageDialog(null, "cliente cadastrado com SUCESSO!!!");
        return retorno;
    }
    
    public List<Cliente> listarCliente(){
        
        ArrayList<Cliente> listaTodosClientes = new ArrayList<Cliente>();
        String sqlQuery = "SELECT * FROM cliente order by id";
        Connection cnn = ConexaoDAO.obterConexao();
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            ps = cnn.prepareStatement(sqlQuery);
            rs = ps.executeQuery();
            
            while(rs.next()){
            Cliente cli = new Cliente();
            Endereco end = new Endereco();
            
            cli.setId(rs.getInt("id"));
            cli.setNome(rs.getString("nome"));
            cli.setData_nasc(rs.getString("dataNasc"));
            cli.setTelefone(rs.getString("telefone"));
            cli.setCpf(rs.getString("cpf"));
            cli.setEmail(rs.getString("email"));
            //utilizo o objeto do tipo Endereco para setar o dados
            end.setRua(rs.getString("rua"));
            end.setNumero(rs.getInt("numero"));
            end.setBairro(rs.getString("bairro"));
            end.setCidade(rs.getString("cidade"));
            end.setEstado(rs.getString("estado"));
            end.setCep(rs.getInt("cep"));
            
            //todas as informacoes do endereco eu seto para a classe cliente
            cli.setEndereco(end);
            //todas as informacoes do cliente vao para a lista, por isso eu setei o objeto end para cliente
            listaTodosClientes.add(cli);
            }
            cnn.close();
            rs.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception ao listar clientes!\n\n" +ex.getMessage() );
            return null;
        }
        return listaTodosClientes;
    }
    
    
    public List<Cliente> listarClienteNome(String nome){
        ArrayList<Cliente> listCliNome = new ArrayList<Cliente>();
        String sqlQuery = "SELECT * FROM cliente WHERE nome like? order by id";
        Connection cnn = ConexaoDAO.obterConexao();
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            ps = cnn.prepareStatement(sqlQuery);
            ps.setString(1, "%"+nome+"%");
            rs = ps.executeQuery();
            while(rs.next()){
            Cliente cli = new Cliente();
            Endereco end = new Endereco();
            
            cli.setId(rs.getInt("id"));
            cli.setNome(rs.getString("nome"));
            cli.setData_nasc(rs.getString("dataNasc"));
            cli.setTelefone(rs.getString("telefone"));
            cli.setCpf(rs.getString("cpf"));
            cli.setEmail(rs.getString("email"));
            //utilizo o objeto do tipo Endereco para setar o dados
            end.setRua(rs.getString("rua"));
            end.setNumero(rs.getInt("numero"));
            end.setBairro(rs.getString("bairro"));
            end.setCidade(rs.getString("cidade"));
            end.setEstado(rs.getString("estado"));
            end.setCep(rs.getInt("cep"));
            
            cli.setEndereco(end);
            
            listCliNome.add(cli);
            }
            //feha a conexao
            cnn.close();
            rs.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "EXception ao consultar cliente!!\n\n" + ex.getMessage());
        }
        return listCliNome;
    }
    
    
    public List<Cliente> listarClienteID(int id){
        ArrayList<Cliente> listaCliID = new ArrayList<Cliente>();
        String sqlQuery = "SELECT * FROM cliente WHERE id =?";
        Connection cnn = ConexaoDAO.obterConexao();
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            ps = cnn.prepareStatement(sqlQuery);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while(rs.next()){
            Cliente cli = new Cliente();
            Endereco end = new Endereco();
            
            cli.setId(rs.getInt("id"));
            cli.setNome(rs.getString("nome"));
            cli.setData_nasc(rs.getString("dataNasc"));
            cli.setTelefone(rs.getString("telefone"));
            cli.setCpf(rs.getString("cpf"));
            cli.setEmail(rs.getString("email"));
            //utilizo o objeto do tipo Endereco para setar o dados
            end.setRua(rs.getString("rua"));
            end.setNumero(rs.getInt("numero"));
            end.setBairro(rs.getString("bairro"));
            end.setCidade(rs.getString("cidade"));
            end.setEstado(rs.getString("estado"));
            end.setCep(rs.getInt("cep"));
            
            cli.setEndereco(end);
            
            listaCliID.add(cli);
            }
            //feha a conexao
            cnn.close();
            rs.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception ao consultar cliente!!\n\n" + ex.getMessage());
        }
        return listaCliID;
    }
    
    public boolean excluirCliID(int id){
        boolean retorno = false;
        String sqlQuery = "DELETE FROM cliente WHERE id =? ";
        Connection cnn = ConexaoDAO.obterConexao();
        PreparedStatement ps;
        
        try {
            ps = cnn.prepareStatement(sqlQuery);
            
            ps.setInt(1, id);
            ps.executeUpdate();
            retorno = true;
            JOptionPane.showMessageDialog(null, "CLIENTE FOI EXCLUÍDO!!\n");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception ao excluir o cliente!!\n"+ex.getMessage());
        }finally{
            try {
                cnn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Exception ao fechar a conexão!!\n"+ex.getMessage());
            }
        }
        return retorno;
    }
    
    
    public boolean excluirTodosCli(){
        boolean retorno = false;
        String sqlQuery = "TRUNCATE TABLE cliente";
        Connection cnn = ConexaoDAO.obterConexao();
        PreparedStatement ps;
        
        try {
            ps = cnn.prepareStatement(sqlQuery);
            ps.executeUpdate();
            retorno = true;
            JOptionPane.showMessageDialog(null, "CLIENTES FORAM EXCLUÍDOS!!\n");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception ao excluir os clientes!!\n"+ex.getMessage());
        }finally{
            try {
                cnn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Exception ao fechar a conexão!!\n"+ex.getMessage());
            }
        }
        return retorno;
    }
    
    
    public boolean alterarCliente(Cliente cli){
        boolean retorno = false;
         String sqlQuery = "UPDATE cliente SET nome = ?,dataNasc = ?, telefone = ?, cpf = ?, email = ?, rua = ?, numero = ?, bairro = ?, cidade = ?, estado = ?, cep = ? WHERE id = ?";
         Connection cnn = ConexaoDAO.obterConexao();
         PreparedStatement ps;
         
         if(cnn!= null){
             try {
                 ps = cnn.prepareStatement(sqlQuery);
                 ps.setString(1, cli.getNome());
                 ps.setString(2, cli.getData_nasc());
                 ps.setString(3, cli.getTelefone());
                 ps.setString(4, cli.getCpf());
                 ps.setString(5, cli.getEmail());
                 ps.setString(6, cli.getEndereco().getRua());
                 ps.setInt(7, cli.getEndereco().getNumero());
                 ps.setString(8, cli.getEndereco().getBairro());
                 ps.setString(9, cli.getEndereco().getCidade());
                 ps.setString(10, cli.getEndereco().getEstado());
                 ps.setInt(11, cli.getEndereco().getCep());
                 
                 ps.setInt(12, cli.getId());
                 
                 ps.executeUpdate();
                 retorno = true;
                 JOptionPane.showMessageDialog(null, "Alteração do cliente feito com SUCESSO!!\n");
             } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, "Exception ao alterar o cliente!!\n\n"+ex.getMessage());
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
