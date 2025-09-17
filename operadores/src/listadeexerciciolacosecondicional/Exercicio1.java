//Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na tela se a soma de A + B é maior, menor ou igual a C.

package listadeexerciciolacosecondicional;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Inserção das variáveis
		
		int a, b, c, soma; 
		
		//Instância scanner
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número 1: ");
		a = leia.nextInt();
		
		System.out.println("Digite o número 2: ");
		b = leia.nextInt();

		System.out.println("Digite o número 3: ");
		c = leia.nextInt();
		
		soma = (a + b);
		
		if(soma > c) {
			System.out.println("Soma maior que o número c!");
		}
		
		else if (soma <c)  {
			System.out.println("Soma menor que número c!");
		}
		
		else   {
			System.out.println("Soma igual ao número c!");
		}
		
		leia.close();
		
		


	}

}
