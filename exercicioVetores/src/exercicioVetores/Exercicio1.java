package exercicioVetores;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner leia = new Scanner(System.in);
		
		// Vetor fixo de 10 números inteiros
        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        
        // Exibe o vetor
        System.out.print("Vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        
     // Entrada do número a pesquisar
        System.out.print("Digite um número para pesquisar: ");
        numero = leia.nextInt();
        
     // Pesquisa no vetor
        boolean encontrado = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                System.out.println("Número encontrado na posição: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Não foi encontrado!");
        }

        leia.close();
    }
	

}
