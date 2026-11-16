package br.ufpb.dcx.ayla.encomendas;

import java.util.ArrayList;
import java.util.List;


public class SistemaControlePedidosDeLP implements SistemaControlePedidos{
    private List<Pedido> pedidos;
    public SistemaControlePedidosDeLP(){
        this.pedidos = new ArrayList<>();
    }


    public List<Pedido> pesquisarPedidosDoCliente(String telefoneCliente) {
        List<Pedido> pedidosPesq = new ArrayList<>();
        for (Pedido pedido : this.pedidos) {
            if (pedido.getTelefoneCliente().equals(telefoneCliente)) {
                pedidosPesq.add(pedido);
            }
        }
        return pedidosPesq;
    }//… Outros métodos da classe

    public int pesquisarQuantidadeDePedidosDoCliente(String telefoneCliente){
        int total = 0;
        for (Pedido p: this.pedidos){
            if (p.getTelefoneCliente().equals(telefoneCliente)){
                total+=1;
            }
        }
        return total;
    }

    public boolean pesquisarSePedidoFoiEntregue(String codigoPedido) throws PedidoNaoExisteException{
        for (Pedido p: this.pedidos){
            if (p.getCodigo().equals(codigoPedido)){
                return p.foiEntregue();
            }
        }
        throw new PedidoNaoExisteException("Não existe pedido com o código "+ codigoPedido);
    }

    public List<Pedido> pesquisarPedidosNaoEntregues(){
        List<Pedido> pedidosNaoEntregues = new ArrayList<>();
        for (Pedido p: this.pedidos){
            if (!p.foiEntregue()){
                pedidosNaoEntregues.add(p);
            }
        }
        return pedidosNaoEntregues;
    }

    public List<Pedido> pesquisarPedidosParaHorario(String dataHoraEntrega){
        List<Pedido> pedidosHora = new ArrayList<>();
        for (Pedido p: this.pedidos){
            if (p.getDataHoraEntrega().equals(dataHoraEntrega)){
                pedidosHora.add(p);
            }
        }
        return pedidosHora;
    }

    public void cadastrarPedido(String codigo, String telefoneCliente, String descricao,
                                String dataHoraEntrega, boolean foiEntregue)
                                throws PedidoJaExisteException{
        if (!existePedidoComCodigo(codigo)) {
            Pedido p = new Pedido(codigo, telefoneCliente, descricao, dataHoraEntrega, foiEntregue);
            this.pedidos.add(p);
        } else {
            throw new PedidoJaExisteException("Já existe pedido com o código "+ codigo);
        }
    }

    public boolean existePedidoComCodigo(String codigo){
        for (Pedido p: this.pedidos){
            if (p.getCodigo().equals(codigo)){
                return true;
            }
        }
        return false;
    }


}
