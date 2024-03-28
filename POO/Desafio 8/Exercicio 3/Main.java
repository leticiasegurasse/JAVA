import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Estudante aluno = new Estudante();

        // Entrada de dados
        System.out.print("Digite o nome do aluno: ");
        aluno.nome = scanner.nextLine();

        System.out.print("Digite a nota do primeiro trimestre: ");
        aluno.nota1 = scanner.nextDouble();

        System.out.print("Digite a nota do segundo trimestre: ");
        aluno.nota2 = scanner.nextDouble();

        System.out.print("Digite a nota do terceiro trimestre: ");
        aluno.nota3 = scanner.nextDouble();

        // Exibir resultado
        System.out.println("\nResultado para o aluno: " + aluno.nome);
        System.out.println("Nota final do ano: " + aluno.calcularNotaFinal());
        System.out.println("Situacao: " + (aluno.estaAprovado() ? "PASS" : "FAILED"));

        if (!aluno.estaAprovado()) {
            System.out.println("Pontos faltantes para aprovacao: " + aluno.pontosFaltantesParaAprovacao());
        }

        scanner.close();
    }
}
