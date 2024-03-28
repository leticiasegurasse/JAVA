package entidades;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double preco;

    public Veiculo(){

    }
    
    public Veiculo(String marca, String modelo, int ano, double preco){
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    public void exibirInformacoes(){
        System.out.println("Informacoes dos Veiculos:" + "\n" + "------------------------------");
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }  
}
