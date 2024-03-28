import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        // Entrada de dados
        System.out.print("Digite o nome do funcionario: ");
        funcionario.nome = scanner.nextLine();

        System.out.print("Digite o salario bruto do funcionario: ");
        funcionario.salarioBruto = scanner.nextDouble();

        System.out.print("Digite a taxa de imposto (em decimal) do funcionario: ");
        funcionario.imposto = scanner.nextDouble();

        // Exibir dados do funcionário antes do aumento
        funcionario.imprimirDados();

        // Aumentar o salário
        System.out.print("\nDigite a porcentagem de aumento salarial: ");
        double porcentagemAumento = scanner.nextDouble();
        funcionario.aumentarSalario(porcentagemAumento);

        // Exibir dados do funcionário após o aumento
        funcionario.imprimirDados();
        
        
        scanner.close();
    }
}
