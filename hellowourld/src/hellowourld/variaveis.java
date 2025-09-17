package hellowourld;

import java.util.Scanner;

public class variaveis {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int peso = 50;
		char opcao = '5';
		float valor = 100.00f;
					
		
		System.out.println("Meu peso é: " + peso);
		System.out.println("Opção é: " + opcao);
		System.out.printf("Valor é: %.2f", valor);
	}

}
