public class Lista{
   int tamanho;
   No cabeca;
   No cauda;
   
   public Lista(){
      tamanho = 0;
      cabeca = new No();
      cauda = new No();
      cabeca.proximo = cauda;
      cauda.anterior = cabeca;
   }
   
   public void inserirInicio(int valor){
      No novo = new No(valor);
      if(tamanho == 0){
         novo.proximo = cauda;
         cauda.anterior = novo;
      }else{
         novo.proximo = cabeca.proximo;
         cabeca.proximo.anterior = novo;
      }
      novo.anterior = cabeca;
      cabeca.proximo = novo;
      tamanho++;
   }
   
   public void inserirFinal(int valor){
      No novo = new No(valor);
      if(tamanho == 0){
         novo.proximo = cauda;
         cauda.anterior = novo;
         novo.anterior = cabeca;
         cabeca.proximo = novo;
      }else{
         novo.proximo = cauda;
         cauda.anterior.proximo = novo;
         novo.anterior = cauda.anterior;
         cauda.anterior = novo;
      }
      tamanho++;
   }
   
   public void imprimirReverso(){
      if(tamanho == 1){
         System.out.println(cabeca.proximo.valor);
      }else{
         No atual = cauda.anterior;
         while(atual != cabeca){
            System.out.print(atual.valor + "-->");
            atual = atual.anterior;
         }
      }  
      System.out.print("null"); 
   }
}
