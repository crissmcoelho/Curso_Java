package listadeexerciciolacosecondicional;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// Inserção das variáveis
		
		float saldo = 1000.00f;
        int operacao;
        float valor, saque;
        
        //Instância o scanner
        
        Scanner leia = new Scanner(System.in);
        
       
        //Criação do Menu
        System.out.println("----------Menu-------------");
        System.out.println("Selecione a operação:");
        System.out.println("1 - Consultar Saldo");
        System.out.println("2 - Depósito");
        System.out.println("3 - Saque");
        System.out.print("Digite a operação desejada: ");
        operacao = leia.nextInt();
        
        // Criação do swich
        
        
        switch (operacao) {
        
        // Consulta saldo        
		case 1:
			System.out.printf("Saldo atual: R$ %.2f%n", saldo);			
			break;
			
			//Opção depósito
		case 2:
			System.out.printf("Digite o valor a depositar: R$ ");
			valor = leia.nextFloat();
			saldo += valor;
			System.out.printf("Depósito realizado com sucesso!%nNovo saldo: R$ %.2f%n", saldo);
			break;
			
			//Opção saque
					case 3:
						System.out.printf("Digite o valor do saque: R$ ");
						valor = leia.nextFloat();
						if(valor <= saque) {
							saldo -= valor;
						System.out.printf("Saque realizado com sucesso!%nNovo saldo: R$ %.2f%n", saldo);
						} else {
							System.out.printf("Saldo insuficiente para realizar o saque!");
						}
						break;
						
						default:
							 System.out.println("Operação Inválida!");
							 break;
        }
        
        			leia.close();
		}

	}

}
