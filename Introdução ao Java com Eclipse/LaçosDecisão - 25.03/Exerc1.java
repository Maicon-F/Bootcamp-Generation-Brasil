package La�osDecis�o;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2, n3;
		
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Insira o valor do primeiro n�mero: ");
		n1 = ler.nextInt();
		
		System.out.println("Insira o valor do segundo n�mero: ");
		n2 = ler.nextInt();
		
		System.out.println("Insira o valor do terceiro n�mero: ");
		n3 = ler.nextInt();
		
		
		
		if (n1 > n2 && n1 > n3) 
		{
			System.out.println("O Maior n�mero � o "+n1);
		}
		else if (n2 > n1 && n2 > n3) 
		{
			System.out.println("O Maior n�mero � o "+n2);
		}
		else
		{
			System.out.println("O Maior n�mero � o "+n3);
		}
				
		
		
		/*Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/
		
	}

}
