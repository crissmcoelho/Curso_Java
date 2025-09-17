package listadeexerciciolacosecondicional;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner ler = new Scanner(System.in);
        
        // Cria um objeto DecimalFormat para formatar o resultado com 2 casas decimais
        DecimalFormat df = new DecimalFormat("0.00");

        // Declaração das variáveis
        float numero1, numero2, resultado = 0.0f;
        int operacao;
        boolean operacaoValida = true;

        // Coleta de dados
        System.out.println("Digite o primeiro número: ");
        numero1 = ler.nextFloat();

        System.out.println("Digite o segundo número: ");
        numero2 = ler.nextFloat();

        System.out.println("\nCódigos de Operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("\nDigite o Código da Operação (1 a 4): ");
        operacao = ler.nextInt();

        // Estrutura de controle para executar a operação
        switch (operacao) {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                // Verifica se o segundo número é zero antes de dividir
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("\nErro: Divisão por zero não é permitida!");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("\nOperação Inválida!");
                operacaoValida = false;
                break;
        }

        // Exibição do resultado, se a operação for válida
        if (operacaoValida) {
            System.out.println("\nResultado da Operação: " + df.format(resultado));
        }

        // Fecha o objeto Scanner
        ler.close();
    }
}

	

