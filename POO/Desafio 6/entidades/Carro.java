package entidades;

public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String marca, String modelo, int numPortas, int ano, double preco) {
        super(marca, modelo, ano, preco);
        this.numPortas = numPortas;
    }

    

    @Override
    public void exibirInformacoes(){
        System.out.println("Veiculo: " + getMarca() + " " + getModelo() + "\n"
                    + "Ano: " + getAno() + "\n"
                    + "Preco: " + getPreco() + "\n"
                    + "Numero de portas: " + getNumPortas() + "\n------------------------------");
    }



    public int getNumPortas() {
        return numPortas;
    }
    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
}
