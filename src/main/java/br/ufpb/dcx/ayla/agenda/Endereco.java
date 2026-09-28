package br.ufpb.dcx.ayla.agenda;

public class Endereco {
    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco(String logradouro, String numero, String bairro, String cidade, String estado){
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public Endereco(){
        this("","","","", "");
    }

    public String getCidade(){
        return this.cidade;
    }

    public Endereco(String logradouro){
        this(logradouro, "S/N", "", "Rio Tinto", "PB");
    }

    public String toString(){
        return this.logradouro+", "+ this.numero+" - "+ this.bairro+" - "+
                this.cidade+"-"+this.estado;
    }




}
