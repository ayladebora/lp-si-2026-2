package br.ufpb.dcx.ayla.atletas;

import java.util.ArrayList;
import java.util.List;
public class MeuSistemaGerenciaDeAtletas implements SistemaGerenciaDeAtletas {
    private List<Atleta> atletas;

    public MeuSistemaGerenciaDeAtletas() {
        this.atletas = new ArrayList<>();
    }

    public void cadastrarAtleta(String codigoAtleta, int idade, List<Telefone> telefones) {

        //TODO
    }

    public boolean cadastrarTelefoneDeAtleta(String codigoAtleta, Telefone tel) {
        for (Atleta a : this.atletas) {
            if (a.getCodigo().equals(codigoAtleta)) {
                a.cadastraTelefone(tel);
                return true;
            }
        }
        return false;
    }//… Outros métodos da classe

    public List<Atleta> pesquisarAtletasComIdadeEntre(int idadeInferior, int idadeSuperior){
        List<Atleta> listaAtletasPorIdade = new ArrayList<>();
        for (Atleta a: this.atletas){
            if (a.getIdade()>=idadeInferior && a.getIdade()<=idadeSuperior){
                listaAtletasPorIdade.add(a);
            }
        }
        return listaAtletasPorIdade;
    }


    public int pesquisarMaiorIdadeDosAtletas(){
        return 0;
        //TODO
    }

    public boolean apagarTelefoneDeAtleta(String codigoAtleta, Telefone tel){
        //TODO
        return false;
    }


}
