package br.ufpb.dcx.ayla.atletas;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GravadorDeAtletas {

    private String nomeArquivoAtletas;

    public GravadorDeAtletas(String nomeArquivo){
        this.nomeArquivoAtletas = nomeArquivo;
    }

    public GravadorDeAtletas(){
        this("atletas.txt");
    }

    public void gravarAtletas(List<Atleta> atletas)
        throws IOException {
        BufferedWriter escritor = null;
        try {
            escritor = new BufferedWriter(new FileWriter(this.nomeArquivoAtletas));
            for (Atleta a: atletas){
                escritor.write(a.getCodigo()+"###"+a.getIdade()+"\n");
            }
        } finally {
            if (escritor!=null){
                escritor.close();
            }
        }

    }


}
