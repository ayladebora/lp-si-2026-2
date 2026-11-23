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

    public void cadastrarTelefoneDeAtleta(String codigoAtleta, Telefone tel)
            throws AtletaNaoExisteException{
        boolean cadastrou = false;
        for (Atleta a : this.atletas) {
            if (a.getCodigo().equals(codigoAtleta)) {
                a.cadastraTelefone(tel);
                cadastrou = true;
                break;
            }
        }
        if (!cadastrou) {
            throw new AtletaNaoExisteException("Não existe atleta com o código " + codigoAtleta);
        }
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
