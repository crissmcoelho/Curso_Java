package exercicioDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		//Variáveis		
		int opcao;

	     // Criando a fila de clientes (Queue)
		Queue<String> fila = new LinkedList<>();
		
		do {
			System.out.println("\n--- MENU BANCO ---");
			System.out.println("1 - Adicionar Cliente na fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Chamar (retirar) um Cliente da fila");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opção: ");
			opcao = leia.nextInt();
			System.out.println("-------------------------------");
			
			switch (opcao) {
			
			case 1:
				System.out.print("Digite o nome do Cliente: ");
				String cliente = leia.nextLine();
				fila.add(cliente);
				System.out.println("Cliente " + cliente + " adicionado à fila.");
				 break;

	        case 2:
	        	if (fila.isEmpty()) {
	        		System.out.println("A fila está vazia!");
	        		} 
	        	else {
	        		System.out.println("Clientes na fila: " + fila);
	        		}
	        	break;

	         case 3:
	        	 if (fila.isEmpty()) {
	        		 System.out.println("A fila está vazia! Nenhum cliente para chamar.");
	        		 }
	        	 else {
	        		 String chamado = fila.poll(); // remove o primeiro da fila
	        		 System.out.println("Cliente chamado: " + chamado);
	                    }
	                    break;

	          case 0:
	        	  System.out.println("Encerrando o programa...");
	        	  break;
	        	  
	        	  default:
	        		  System.out.println("Opção inválida! Tente novamente.");
	            }

	        } while (opcao != 0);

	        leia.close();
	    }
	}