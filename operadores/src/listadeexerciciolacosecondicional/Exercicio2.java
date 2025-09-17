//Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre na tela uma mensagem indicando se este número é par ou ímpar e se o número é positivo ou negativo

package listadeexerciciolacosecondicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		// Inserção das variáveis
	int numero; 
		
		//Instância scanner
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número: ");
		numero = leia.nextInt();
		
		//Regras
		
		if(numero % 2 ==0 ) {
			System.out.println("O número digitado é par e");
		}
		
		else  {
			System.out.println("O número ditado é impar e");
		}
		
		if(numero > 0) {
			System.out.println("é positivo.");
		}
		
		else {
			System.out.println("é negativo.");
		}

	}

}
