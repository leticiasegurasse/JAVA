package aplicacao;

import entidades.Veiculo;
import entidades.Carro;
import entidades.Moto;

public class Programa {
    public static void main(String[] args) throws Exception {
        Veiculo linha = new Veiculo();
        Carro carro1 = new Carro("Volkswagen", "Amarok v6", 4, 2019, 150000);
        Moto moto1 = new Moto("Honda", "XJ6", 600, 2013, 30000);

        linha.exibirInformacoes();
        carro1.exibirInformacoes();

        moto1.exibirInformacoes();
    }
}
