package SistemaBancarioJava;

import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);					//Cria um scanner
        int opt, deposito, saque;
        ContaCorrente c = new ContaCorrente(0, "Cadastre seu nome", "BankZ"); //Saldo, titular e Banco padrões
        System.out.println("\n=== Bem-vindo ao Simulador de Banco ===");
        System.out.println("\n== Como deseja ser chamado? ");
    	c.alterarTitular(input.nextLine());

        do {
        	System.out.println("\n[ " + c.titular + " | Banco: " + c.banco +" ]\n");
        	System.out.println("-----(OPÇÕES)-----\n");
            System.out.println("1 = Depósito");
            System.out.println("2 = Saque");
            System.out.println("3 = Alterar nome do titular");
            System.out.println("4 = Checar saldo");
            System.out.println("5 = Checar informações do titular");
            System.out.println("6 = Escolha o nome do seu Banco");
            System.out.println("0 = Sair");
            
            opt = Entrada.lerInt(input, "\nEscolha uma opção:\n");

            if (opt > 0 && opt <= 6) {
                switch (opt) {
                    case 1:
                        deposito = Entrada.lerInt(input, "Quanto deseja depositar?\n ");
            			c.depositar(deposito);
            			break; 
            			
                    case 2:
                    	saque = Entrada.lerInt(input, "\n Quanto deseja sacar?");
        				c.sacar(saque);
        				System.out.println();
        				System.out.println("Saldo Final: " + c.getSaldo());
        				System.out.println();
        				break;
        				
                    case 3:
                    	
                    	System.out.println("=== Como deseja ser chamado? ");
                    	input.nextLine();
                    	c.alterarTitular(input.nextLine());
                    	break;
                    	
                    case 4:
                        System.out.println("\nSaldo: " + c.getSaldo());
                        break;
                        
                    case 5:
                    	c.exibirInfo();
                    	break;
                    case 6:
                    	System.out.println("Como deseja chamar seu banco? ");
                    	input.nextLine();
                    	c.alterarBanco(input.nextLine());
                    	break;
                }

                System.out.println("-------------------");

            } else if (opt != 0) {
                System.out.println("Opção inválida, tente novamente.\n");
            }

        } while (opt != 0);

        System.out.println("Obrigado pela sua presença, " +c.titular+"!" + " Volte sempre!");
        input.close();
    }
}

