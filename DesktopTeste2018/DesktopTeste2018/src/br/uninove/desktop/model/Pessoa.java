package br.uninove.desktop.model;

public class Pessoa {
    private int id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String data_nasc;
    
    private Endereco endereco;
    
    //construtor com 5 assinaturas
    public Pessoa(String nome, String cpf, String email, String telefone, String data_nasc){
       this.nome = nome;
       this.cpf = cpf;
       this.email = email;
       this.telefone = telefone;
       this.data_nasc = data_nasc; 
    }
    
    //GETTERS
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEmail() {
        return email;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getData_nasc() {
        return data_nasc;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    
    //SETTERS
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
   
}
