package LaçosDecisão;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2, n3;
		
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Insira o valor do primeiro número: ");
		n1 = ler.nextInt();
		
		System.out.println("Insira o valor do segundo número: ");
		n2 = ler.nextInt();
		
		System.out.println("Insira o valor do terceiro número: ");
		n3 = ler.nextInt();
		
		
		
		if (n1 > n2 && n1 > n3) 
		{
			System.out.println("O Maior número é o "+n1);
		}
		else if (n2 > n1 && n2 > n3) 
		{
			System.out.println("O Maior número é o "+n2);
		}
		else
		{
			System.out.println("O Maior número é o "+n3);
		}
				
		
		
		/*Faça um programa que receba três inteiros e diga qual deles é o maior.*/
		
	}

}
