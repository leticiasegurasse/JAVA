package entidades;

public class ProdutoFisico extends ItemPedido{
   public double peso;
   
   public ProdutoFisico(int codigo, String descricao, double preco, int quantidade, double peso){
      super(codigo, descricao, preco, quantidade);
      this.peso = peso;
   }
}
