public class Programa{
   public static void main(String[] args){
   Fila array = new Fila();
     
   array.inserirFim(25);
   array.inserirFim(56);
   array.inserirFim(47);
   array.inserirFim(93);
   array.inserirFim(5);
   
   array.removerInicio();
   array.removerInicio();
   
   
   array.inserirFim(15);
   array.inserirFim(36);
   
   array.espiar();
   }
}
