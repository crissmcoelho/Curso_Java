//Com base na tabela abaixo, escreva um algoritmo em Java que leia o código de um item (número inteiro de 1 a 6) e a quantidade comprada deste item (número inteiro). A seguir, mostre na tela o valor total da conta e o nome do produto que foi comprado.


package listadeexerciciolacosecondicional;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        // Entrada dos dados
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        String produto = "";
        double preco = 0.0;

        // Estrutura de decisão baseada no código
        switch (codigo) {
            case 1:
                produto = "Cachorro-quente";
                preco = 4.00;
                break;
            case 2:
                produto = "X-Salada";
                preco = 4.50;
                break;
            case 3:
                produto = "X-Bacon";
                preco = 5.00;
                break;
            case 4:
                produto = "Torrada simples";
                preco = 2.00;
                break;
            case 5:
                produto = "Refrigerante";
                preco = 1.50;
                break;
            case 6:
                produto = "Suco natural";
                preco = 2.50;
                break;
            default:
                System.out.println("Código inválido!");
                sc.close();
                return;
        }

        // Calculando o total
        double total = preco * quantidade;

        // Saída formatada
        System.out.printf("Produto: %s%n", produto);
        System.out.printf("Valor total: R$ %.2f%n", total);

        sc.close();
    }
}
