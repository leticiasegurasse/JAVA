package entidades;

public class ContaPoupanca extends Conta{
   private double taxaJuros;
   
   public ContaPoupanca() {
		super();// 2 - Chama o método construtor padrão da classe pai
	}
	
	// 3- Adiciona os mesmos parâmetros do construtor customizado da classe pai 
	// mais o parametro do construtor customizado da classe filha
	public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) { 
		super(numero, titular, saldo);              // 4 - Chama o método construtor customizado da classe pai
		this.taxaJuros = taxaJuros;
	}
	
	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
   
   public void atualizar(double taxaJuros){
      saldo += taxaJuros * saldo / 100;
   }

	public void sacar(double valorSaque) {
		if (valorSaque <= saldo) {
			saldo -= valorSaque;
		}
	}
}
