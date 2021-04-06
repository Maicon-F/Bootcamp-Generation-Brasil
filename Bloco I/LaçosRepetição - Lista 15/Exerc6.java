package LaçosRepetição;

import java.util.Scanner;

public class Exerc6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, soma = 0, cont = -1;
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Aperte uma tecla númerica...");
			num = leia.nextInt();
			
			if (num%3 == 0) {
			soma = soma + num;
			cont++;
			}
			
		} while (num !=0);
		
		media = soma/cont;
		
		System.out.println("A média dos números digitados é "+media);

	}

}
