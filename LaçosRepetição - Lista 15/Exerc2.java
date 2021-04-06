package LaçosRepetição;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int somaPar = 0, num;
		
		Scanner leia = new Scanner(System.in);
		
		for (int i = 1; i<=10; i++)
		{
			System.out.println("Insira um número inteiro: ");
			num = leia.nextInt();
			
			if (num%2 == 0)
			{
				somaPar = somaPar + 1;
			}
		}
		
		System.out.println("Respectiva Qtde de Pares e Qntde de Ímpares = "+somaPar+" e "+(10-somaPar));
		

	}
	
	
	//Esse programa apresenta todos os números entre 1000 e 1999 que divididos por 11 possuem resto "5".

	}


