package br.uninove.desktop.model;

import java.text.DecimalFormat;


public class Produto {
    private int id;
    private int codProd;
    private String nome;
    private float valorProd;
    private String descricao;
    DecimalFormat deci = new DecimalFormat("0.00");
    
    public Produto(){
    
    }
    
    //GETTERS
    public int getId() {
        return id;
    }
    public int getCodProd() {
        return codProd;
    }
    public String getNome() {
        return nome;
    }
    public float getValorProd() {
        deci.format(valorProd);
        return valorProd;
    }
    public String getDescricao() {
        return descricao;
    }
    
    //SETTERS
    public void setId(int id) {
        this.id = id;
    }
    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setValorProd(float valorProd) {
        
        this.valorProd = valorProd;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
   
    
    public String mostrarProd(){
    String dados="";
    dados += "\t - Codigo do Produto: "+codProd+"\n";
    dados += "\t - Nome do Produto: "+nome+"\n";
    dados += "\t - Valor do Produto: R$ "+deci.format(valorProd)+"\n";
    dados += "\t - Descrição do Produto: "+descricao+"\n";
    return dados;
    }
    
}
