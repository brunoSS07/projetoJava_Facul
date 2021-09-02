package br.uninove.desktop.model;

public class Venda extends Produto{
    private int Quantidade;
    private double preco;
    private float totProduto;
    private float totVenda;
    
    //GETTERS
    public int getQuantidade() {
        return Quantidade;
    }
    public double getPreco() {
        return preco;
    }
    public float getTotProduto() {
        return totProduto;
    }
    
    //SETTERS
    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setTotProduto(float totProduto) {
        this.totProduto = totProduto;
    }
    public void setTotVenda(float totVenda) {
        this.totVenda = totVenda;
    }
}
