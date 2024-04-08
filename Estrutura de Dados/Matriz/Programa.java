public class Programa{

   public static int[][] matriz = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
   };

   public static int[][] matriz2 = {
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
   
   public static boolean verificarMatrizesSimetricas(int[][] matriz, int[][] matriz2){
      for(int i=0; i< matriz.length; i++){
         for(int j=0; j< matriz[i].length; j++){
            if(matriz[i][j] != matriz2[i][j]){
               return false;
            }
         }
      }
      return true;
   }
   
   public static void transporMatriz(int[][] matriz){
      int linhas = matriz.length;
      int colunas = matriz[0].length;
        
      int[][] matrizTransposta = new int[colunas][linhas];
      
      for(int i=0; i< matriz.length; i++){
         for(int j=0; j< matriz[i].length; j++){
            matrizTransposta[j][i] = matriz[i][j];
         }
      }
      System.out.println("Matriz Transposta");
      imprimirMatriz(matrizTransposta);
      
   }
   
   public static void inverterColunas(int[][] matriz){
      int linhas = matriz.length;
      int colunas = matriz[0].length;
        
      int[][] matrizinvertida = new int[colunas][linhas];
      
      for(int i=0; i< matriz.length; i++){
         for(int j=0; j< matriz[i].length; j++){
            matrizinvertida[i][j] = matriz[i][matriz[i].length - 1 - j];
         }
      }
      System.out.println("Matriz Coluna Invertida");
      imprimirMatriz(matrizinvertida);
   }
   
   public static void inverterLinhas(int[][] matriz){
      int linhas = matriz.length;
      int colunas = matriz[0].length;
        
      int[][] matrizinvertida = new int[colunas][linhas];
      
      for(int i=0; i< matriz.length; i++){
         for(int j=0; j< matriz[i].length; j++){
            matrizinvertida[i][j] = matriz[matriz.length - 1 - i][j];
         }
      }
      System.out.println("Matriz Linha Invertida");
      imprimirMatriz(matrizinvertida);
   }
   
   public static void rotacionarMatriz90(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        
        int[][] matrizRotacionada = new int[colunas][linhas];
        
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizRotacionada[j][linhas - i - 1] = matriz[i][j];
            }
        }
        
        System.out.println("Matriz Rotacionada 90");
        imprimirMatriz(matrizRotacionada);
    }

   public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    
   
   public static void main(String[] args){
      imprimirSomaDiagonal(matriz);
      
      System.out.println("As matrizes sao simetricas? " + verificarMatrizesSimetricas(matriz, matriz2));
      
      transporMatriz(matriz);
      
      System.out.println("Matriz:");
      imprimirMatriz(matriz);
      
      inverterColunas(matriz);
      
      inverterLinhas(matriz);
      
      rotacionarMatriz90(matriz);
   }
}
