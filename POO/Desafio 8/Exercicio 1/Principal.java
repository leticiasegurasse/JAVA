import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        Retangulo retangulo = new Retangulo();

        // Entrada de dados
        System.out.print("Digite a largura do retangulo: ");
        retangulo.largura = scanner.nextDouble();

        System.out.print("Digite a altura do retangulo: ");
        retangulo.altura = scanner.nextDouble();

        // Calcular e exibir resultados
        System.out.println("Area do retangulo: " + retangulo.calcularArea());
        System.out.println("Perimetro do retangulo: " + retangulo.calcularPerimetro());
        System.out.println("Diagonal do retangulo: " + retangulo.calcularDiagonal());

        scanner.close();
    }
}
