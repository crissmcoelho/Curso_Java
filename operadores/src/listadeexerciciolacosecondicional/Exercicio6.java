package listadeexerciciolacosecondicional;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// Cria um objeto Scanner para ler a entrada do usuário
        Scanner leia = new Scanner(System.in);
        
        
        // Declaração das variáveis
        String nomeColaborador;
        int codigoCargo;
        float salario;
        float novoSalario;
        String cargo = "";

        // Coleta de dados
        System.out.println("Digite o Nome do(a) Colaborador(a): ");
        nomeColaborador = leia.nextLine();

        System.out.println("Digite o Código do Cargo (1 a 6): ");
        codigoCargo = leia.nextInt();

        System.out.println("Digite o Salário atual: ");
        salario = leia.nextFloat();

        // Estrutura de controle para calcular o novo salário com base no código do cargo
        switch (codigoCargo) {
            case 1:
                cargo = "Gerente";
                novoSalario = salario + (0.10f * salario); // Reajuste de 10%
                break;
            case 2:
                cargo = "Vendedor(a)";
                novoSalario = salario + (0.07f * salario); // Reajuste de 7%
                break;
            case 3:
                cargo = "Supervisor(a)";
                novoSalario = salario + (0.09f * salario); // Reajuste de 9%
                break;
            case 4:
                cargo = "Motorista";
                novoSalario = salario + (0.06f * salario); // Reajuste de 6%
                break;
            case 5:
                cargo = "Estoquista";
                novoSalario = salario + (0.05f * salario); // Reajuste de 5%
                break;
            case 6:
                cargo = "Técnico(a) de TI";
                novoSalario = salario + (0.08f * salario); // Reajuste de 8%
                break;
            default:
                cargo = "Código Inválido";
                novoSalario = salario; // Sem reajuste para código inválido
                System.out.println("\nCódigo de Cargo inválido! Não foi possível aplicar o reajuste.");
                break;
        }

        // Exibição dos resultados (se o código for válido)
        if (codigoCargo >= 1 && codigoCargo <= 6) {
            System.out.println("\nNome do Colaborador(a): " + nomeColaborador);
            System.out.println("Cargo: " + cargo);
            System.out.printf("Novo Salário: R$  %.2f", novoSalario);
        }

        // Fecha o objeto Scanner
        leia.close();
    }
}


