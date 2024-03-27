package aplicacao;

import entidades.Calculadora;

public class Programa{
   public static void main(String[] args) {
        double percentual = 5;
        double valor = 750.00;
        double resultadoPercentual = Calculadora.calcularPercentual(percentual, valor);
        System.out.println("O " + percentual + "% de " + valor + " eh: " + resultadoPercentual);

        double valor1 = 10;
        double valor2 = 20;
        double valorReferencia = 30;
        double resultadoRegraDeTres = Calculadora.calcularRegraDeTres(valor1, valor2, valorReferencia);
        System.out.println("O resultado da regra de tres eh " + resultadoRegraDeTres);
    }
}
