package entidades;

public class ItemPedido{
   public int codigo;
   public String descricao;
   public double preco;
   public int quantidade;
   
   public ItemPedido(int codigo, String descricao, double preco, int quantidade){
      this.codigo = codigo;
      this.descricao = descricao;
      this.preco = preco;
      this.quantidade = quantidade;
   }
   
   public double calcularTotal(){
      return quantidade * preco;
   }
   
   public int getCodigo(){
      return codigo;
   }
   
   public void setCodigo(int codigo){
      this.codigo = codigo;
   }
   
   public String getDescricao(){
      return descricao;
   }
   
   public void setDescricao(String descricao){
      this.descricao = descricao;
   }
   
   public double getPreco(){
      return preco;
   }
   
   public void setPreco(double preco){
      this.preco = preco;
   }
   
   public int getQuantidade(){
      return quantidade;
   }
   
   public void setQuantidade(int quantidade){
      this.quantidade = quantidade;
   }
   
   
   
   
}
