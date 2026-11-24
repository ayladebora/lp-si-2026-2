package br.ufpb.dcx.ayla.atletas;

import java.util.List;

public class AtletaParaOlimpico extends Atleta{

    private String tipoAtletaParaolimpico;

    public AtletaParaOlimpico(String codigo, int idade, List<Telefone> telefones, String tipoAtletaParaolimpico) {
        super(codigo, idade, telefones);
        this.tipoAtletaParaolimpico = tipoAtletaParaolimpico;
    }

    public String getTipoAtletaParaolimpico(){
        return this.tipoAtletaParaolimpico;
    }
}
