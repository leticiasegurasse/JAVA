public class Programa{

   public static int[][] matriz = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
   };

   
   public static void imprimirSomaDiagonal(int[][] matriz){
      int soma = 0;
      for(int i=0; i< matriz.length; i++){
         soma += matriz[i][i];
         System.out.println("[" + matriz[i][i] + "]");
      }
      System.out.println("Soma: " + soma);
   }
   
   public static void main(String[] args){
      imprimirSomaDiagonal(matriz);
   }
}
