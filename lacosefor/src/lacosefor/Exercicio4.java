package lacosefor;

import java.util.Scanner;

public class Exercicio4 {
	
    

    // inserção das variáveis
	int idade;
	int genero;
	int dev;
    int qtdBackend = 0;
    int qtdMulheresFrontend = 0;
    int qtdHomensMobile40 = 0;
    int qtdNbFullstack30 = 0;
    int totalPessoas = 0;
    int somaIdades = 0;
    char continuar;
    
    //instanciando scanner
    Scanner leia = new Scanner(System.in);
    
    do {
        // Entrada de dados
        System.out.print("Digite a idade: ");
        idade = leia.nextInt();

        System.out.println("---------------------------");
        System.out.println("Menu Identidade de Gênero:");
        System.out.println("1 – Mulher Cis");
        System.out.println("2 – Homem Cis");
        System.out.println("3 – Não Binário");
        System.out.println("4 – Mulher Trans");
        System.out.println("5 – Homem Trans");
        System.out.println("6 – Outros");
        System.out.print("Escolha uma opção: ");
        genero = leia.nextInt();

        System.out.println("---------------------------");
        System.out.println("Menu Pessoa Desenvolvedora:");
        System.out.println("1 – Backend");
        System.out.println("2 – Frontend");
        System.out.println("3 – Mobile");
        System.out.println("4 – FullStack");
        System.out.print("Escolha uma opção: ");
        dev = sc.nextInt();

        // Atualiza contadores
        totalPessoas++;
        somaIdades += idade;

        if (dev == 1) { // Backend
            qtdBackend++;
        } else if (dev == 2 && (genero == 1 || genero == 4)) { // Mulheres (cis ou trans) no Frontend
            qtdMulheresFrontend++;
        } else if (dev == 3 && (genero == 2 || genero == 5) && idade > 40) { // Homens cis ou trans no Mobile > 40
            qtdHomensMobile40++;
        } else if (dev == 4 && genero == 3 && idade < 30) { // Não binários no Fullstack < 30
            qtdNbFullstack30++;
        }

        // Pergunta se deseja continuar
        System.out.print("Deseja cadastrar outro colaborador? (S/N): ");
        continuar = sc.next().toUpperCase().charAt(0);

    } while (continuar == 'S');

    // Relatório final
    System.out.println("\n===== RELATÓRIO FINAL =====");
    System.out.println("Número de pessoas desenvolvedoras Backend: " + qtdBackend);
    System.out.println("Número de Mulheres (Cis e Trans) no Frontend: " + qtdMulheresFrontend);
    System.out.println("Número de Homens (Cis e Trans) no Mobile maiores de 40 anos: " + qtdHomensMobile40);
    System.out.println("Número de Não Binários no FullStack menores de 30 anos: " + qtdNbFullstack30);
    System.out.println("Número total de pessoas que responderam à pesquisa: " + totalPessoas);

    if (totalPessoas > 0) {
        double mediaIdades = (double) somaIdades / totalPessoas;
        System.out.printf("Média de idade dos participantes: %.2f anos\n", mediaIdades);
    } else {
        System.out.println("Nenhum participante registrado.");
    }

    sc.close();
}
    
    

}
