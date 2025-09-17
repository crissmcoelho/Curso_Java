package exercicioVetores;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int[][] matriz = new int[3][3];
        int somaPrincipal = 0;
        int somaSecundaria = 0;
		 
		Scanner leia = new Scanner(System.in);
		
		 // Entrada dos dados
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print("Elemento [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = leia.nextInt();
            }
        }

        System.out.println("\n=== Resultados ===");

        // Diagonal Principal
        System.out.print("Diagonal Principal: ");
        for (int indice = 0; indice < matriz.length; indice++) {
            System.out.print(matriz[indice][indice] + " ");
            somaPrincipal += matriz[indice][indice];
        }
        System.out.println("\nSoma da Diagonal Principal: " + somaPrincipal);

        // Diagonal Secundária
        System.out.print("Diagonal Secundária: ");
        for (int indice = 0; indice < matriz.length; indice++) {
            System.out.print(matriz[indice][matriz.length- 1 - indice] + " ");
            somaSecundaria +=matriz[indice][matriz.length- 1 - indice];
        }
        System.out.println("\nSoma da Diagonal Secundária: " + somaSecundaria);

        leia.close();
	}

}
