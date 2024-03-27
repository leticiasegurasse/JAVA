public class Gerente extends Funcionario {
    private int quantidadeFuncionariosGerenciados;
    private String senha;

    // Construtor padrão
    public Gerente() {}

    // Construtor parametrizado
    public Gerente(String nome, String cpf, double salario, int quantidadeFuncionariosGerenciados, String senha) {
        super(nome, cpf, salario);
        this.quantidadeFuncionariosGerenciados = quantidadeFuncionariosGerenciados;
        this.senha = senha;
    }

    // Getters e Setters
    public int getQuantidadeFuncionariosGerenciados() {
        return quantidadeFuncionariosGerenciados;
    }

    public void setQuantidadeFuncionariosGerenciados(int quantidadeFuncionariosGerenciados) {
        this.quantidadeFuncionariosGerenciados = quantidadeFuncionariosGerenciados;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    // Sobrescrevendo o método calcularBonificacao para gerentes
    @Override
    public double calcularBonificacao() {
        return getSalario() * 0.60; // 60% do salário para gerentes
    }
}
