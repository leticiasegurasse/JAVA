package aplicacao;

import entidades.ItemPedido;
import entidades.ProdutoFisico;
import entidades.Servico;
import entidades.Pedido;

public class Programa {
    public static void main(String[] args) {
        ProdutoFisico produto1 = new ProdutoFisico(1, "Camiseta", 29.99, 2, 0.2);
        Servico servico1 = new Servico(2, "Limpeza", 50.0, 1, 60);

        Pedido.registrarItemPedido(produto1); 
        Pedido.registrarItemPedido(servico1);
         
        System.out.println("Total de pedidos: " + Pedido.getNumeroPedido());
        System.out.println("Valor total do pedido: " + Pedido.getValorTotalPedido());
         
    }
}
