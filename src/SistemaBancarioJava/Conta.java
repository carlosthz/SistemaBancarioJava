package SistemaBancarioJava;

public class Conta {
 private double saldo; // só a própria classe acessa
 protected String titular; //subclasses acessam diretamente
 public String banco; // qualquer um acessa
 	
 	
 public Conta (double saldo, String titular, String banco) { 					 // Construtor
	 this.saldo = saldo;
	 this.titular = titular;
	 this.banco = banco;
	 }
  
 private boolean validar(double valor) {return valor>0;} 						 // Testa se valor > 0
 
 
 public void depositar(double valor){ 											 // Depositar
	 
	 if(validar(valor)) {														// Incrementa o valor ao saldo se o valor for validado
		 saldo+= valor;
		 System.out.println(" === DEPÓSITO === ");
		 System.out.println("\n " + valor + "  | concluído com sucesso.\n");
		  System.out.println("Saldo Final: " + saldo);
			System.out.println();
			}										 
	 else { System.out.println(" Valor inválido.\n"); }
	 
 }	
 public double getSaldo() {return saldo;} 										 // Getter pra obter o valor de Saldo que é privado
  
 	
 public void sacar(double valor) { 												 // Sacar
	 System.out.println("\n=== Saque ===");
	 if (valor>0 && valor <= saldo) { System.out.println("\nSaque Permitido: "); // Checa se o valor de saque é positivo e se é menor ou igual ao Saldo
	 saldo = saldo - valor;  													 // Deduz o valor do saldo
	 
	 System.out.println("Sacando: " + valor + " | Concluído com sucesso");  	 // Feedback do Saque
	 }									  
	 
	 else if (valor > saldo) { System.out.println("Saldo insuficiente. Tentou sacar: " + valor + "\nValor total em conta: " + saldo);} // Saldo insuficiente e mostra o Saldo Total
	 else {
		 System.out.println("\nValor inválido: " + valor + "\nInsira um valor positivo para sacar..."); } // Imprime Valor inválido na tela e pede um novo valor positivo.
	 }

 public void exibirInfo() {  //Imprime na tela as informações do titular
		System.out.println("Titular: " + titular);
		System.out.println("Saldo: " + saldo);
		System.out.println("Banco: " + banco);
	}

}


