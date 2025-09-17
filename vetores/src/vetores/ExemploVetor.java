package vetores;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
	
		
		String nomes [] = {"Cintia", "Stella", "Rafaela", "Leticia", "Patricia", "Jamila"};
		
		int numeros [] = new int [5];
		
		System.out.println("Posição 0: " + nomes[0]);
		
		System.out.println("Listagem - vetor de nomes");
		
		System.out.println("\nImput de dados - vetor de números");
		
		
		
		for(int indice = 0; indice < nomes.length; indice ++) {		
			
			System.out.printf("Nomes[%d] = %s%n ", indice, nomes[indice]);				
			
		}
		
		// ordenar nomes
		Arrays.sort(nomes);
		Arrays.sort(nomes, Collections.reverseOrder());
		
		System.out.println("\nListagem - vetor de números");
		
		for(int indice = 0; indice < numeros.length; indice ++) {
			System.out.println("Digite um número: ");
						
					
			System.out.printf("Números[%d] = %s%n ", indice, numeros[indice]);
					

	}
		leia.close();
	}
}
