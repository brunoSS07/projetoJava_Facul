package br.uninove.desktop.model;

public class Endereco {
    public String rua;
    public int numero;
    public String bairro;
    public String cidade;
    public String estado;
    public int cep;
    
    //construtor padrao
    public Endereco(){
    
    }
    
    //GETTERS
    public String getRua() {
        return rua;
    }
    public String getEstado() {
        return estado;
    }
    public int getNumero() {
        return numero;
    }
    public String getBairro() {
        return bairro;
    }
    public String getCidade() {
        return cidade;
    }
    public int getCep() {
        return cep;
    }
    
    
    //SETTERS
    public void setRua(String rua) {
        this.rua = rua;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setCep(int cep) {
        this.cep = cep;
    }
    
    
    
}
