package br.ufpb.dcx.ayla.atletas;

import java.util.List;

/**
 * Sistema para gerenciar atletas de um campeonato
 */
public interface SistemaGerenciaDeAtletas {
    /**
     * Adiciona um novo atleta no conjunto de atletas gerenciados pelo sistema.
     * @param codigoAtleta O código do atleta a cadastrar
     * @param idade A idade do novo atleta a cadastrar
     * @param telefones A lista dos telefones do atleta sendo cadastrado.
     */
    public void cadastrarAtleta(String codigoAtleta, int idade, List<Telefone> telefones);
    public List<Atleta> pesquisarAtletasComIdadeEntre(int idadeInferior, int idadeSuperior);
    public int pesquisarMaiorIdadeDosAtletas();
    public boolean cadastrarTelefoneDeAtleta(String codigoAtleta, Telefone tel);
    public boolean apagarTelefoneDeAtleta(String codigoAtleta, Telefone tel);
}

