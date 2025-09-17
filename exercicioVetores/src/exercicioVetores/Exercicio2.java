package exercicioVetores;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		 int[] vetor = new int[10];
		 int soma = 0;
		 double media;
		 
		Scanner leia = new Scanner(System.in);

	        // Entrada dos números
	        for (int i = 0; i < vetor.length; i++) {
	            System.out.print("Digite o " + (i + 1) + "º número: ");
	            vetor[i] = leia.nextInt();
	            soma += vetor[i];
	        }

	        System.out.println("\n=== Resultados ===");

	        // Elementos nos índices ímpares
	        System.out.print("Elementos nos índices ímpares: ");
	        for (int i = 0; i < vetor.length; i++) {
	            if (i % 2 != 0) { // índice ímpar
	                System.out.print(vetor[i] + " ");
	            }
	        }
	        System.out.println();

	        // Elementos pares
	        System.out.print("Elementos pares do vetor: ");
	        for (int i = 0; i < vetor.length; i++) {
	            if (vetor[i] % 2 == 0) {
	                System.out.print(vetor[i] + " ");
	            }
	        }
	        System.out.println();

	        // Soma
	        System.out.println("Soma de todos os elementos: " + soma);

	        // Média
	        media = (soma / vetor.length);
	        System.out.printf("Média dos elementos: %.2f\n", media);

	        leia.close();
	    }

	}


