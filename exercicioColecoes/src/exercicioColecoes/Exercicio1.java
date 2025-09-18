package exercicioColecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Instanciando o scanner
		
		 Scanner leia = new Scanner(System.in);
		 
		
		
		 
		// Criando o ArrayList de Strings
	        ArrayList<String> cores = new ArrayList<>();

	        // Pedindo 5 cores ao usuário
	        System.out.println("Digite 5 cores:");
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Cor " + (i + 1) + " : ");
	            String cor = leia.nextLine();
	            cores.add(cor);
	        }
	        
	     // Exibindo as cores na ordem de inserção
	        System.out.println("\nCores digitadas:");
	        for (String cor : cores) {
	            System.out.println(cor);
	        }

	        // Ordenando em ordem crescente (alfabética)
	        Collections.sort(cores);

	        System.out.println("\nCores em ordem crescente:");
	        for (String cor : cores) {
	            System.out.println(cor);
	        }

	        leia.close();

	}

}
