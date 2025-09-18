package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		fila.add("Maria");
		fila.add("Aline");
		fila.add("Leticia");
		fila.add("Cintia");
		fila.add("Rayssa");
		System.out.println(fila);
		
		//Retirar um elemento da fila
		fila.remove();
		System.out.println(fila);
		
		fila.add("Milena");
		fila.add("Nádia");
		System.out.println(fila);
		System.out.println("O tamanho da fila é: " + fila.size());
		
		//Mostra o primeiro elemento da fila mas não remove
		System.out.println("O tamanho da fila é: " + fila.peek());
		
		
		
		
		for(var pessoa: fila) {
			System.out.println(pessoa);
		}
	}

}
