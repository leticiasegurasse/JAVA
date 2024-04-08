public class Fila{
   private int[] elementos;
   private static int TAMANHO_LIMITE = 10;
   private int topo;
   
   public Fila(){
      elementos = new int[TAMANHO_LIMITE];
      topo = -1;
   }
   
   public void inserirFim(int numero){
   if(topo+1 == TAMANHO_LIMITE){
      System.out.println("LISTA CHEIA");
      }else{
         elementos[++topo] = numero;
      }
   }
   
   public void removerInicio(){
      if(topo == -1){
         System.out.println("LISTA VAZIA");
      }else{
           for (int i = 0; i <= topo - 1; i++) {
                elementos[i] = elementos[i + 1];
            }
            elementos[topo] = 0;
            topo--;
         }
      }
      
      public void espiar(){
         for(int i = 0; i <= topo; i++){
            System.out.print(elementos[i] + " - ");
         }
      }
   }
