package br.ufpb.dcx.ayla.atletas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestaGravador {
    public static void main(String [] args){
        List<Atleta> atletasList  = new ArrayList<>();
        atletasList.add(new Atleta("CX12227", 20, new ArrayList<>()));
        atletasList.add(new Atleta("ZZ123", 15, new ArrayList<>()));
        GravadorDeAtletas gravador = new GravadorDeAtletas();
        try {
            gravador.gravarAtletas(atletasList);
            System.out.println("Dados salvos com sucesso");
        } catch(IOException e){
            System.out.println("Dados não salvos");
            e.printStackTrace();
        }
    }
}
