package br.uninove.desktop.model;

public class Cliente extends Pessoa{
     public String data_compra;

     public Cliente(String nome, String cpf,String email,String telefone,String data_nasc){
     super(nome, cpf, email, telefone, data_nasc);
     
     }

    public Cliente() {
        super(null, null, null, null, null);
    }

    
     //GETTER 
    public String getData_compra() {
        return data_compra;
    }

    //SETTER
    public void setData_compra(String data_compra) {
        this.data_compra = data_compra;
    }
     
     
}
