package colecoes;

import java.util.Set;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public class ColecoesSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> frutas = new HashSet<String>();
		
		frutas.add("Banana");
		frutas.add("Maça");
		frutas.add("Laranja");
		frutas.add("Abacate");
		frutas.add("Banana");
		
		System.out.println(frutas);
		
		for(String fruta: frutas) {
			System.out.println(frutas.hashCode());			
		}
		frutas.remove("Abacate");
		System.out.println("A fruta amora esta presente no set? " + frutas.contains("amora"));
		System.out.println("O set esta vazio? " + frutas.isEmpty());
		
		
		Iterator<String> itFrutas = frutas.iterator();
		
		while(itFrutas.hasNext()) {
			System.out.println(itFrutas.next());
		}
		
		//Cria o array list
		ArrayList<String> frutasList = new ArrayList<String>();
		//Adiciona todos os elementos
		frutasList.addAll(frutas);
		
		//Ordenação das frutas em ordem crescente		
		frutasList.sort(null);
		System.out.println(frutasList);
		
		//Ordenação das frutas em ordem decrescente		
				frutasList.sort(Comparator.reverseOrder());
				System.out.println(frutasList);
		

	}

}
