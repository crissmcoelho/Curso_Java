package exercicioColecoes;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		  // Criando um Set de Integer
	    Set<Integer> numeros = new HashSet<>();
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
        System.out.println("Valores no Set: " + numeros);

        // Solicitando um número ao usuário
        System.out.print("Digite um número inteiro para buscar: ");
        int num = leia.nextInt();
        
     // Verificando se o número está no Set
        if (numeros.contains(num)) {
            System.out.println("Número " + num + " Encontrado!");
        } else {
            System.out.println("O número " + num + " não foi encontrado!");
        }

        leia.close();
	}

}
