package La�osDecis�o;

import java.util.Scanner;

public class Exerc {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;
		
	
		Scanner ler = new Scanner(System.in);
	
	
		System.out.println("Qual a idade do participante? ");
		idade = ler.nextInt();
	
		
	
		
		// Define qual � o maior dos 3
		
		if (idade >= 10 && idade <= 14 ) 
		{
			System.out.println("\nA categoria � Infantil.");
		}
		else if (idade >= 15 && idade <= 17 ) 
		{
			System.out.println("\nA categoria � Juventil.");
		}
		else if  (idade >= 18 && idade <= 25 ) 
		{
			System.out.println("\nA categoria � Adulto.");
		}
		else 
		{
			System.out.println("\n Idade inv�lida. Verifique valores de entrada!.");
		}
				
			
			
	
	
	/*Este programa classifica a categoria de um(a) participante baseado em sua idade*/
	
}

}
