package vetores;

import java.util.Scanner;

public class ExemploMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int numeros[][] = {
				{ 1, 2, 3 },
				{ 4, 5, 6 }, 
				{ 7, 8, 9 },
						  
	};
		
		System.out.println("Listar matriz de números");
		
		float numerosReais[][] = new float[3][2];

		// percorre as linhas
		for (int linha = 0; linha < numeros.length; linha++) {

			// percorre as colunas
			for (int coluna = 0; linha < numeros.length; coluna++) {
				System.out.printf("Números [%d}[%d] = %d%n", linha, coluna, numeros[linha][coluna]);
			}
		}
		
		System.out.println("\n Imput dados  matriz de números reais");
		// percorre as linhas
		for (int linha = 0; linha < numerosReais.length; linha++) {

			// percorre as colunas
			for (int coluna = 0; linha < numerosReais[linha].length; coluna++) {
				System.out.println("Digite um Número:  ");
				numerosReais [linha][coluna] = leia.nextFloat();
			}
		}

		System.out.println("\n Listar matriz de números reais");
		for (int linha = 0; linha < numerosReais.length; linha++) {
			for (int coluna = 0; linha < numerosReais[linha].length; coluna++) {
				System.out.printf("Números [%d}[%d] = %.2f%n", linha, coluna, numerosReais[linha][coluna]);
			}
		}

		leia.close();

	}

}
