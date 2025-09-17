/*Para doar sangue é necessário ter entre 18 e 69 anos de idade. Pessoas com idade entre 60 e 69 anos, só podem doar se não for a sua primeira doação. Escreva um Algoritmo em Java que obtenha via teclado o nome do doador (String), a idade (inteiro) do doador e se é a primeira doação (boolean). De acordo com as Regras para a doação, mostre na tela se o doador está Apto ou Não Apto para doar sangue. */

package listadeexerciciolacosecondicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		// Inserção das variáveis
		
		String nome, doador;
		int idade; 
		boolean primeiraDoacao;
		
		// Instância um Scanner 
		Scanner leia = new Scanner(System.in);
		
		//Coleta de dados do doador
		
		System.out.print("Digite o nome do doador: ");
		doador = leia.nextLine();
		
		System.out.print("Digite a idade do doador: ");
		idade = leia.nextInt();
		
		System.out.print("É a primeira doação? (true/false): ");
		primeiraDoacao = leia.nextBoolean();
		
		
		//regras de doação 
		        boolean apto = false;
		        
		            // Regra 1: Idade entre 18 e 69 anos
		        if (idade >= 18 && idade <= 69) {
		            // Regra 2: Pessoas entre 60 e 69 anos só podem doar se não for a primeira vez
		            if (idade >= 60 && idade <= 69) {
		                if (!primeiraDoacao) {
		                    apto = true;
		                }
		            } else { // Pessoas entre 18 e 59 anos
		                apto = true;
		            }
		        }

		       if (apto) {
		            System.out.println(doador + ", você está APTO para doar sangue.");
		        } else {
		            System.out.println(doador + ", você está NÃO APTO para doar sangue.");
		        }

		       leia.close();
		    }
		}