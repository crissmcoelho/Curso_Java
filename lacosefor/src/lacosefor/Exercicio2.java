package lacosefor;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		
		//inserção de variáveis		
		
		int pares = 0;
		int  impares = 0;
		int  num;
			
		
		//instaciando um scanner
		 Scanner leia = new Scanner(System.in);
		 
				 
		// For para percorrer os 10 números
	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Digite o " + i + "º número: ");
	            num = leia.nextInt();

	            if (num % 2 == 0) {
	                pares++;
	            } else {
	                impares++;
	            }
	        }
	        
	     // Exibe o resultado
	        System.out.println("\nQuantidade de números pares: " + pares);
	        System.out.println("Quantidade de números ímpares: " + impares);

	        leia.close();
		 
		 

	}

}
