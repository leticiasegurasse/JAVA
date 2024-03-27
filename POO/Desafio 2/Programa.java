public class Programa {
    public static void main(String[] args) {
        // Criando instâncias de Funcionario e Gerente
        Funcionario funcionario1 = new Funcionario("João", "123456789", 3000.00);
        Funcionario funcionario2 = new Funcionario("Maria", "987654321", 2500.00);
        Gerente gerente1 = new Gerente("Carlos", "456789123", 5000.00, 10, "senha123");

        // Criando instância de ControleDeBonificacoes
        ControleDeBonificacoes controle = new ControleDeBonificacoes();

        // Chamando o método registrarBonificacaoPaga passando as classes como parâmetro
        controle.registrarBonificacaoPaga(funcionario1);
        controle.registrarBonificacaoPaga(funcionario2);
        controle.registrarBonificacaoPaga(gerente1);

        // Exibindo o valor total de bonificações pagas a todos os funcionários
        System.out.println("Total de bonificações pagas: " + controle.getTotalDeBonificacoes());
    }
}
