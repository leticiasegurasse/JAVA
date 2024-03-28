package entidades;

public class IngressoVIP extends Ingresso {
    private double valorAdicional;

    public IngressoVIP(int numero, String validade, double valor, double valorAdicional) {
        super(numero, validade, valor);
        this.valorAdicional = valorAdicional;
    }

    @Override
    public double valorIngresso(){
        double vip = getValor();
        vip += valorAdicional;
        return vip;
    }

   @Override
    public void imprimir(){
        System.out.println("Ingresso VIP: " + "\n"
                    + "Numero: " + getNumero() + "\n"
                    + "Validade: " + getValidade() + "\n"
                    + "Valor: " + valorIngresso());
    }
}
