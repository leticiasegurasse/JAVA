package entidades;

public class Ingresso {
    private int numero;
    private String validade;
    private double valor;

    public Ingresso(int numero, String validade, double valor){
        this.numero = numero;
        this.validade = validade;
        this.valor = valor;
    }

    public double valorIngresso(){
        return valor;
    }

    public void imprimir(){
        System.out.println("Ingresso: " + "\n"
                    + "Numero: " + getNumero() + "\n"
                    + "Validade: " + getValidade() + "\n"
                    + "Valor: " + valorIngresso());
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getValidade() {
        return validade;
    }
    public void setValidade(String validade) {
        this.validade = validade;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
        
}
