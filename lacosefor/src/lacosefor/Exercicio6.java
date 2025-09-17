package lacosefor;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		  Scanner leia = new Scanner(System.in);

	        int soma = 0;
	        int qtd = 0;
	        int numero;
	        double media;

	        do {
	            System.out.print("Digite um número inteiro (0 para encerrar): ");
	            numero = leia.nextInt();

	            if (numero != 0 && numero % 3 == 0) {
	                soma += numero;
	                qtd++;
	            }

	        } while (numero != 0);

	        if (qtd > 0) {
	            media = soma / qtd;
	            System.out.printf("\nA média dos múltiplos de 3 digitados é: %.2f\n", media);
	        } else {
	            System.out.println("\nNenhum múltiplo de 3 foi digitado.");
	        }

	        leia.close();
	    }
	
	}


