public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    // Construtor padrão
    public Funcionario() {}

    // Construtor parametrizado
    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método para calcular bonificação
    public double calcularBonificacao() {
        return salario * 0.30; // 30% do salário para funcionários comuns
    }
}
