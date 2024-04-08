public class No{
   public int valor;
   public No proximo;
   public No anterior;
   
   public No(){}
   
   public No(int valor){
      this.valor = valor;
      proximo = null;
      anterior = null;
   }

}
