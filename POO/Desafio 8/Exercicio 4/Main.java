import java.util.Scanner;

public class Main{
    // Método para executar o programa
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe os numeros:");
        System.out.print("Primeiro numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Segundo numero: ");
        double num2 = scanner.nextDouble();

        System.out.println("Digite a operacao a ser feita, soma (+), subtracao (-), multiplicacao (*) e divisao (/)");
        System.out.print("Operacao: ");
        char operacao = scanner.next().charAt(0);

        // Construtor com parâmetros
        Calculadora calculadora = new Calculadora(num1, num2, operacao);

        // Imprimir o resultado
        System.out.printf("Resultado: %.2f %c %.2f = %.2f%n", calculadora.getNumero1(),
                calculadora.getOperacao(), calculadora.getNumero2(), calculadora.calcular());

        scanner.close();
   }
}
