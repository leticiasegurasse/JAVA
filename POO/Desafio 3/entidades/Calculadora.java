package entidades;

public class Calculadora{

   // Método para calcular o percentual de um valor em relação a outro
    public static double calcularPercentual(double percentual, double valor) {
        return (percentual / 100) * valor;
    }
   
   // Método para calcular a regra de três
    public static double calcularRegraDeTres(double valor1, double valor2, double valorReferencia) {
        return (valorReferencia * valor2) / valor1;
    }
}
