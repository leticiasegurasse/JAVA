package entidades;

public class Servico extends ItemPedido{
   public int tempoDuracaoServico;
   
   public Servico(int codigo, String descricao, double preco, int quantidade, int tempoDuracaoServico){
      super(codigo, descricao, preco, quantidade);
      this.tempoDuracaoServico = tempoDuracaoServico;
   }
}
