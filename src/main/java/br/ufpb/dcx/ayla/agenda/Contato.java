package br.ufpb.dcx.ayla.agenda;

public class Contato {
    private String nome;
    private Endereco endereco;

    public Contato(){
        this("", new Endereco());
    }

    public Contato(String nome, Endereco endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome(){
        return this.nome;
    }

    public Endereco getEndereco(){
        return this.endereco;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public String toString(){
        return this.nome+", que mora na cidade " + this.endereco.getCidade();
    }
}
