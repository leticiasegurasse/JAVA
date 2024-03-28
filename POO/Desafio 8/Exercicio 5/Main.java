import java.util.Scanner;

public class Main{
   // Método para executar programa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe os dados da pessoa:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Dia nascimento: ");
        int diaNascimento = scanner.nextInt();
        System.out.print("Mes nascimento: ");
        int mesNascimento = scanner.nextInt();
        System.out.print("Ano nascimento: ");
        int anoNascimento = scanner.nextInt();
        System.out.print("Sexo (F/M): ");
        char sexo = scanner.next().charAt(0);

        Pessoa pessoa = new Pessoa(nome, diaNascimento, mesNascimento, anoNascimento, sexo);
        
        System.out.println("");
        
        System.out.println("Informe a data atual:");
        System.out.print("Dia: ");
        int diaAtual = scanner.nextInt();
        System.out.print("Mes: ");
        int mesAtual = scanner.nextInt();
        System.out.print("Ano: ");
        int anoAtual = scanner.nextInt();
        
        System.out.println("");

        pessoa.calculaIdade(diaAtual, mesAtual, anoAtual);
        pessoa.exibeDados();

        scanner.close();
    }
}
