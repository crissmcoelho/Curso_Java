package lacosefor;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

        int soma = 0;
        int numero;

        do {
            System.out.print("Digite um número inteiro (0 para encerrar): ");
            numero = leia.nextInt();

            if (numero > 0) {
                soma += numero;
            }

        } while (numero != 0);

        System.out.println("\nA soma dos números positivos digitados é: " + soma);

        leia.close();
    }
}
	


