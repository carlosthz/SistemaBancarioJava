package SistemaBancarioJava;

public class ContaCorrente extends Conta { //ContaCorrente com Herança de Conta
	public ContaCorrente(double saldo, String titular, String banco) {
		super(saldo, titular, banco); //Herda os dados da Conta
		}
	public void alterarTitular(String novoTitular) { //Altera o Titular
		titular = novoTitular;
		System.out.println("\n=== Atualizando informações ===\n");
		System.out.println("Nome Titular: " + titular);
		}
	public void alterarBanco(String novoBanco) {  //Altera o Banco
		banco = novoBanco;
		System.out.println("\n=== Atualizando informações ===\n");
		}
		@Override //polimorfismo
	public void exibirInfo() {
		System.out.println("Titular: " + titular);
		System.out.println("Saldo: " + getSaldo());
		System.out.println("Banco: " + banco);
		System.out.println("Tipo: Conta Corrente.\n");
	}

}
