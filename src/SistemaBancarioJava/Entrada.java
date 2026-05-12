package SistemaBancarioJava;

import java.util.Scanner;

public class Entrada {
public static int lerInt(Scanner input, String mensagem) { // Testa se o input é válido, para não quebrar o código

    while (true) {

        System.out.print(mensagem);

        if (input.hasNextInt()) { // Testa foi inserido um inteiro válido e retorna ele.
            return input.nextInt(); 
        } else {
            System.out.println("❌ Entrada inválida! Digite um número inteiro.");
            input.next(); // limpa o valor inválido de input.
        }
    }
 }

public static double lerDouble(Scanner input, String mensagem) { 

    while (true) {

        System.out.print(mensagem);

        if (input.hasNextDouble()) {
            return input.nextDouble(); 
        } else {
            System.out.println("❌ Entrada inválida! Digite um número válido.");
            input.next(); 
        }
    }
 }
}