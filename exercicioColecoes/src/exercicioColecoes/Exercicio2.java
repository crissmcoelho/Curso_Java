package exercicioColecoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Instanciando o scanner
		Scanner leia = new Scanner(System.in);
		
		// Criando ArrayList de Integer com 10 valores
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(2);
		
		
		 // Mostrando os valores armazenados		
		System.out.println("Números armazenados: " + numeros);
		
		 // Solicitando um número ao usuário
        System.out.print("Digite um número inteiro para buscar: ");
        int num = leia.nextInt();

        // Procurando o número no ArrayList
        int posicao = numeros.indexOf(num);

        if (posicao != -1) {
            System.out.println("O número " + num + " foi encontrado na posição: " + posicao);
        } else {
            System.out.println("O número " + num + " não foi encontrado!");
        }

        leia.close();
	}

}
