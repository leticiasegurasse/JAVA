package entidades;

public class Pedido {
    private static int numeroPedido = 0; 
    private static double valorTotalPedido = 0;

    public static void registrarItemPedido(ItemPedido pedido) {
        numeroPedido++;
        valorTotalPedido += pedido.calcularTotal();
    }

    public static double getValorTotalPedido() {
        return valorTotalPedido;
    }
    
    public static int getNumeroPedido() {
        return numeroPedido;
    }
}
