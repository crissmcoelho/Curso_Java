package lacosefor;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		//inserção de variáveis		
	
		
		//instaciando um scanner
		 Scanner leia = new Scanner(System.in);

	        // Leitura dos números
	        System.out.print("Digite o primeiro número: ");
	        int num1 = leia.nextInt();
	        
	        System.out.print("Digite o segundo número maior que o número 1: ");
	        int num2 = leia.nextInt();
	        
	        // Verifica se o intervalo é válido
	        if (num1 >= num2) {
	            System.out.println("Intervalo inválido! O primeiro número deve ser menor que o segundo.");
	            return; // Sai do programa
	        }

	        System.out.println("Números múltiplos de 3 e 5 no intervalo [" + num1 + ", " + num2 + "]:");
	        
	        //For para percorrer o intervalo
	        
	        for(int i = num1; i< num2; i++) {
	        	if(i % 3 == 0 && i % 5 == 0) {
	        		System.out.println(i);
	        	}
	        }
	        
	        leia.close();
	}

}
