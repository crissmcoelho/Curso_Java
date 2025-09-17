package operadores;

import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args) {
	float nota1, nota2, nota3, nota4, media;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite a 1ª nota: ");
	nota1 = leia.nextFloat();
	
	System.out.println("Digite a 2ª nota: ");
	nota2 = leia.nextFloat();
	
	System.out.println("Digite a 3ª nota: ");
	nota3 = leia.nextFloat();
	
	System.out.println("Digite a 4ª nota: ");
	nota4 = leia.nextFloat();
	
	media = (nota1 + nota2 + nota3 + nota4) / 4;
	
	System.out.printf("A média do aluno %.2f: ", media);
	
	if (media >= 7) {
		System.out.println("O aluno foi aprovado!");
	}
	
	else if(media >=5 && media <7) {
		System.out.println("Aluno em recuperação(exame)!");
	}
		
		else {
			System.out.println("O aluno foi reprovado!");
		}
	
	leia.close();
	
	
	
	}

}
