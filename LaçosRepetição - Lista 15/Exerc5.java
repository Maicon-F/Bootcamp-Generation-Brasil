package LaçosRepetição;

import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, soma = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Aperte uma tecla númerica...");
			num = leia.nextInt();
			soma = soma + num;
			
		} while (num !=0);
		
		System.out.println("A Soma dos números digitados é: "+soma);
	}

}
