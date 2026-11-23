package br.ufpb.dcx.ayla.atletas;

public class AtletaNaoExisteException extends Exception{

    public AtletaNaoExisteException(String mensagem){
        super(mensagem);
    }

    public AtletaNaoExisteException(){
        super("Erro: Atleta não existe");
    }
}
