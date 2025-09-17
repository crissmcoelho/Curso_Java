import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		
		int numero; 
		
		Scanner leia = new Scanner(System.in);
		
		numero = leia.nextInt();
		
		for(int contador = 1; contador <= 10; contador ++ ) {
			
		
		System.out.printf("%d + %d = %d%n", numero, contador, numero * contador);
		}
	}

}
