package br.ufpb.dcx.ayla.encomendas;
import java.util.List;
public class TestaSistemaControlePedidosDeLP {
    public static void main(String[] args) {
        SistemaControlePedidos sistema = new SistemaControlePedidosDeLP();
        try {
            sistema.cadastrarPedido("X111", "(83)97777-7777", "30 coxinhas e 100 brigadeiros",
                    "10/11/2026-08:00", false);
            sistema.cadastrarPedido("X100", "(83)99999-0000", "100 pastéis de forno de queijo",
                    "08/11/2026-18:00", true);
        } catch(PedidoJaExisteException e){
            System.out.println("Não cadastrou. Erro:"+ e.getMessage());
        }

        try {
            sistema.cadastrarPedido("X111", "(83)97777-7777", "30 coxinhas e 100 brigadeiros",
                    "10/11/2026-08:00", false);
        } catch(PedidoJaExisteException e){
            System.out.println("Não cadastrou. Erro:"+ e.getMessage());
        }

        System.out.println(sistema.pesquisarQuantidadeDePedidosDoCliente("(83)99999-0000"));
        List<Pedido> pedidosDoCliente2 = sistema.pesquisarPedidosDoCliente("(83)97777-7777");
        for (Pedido p : pedidosDoCliente2) {
            System.out.println(p.toString());
        }
        //TODO: completar a partir daqui

        try {
            boolean foiEntregue = sistema.pesquisarSePedidoFoiEntregue("X1111");
            if (foiEntregue){
                System.out.println("Pedido entregue");
            } else {
                System.out.println("Pedido não entregue");
            }
        } catch(PedidoNaoExisteException e){
            System.out.println("Erro interno");
            System.err.println(e.getMessage());
        }


    }
}

