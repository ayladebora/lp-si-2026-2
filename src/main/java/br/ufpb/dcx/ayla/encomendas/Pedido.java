package br.ufpb.dcx.ayla.encomendas;

public class Pedido {
    private String codigo;
    private String telefoneCliente;
    private String descricao;
    private String dataHoraEntrega;
    private boolean foiEntregue;


    public Pedido(String codigo, String telefoneCliente, String descricao,
                  String dataHoraEntrega, boolean foiEntregue) {
        this.codigo = codigo;
        this.telefoneCliente = telefoneCliente;
        this.descricao = descricao;
        this.dataHoraEntrega = dataHoraEntrega;
        this.foiEntregue = foiEntregue;
    }

    public String getTelefoneCliente(){
        return this.telefoneCliente;
    }

    public String getDataHoraEntrega(){
        return this.dataHoraEntrega;
    }

    public boolean foiEntregue(){
        return this.foiEntregue;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public String toString() {
        return "Pedido de código " + this.codigo + ": " + this.descricao + " para "
                + this.dataHoraEntrega;
    }
//… outros métodos da classe

    public String getDescricao(){
        return this.descricao;
    }

}
