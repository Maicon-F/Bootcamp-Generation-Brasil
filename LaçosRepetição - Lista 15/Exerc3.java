package La�osRepeti��o;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade = 0, cont21 = 0, cont50 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Insira a sua idade: ");
		idade = leia.nextInt();
		
		while (idade!= -99) {
			
			System.out.println("Insira a sua idade: ");
			idade = leia.nextInt();
			
			if (idade < 21) {
				cont21++;
			}
			if (idade > 50) {
				cont50++;
			}
		}
		
		System.out.println("\nN�mero de pessoas com menos de 21 anos = "+cont21);
		System.out.println("N�mero de pessoas com mais de 50 anos = "+cont50);
		
		
	}

}
