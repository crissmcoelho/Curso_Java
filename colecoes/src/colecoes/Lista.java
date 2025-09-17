package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(5);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(5);
		
		System.out.println(numeros);
		System.out.println("Exibir o elemento na segunda posição: " + numeros.get(2));
		System.out.println("Exibir o indice do elemento 10: " + numeros.indexOf(10));
		
		numeros.set(numeros.indexOf(10),4);
		System.out.println(numeros);
		
		numeros.remove(numeros.indexOf(5));
		System.out.println(numeros);
		
		// For each
		for(int numero: numeros) {
			System.out.println(numeros);		}
	}


	System.out.println("Tamanho da lista: " + numeros.size());
	System.out.println("A lista esta vazia?" + numeros.isEmpty());
	System.out.println("O número 8 esta nalista? " + numeros.contains());

	//limpar a lista
	numeros.clear();
	System.out.println("A lista esta vazia?" + numeros.isEmpty());
	
	}



