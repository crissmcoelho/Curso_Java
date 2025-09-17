//Escreva um algoritmo em Java, que leia 3 palavras (String), que definem as características de um tipo de animal possível segundo o diagrama abaixo, que deve ser lido da esquerda para a direita.


package listadeexerciciolacosecondicional;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// Inserção das variáveis (caracteristica1 = c1, caracteristica2 = c2 e caracteristica3 = c3)
		
		String c1 , c2, c3, animal;  
		
		
		// Instânciando um Scanner 
				Scanner leia = new Scanner(System.in);
				
		// Coleta de dados
				
		System.out.println("Digite a primeira característica do animal:");	
		c1 = leia.nextLine();
		
		System.out.println("Digite a segunda característica do animal:");	
		c2 = leia.nextLine();
		
		System.out.println("Digite a terceira característica do animal:");	
		c3 = leia.nextLine();
		
		//condicional do fluxograma para determinar o animal
		
		if (c1.equalsIgnoreCase("vertebrado")) {
            if (c2.equalsIgnoreCase("ave")) {
                if (c3.equalsIgnoreCase("carnivoro")) {
                    animal = "aguia";
                } else if (c3.equalsIgnoreCase("onivoro")) {
                    animal = "pomba";
                }
            } else if (c2.equalsIgnoreCase("mamifero")) {
                if (c3.equalsIgnoreCase("onivoro")) {
                    animal = "homem";
                } else if (c3.equalsIgnoreCase("herbivoro")) {
                    animal = "vaca";
                }
            }
        } else if (c1.equalsIgnoreCase("invertebrado")) {
            if (c2.equalsIgnoreCase("inseto")) {
                if (c3.equalsIgnoreCase("hematofago")) {
                    animal = "pulga";
                } else if (c3.equalsIgnoreCase("herbivoro")) {
                    animal = "lagarta";
                }
            } else if (c2.equalsIgnoreCase("anelideo")) {
                if (c3.equalsIgnoreCase("hematofago")) {
                    animal = "sanguessuga";
                } else if (c3.equalsIgnoreCase("onivoro")) {
                    animal = "minhoca";
                }
            }
        }
		System.out.printf("O animal é: ");
		
		leia.close();




	}

}
