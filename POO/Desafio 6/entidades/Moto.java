package entidades;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int cilindradas, int ano, double preco) {
        super(marca, modelo, ano, preco);
        this.cilindradas = cilindradas;
    }

    

    @Override
    public void exibirInformacoes(){
        System.out.println("Veiculo: " + getMarca() + " " + getModelo() + "\n"
                    + "Ano: " + getAno() + "\n"
                    + "Preco: " + getPreco() + "\n"
                    + "Cilindradas: " + getCilindradas() + "\n------------------------------");
    }



    public int getCilindradas() {
        return cilindradas;
    }
    public void setCilindadras(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
