public class Programa{
   public static void main(String[] args){
      Lista lista = new Lista();
      
      lista.addElementoInicio(5);
      lista.addElementoInicio(10);
      lista.addElementoInicio(1);
      lista.addElementoInicio(9);
      lista.addElementoInicio(7);
      
      lista.removeTail();
   }

}
