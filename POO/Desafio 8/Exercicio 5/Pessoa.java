public class Pessoa {
    private String nome;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private char sexo;
    private int idade;

    // Construtor padrão
    public Pessoa() {
    }

    // Construtor com parâmetros
    public Pessoa(String nome, int diaNascimento, int mesNascimento, int anoNascimento, char sexo) {
        this.nome = nome;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
        this.sexo = sexo;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDiaNascimento() {
        return diaNascimento;
    }

    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    // Método para calcular a idade
    public void calculaIdade(int diaAtual, int mesAtual, int anoAtual) {
        // Lógica para calcular a idade
        idade = anoAtual - anoNascimento;
        if (mesAtual < mesNascimento || (mesAtual == mesNascimento && diaAtual < diaNascimento)) {
            idade--;
        }
    }

    // Método para exibir dados
    public void exibeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Dia nascimento: " + diaNascimento);
        System.out.println("Mes nascimento: " + mesNascimento);
        System.out.println("Ano nascimento: " + anoNascimento);
        System.out.println("Sexo: " + sexo);
        System.out.println("Idade: " + idade);
    }
}
