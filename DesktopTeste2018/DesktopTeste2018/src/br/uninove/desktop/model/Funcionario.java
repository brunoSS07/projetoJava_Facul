package br.uninove.desktop.model;


public class Funcionario extends Pessoa{
    private String codFunc;
    private String data_admissao;
    private float salario;
    
    //construtor com 8 assinaturas
    public Funcionario(String nome, String cpf, String email, String telefone, String data_nasc, 
            String codFunc, String data_admissao,float salario){
        
          super(nome, cpf, email, telefone, data_nasc); 
          this.codFunc = codFunc;
          this.data_admissao = data_admissao;
          this.salario = salario;
    }

    public Funcionario() {
        super(null,null,null,null,null);
    }
    
   //GETTERS
    public String getCodFunc() {
        return codFunc;
    }
    public String getData_admissao() {
        return data_admissao;
    }
    public float getSalario() {
        return salario;
    }
    
    //SETTERS
    public void setCodFunc(String codFunc) {
        this.codFunc = codFunc;
    }
    public void setData_admissao(String data_admissao) {
        this.data_admissao = data_admissao;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
