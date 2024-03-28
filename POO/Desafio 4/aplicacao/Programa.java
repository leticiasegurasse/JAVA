package aplicacao;

import entidades.ManipulacaoString;
import java.util.Scanner;

public class Programa{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Digite uma palavra: ");
      String palavra = scanner.nextLine();
      
      int vogais = ManipulacaoString.contarVogais(palavra);
      System.out.println("Numero de vogais na string: " + vogais);

      String invertida = ManipulacaoString.inverterString(palavra);
      System.out.println("String invertida: " + invertida);

      boolean palindromo = ManipulacaoString.verificarPalindromo(palavra);
      System.out.println("Eh um palindromo? " + (palindromo ? "Sim" : "Nao"));

      scanner.close();
   }
}
