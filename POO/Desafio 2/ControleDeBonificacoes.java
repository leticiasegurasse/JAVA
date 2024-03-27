public class ControleDeBonificacoes {
    private double totalDeBonificacoes;

    // Método para registrar bonificação paga a cada funcionário
    public void registrarBonificacaoPaga(Funcionario funcionario) {
        totalDeBonificacoes += funcionario.calcularBonificacao();
    }

    // Método para retornar o total de bonificações pagas
    public double getTotalDeBonificacoes() {
        return totalDeBonificacoes;
    }
}
