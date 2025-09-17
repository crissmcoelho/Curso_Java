/*3)	Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos. A leitura dos dados deve ser finalizada ao digitar uma idade negativa. Veja o exemplo abaixo:*/

package lacosefor;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		//inserção de variáveis		
		
				int idade;
				int menores21;
				int maiores50;
				
				//instaciando um scanner
				 Scanner leia = new Scanner(System.in);
				
				while (true) {
		            System.out.print("Digite a idade: ");
		            idade = leia.nextInt();

		            if (idade < 0) {
		                break; // Sai do loop
		            }

		            if (idade < 21) {
		                menores21 ++;
		            } else if (idade > 50) {
		                maiores50 ++;
		            }
		        }

		        System.out.println("\nTotal de pessoas com menos de 21 anos: " + menores21);
		        System.out.println("Total de pessoas com mais de 50 anos: " + maiores50);

		        leia.close();
		    }
				
					
				
	}


