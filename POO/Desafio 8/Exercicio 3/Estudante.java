public class Estudante {
    String nome;
    double nota1, nota2, nota3;
    public static final double NOTA_MINIMA_APROVACAO = 60;

    public double calcularNotaFinal() {
        return nota1 + nota2 + nota3;
    }

    public boolean estaAprovado() {
        return calcularNotaFinal() >= NOTA_MINIMA_APROVACAO;
    }

    public double pontosFaltantesParaAprovacao() {
        double notaMinima = NOTA_MINIMA_APROVACAO;
        double notaAtual = calcularNotaFinal();
        return estaAprovado() ? 0 : notaMinima - notaAtual;
    }
}