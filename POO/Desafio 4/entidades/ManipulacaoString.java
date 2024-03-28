package entidades;

public class ManipulacaoString{
   // Método para contar o número de vogais em uma string
    public static int contarVogais(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char aux = Character.toLowerCase(str.charAt(i));
            if (aux == 'a' || aux == 'e' || aux == 'i' || aux == 'o' || aux == 'u') {
                count++;
            }
        }
        return count;
    }
   
   // Método para inverter uma string
    public static String inverterString(String str) {
        StringBuilder reverso = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverso.append(str.charAt(i));
        }
        return reverso.toString();
    }
   
   public static boolean verificarPalindromo(String str){
      String strInvertida = inverterString(str);
      
      return str.equalsIgnoreCase(strInvertida);
   }
}
