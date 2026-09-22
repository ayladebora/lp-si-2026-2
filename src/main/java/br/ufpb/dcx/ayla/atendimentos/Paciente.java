package br.ufpb.dcx.ayla.atendimentos;

public class Paciente {

    private String nome;
    private String cpf;
    private String dataNascimento;
    private Endereco endereco;

    public Paciente(){
        this.nome = "Sem nome";
        this.cpf = "Sem cpf";
        this.dataNascimento = "01/01/2001";
        this.endereco = new Endereco();
    }

    public Paciente(String nome, String cpf, String dataNascimento){
        this.nome = nome;
        this.cpf= cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = new Endereco();
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }



    public Endereco getEndereco(){
        return this.endereco;
    }

    public String toString(){
        return "Paciente de nome " + this.nome+ " e CPF "+this.cpf;
    }

}
