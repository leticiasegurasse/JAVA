public class Funcionario {
    String nome;
    double salarioBruto;
    double imposto;

    public double calcularSalarioLiquido() {
        return salarioBruto - imposto;
    }

    public void aumentarSalario(double porcentagemAumento) {
        salarioBruto *= (1 + porcentagemAumento / 100);
    }
    
    public void imprimirDados(){
      System.out.println("\nDados do Funcionario:");
      System.out.println("Nome: " + nome);
      System.out.println("Salario Liquido: " + String.format("%.2f", calcularSalarioLiquido()));
    }
}