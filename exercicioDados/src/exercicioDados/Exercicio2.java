package exercicioDados;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {

	public static void main(String[] args) {
		
		 Scanner leia = new Scanner(System.in);
	        Stack<String> pilha = new Stack<>();
	        int opcao;

	        do {
	            System.out.println("\n=== MENU PILHA DE LIVROS ===");
	            System.out.println("1 - Adicionar um novo livro");
	            System.out.println("2 - Listar todos os livros");
	            System.out.println("3 - Retirar um livro da pilha");
	            System.out.println("0 - Sair");
	            System.out.print("Escolha uma opção: ");
	            opcao = leia.nextInt();
	            leia.nextLine(); // consumir quebra de linha

	            switch (opcao) {
	                case 1:
	                    System.out.print("Digite o nome do livro: ");
	                    String livro = leia.nextLine();
	                    pilha.push(livro);
	                    System.out.println("Livro \"" + livro + "\" adicionado à pilha.");
	                    break;

	                case 2:
	                    if (pilha.isEmpty()) {
	                        System.out.println("A pilha está vazia.");
	                    } else {
	                        System.out.println("\n--- Livros na pilha ---");
	                        for (int i = pilha.size() - 1; i >= 0; i--) {
	                            System.out.println(pilha.get(i));
	                        }
	                    }
	                    break;

	                case 3:
	                    if (pilha.isEmpty()) {
	                        System.out.println("A pilha está vazia. Nenhum livro para retirar.");
	                    } else {
	                        String retirado = pilha.pop();
	                        System.out.println("Livro \"" + retirado + "\" retirado da pilha.");
	                    }
	                    break;

	                case 0:
	                    System.out.println("Encerrando o programa...");
	                    break;

	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }
	        } while (opcao != 0);

	        leia.close();
       
    }
}
         
		
		

	


