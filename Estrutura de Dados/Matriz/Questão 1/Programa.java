public class Programa{

   public static int[][] matriz = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
   };
   
   public static void imprimirDiagonal(int[][] matriz){
      for(int i=0; i< matriz.length; i++){
         System.out.println("[" + matriz[i][i] + "]");
      
      }
   
   }

   public static void main(String[] args){
      imprimirDiagonal(matriz);
   }
}
