package exercicioColecoes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
		
	  // Criando um Set de Integer
    Set<Integer> numeros = new HashSet<>();

    System.out.println("Digite 10 números inteiros não repetidos:");
    
 // Enquanto não tiver 10 números diferentes
    while (numeros.size() < 10) {
        System.out.print("Número " + (numeros.size() + 1) + ": ");
       int valor = leia.nextInt();
	}
    
    // Tenta adicionar ao Set (só adiciona se não existir)
    boolean adicionado = numeros.add(valor);
    if (!adicionado) {
        System.out.println("Número repetido! Digite outro valor.");
    }
}

	// Exibindo os elementos usando Iterator
	System.out.println("\nElementos do Set:");
	
	Iterator<Integer> it = numeros.interator();
	while (it.hasNext()) {
		System.out.println(it.next());
		}
	.close();
}
    

}
