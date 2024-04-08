public class Lista{
   public int tamanho;
   public No cabeca;
   public No cauda;
   
   public Lista(){
      this.tamanho = 0;
      this.cabeca = new No();
      this.cauda = new No();
   }
   
   public void addElementoInicio(int valor){
      No novoNo = new No(valor);
      
      if(tamanho == 0){
         novoNo.proximo = cauda;
      }else{
         novoNo.proximo = cabeca.proximo;
      }
      cabeca.proximo = novoNo;
      tamanho++;
   }
   
   public void removeTail(){
      No atual = cabeca.proximo;
      
      while(atual.proximo.proximo != cauda){
         atual = atual.proximo;
      }
      
      atual.proximo = cauda;
   
   }
}
