package aplicacao;

import entidades.ContaEmpresarial;
import entidades.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {
		
		//Criando um objeto do tipo ContaEmpresarial
		ContaEmpresarial conta = new ContaEmpresarial();
		
		//Atributos herdados da classe Conta
		conta.setNumero(1001);
		conta.setTitular("Jose da Silva");
		conta.setSaldo(2000.00);
		
		//Atributo criado na subclasse ContaEmpresarial
		conta.setLimiteEmprestimo(200.00);
		
		//Imprime os valores dos atributos herdados da classe Conta
		System.out.println("--- Atributos herdados da classe Conta ---");
		
		System.out.println("Conta: " + conta.getNumero() 
						   + ", Titular: " + conta.getTitular()  
						   + ", Saldo: " +  conta.getSaldo());
		
		System.out.println("");
      
		//Imprime o valor do atributo criado na subclasse ContaEmpresarial
		System.out.println("--- Atributos criados especificamente na classe ContaEmpresarial ---");
		
		System.out.println("Limite Emprestimo: " + conta.getLimiteEmprestimo());
      
      System.out.println("");
      System.out.println("");

      //Criando um objeto do tipo ContaPoupanca
		ContaPoupanca contaPoupanca = new ContaPoupanca();
      
      //Atributos herdados da classe Conta
		contaPoupanca.setNumero(2002);
		contaPoupanca.setTitular("Leticia Segurasse");
		contaPoupanca.setSaldo(5000.00);
      
		
		//Atributo criado na subclasse ContaPoupanca
 		contaPoupanca.setTaxaJuros(100);
      
      //Imprime os valores dos atributos herdados da classe Conta
		System.out.println("--- Atributos herdados da classe Conta ---");
		
		System.out.println("Conta: " + contaPoupanca.getNumero() 
						   + ", Titular: " + contaPoupanca.getTitular()  
						   + ", Saldo: " +  contaPoupanca.getSaldo());
		
		System.out.println("");
		
		//Imprime o valor do atributo criado na subclasse ContaEmpresarial
		System.out.println("--- Atributos criados especificamente na classe ContaEmpresarial ---");
      
      contaPoupanca.atualizar(100);
		
		System.out.println("Taxa de juros: " + contaPoupanca.getTaxaJuros());
      System.out.println("Saldo atualizado: " + contaPoupanca.getSaldo());
      
      contaPoupanca.sacar(1000);
      
      System.out.println("Saldo apos saque: " + contaPoupanca.getSaldo());

	}

}
