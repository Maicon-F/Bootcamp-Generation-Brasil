package La�osDecis�o;

import java.util.Scanner;

public class Exerc4 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num;
		double res;
		
	
		Scanner ler = new Scanner(System.in);
	
	
		System.out.println("Insira um n�mero: ");
		num = ler.nextInt();
	
		
	
		
		// Define qual � o maior dos 3
		
		if (num%2 == 0 ) 
		{
			res = Math.sqrt(num);
			System.out.printf("\nO n�mero %.2f � par e sua ra�z quadrada � %.2f ", num, res);
		}
		else
		{
			res = Math.pow(num,2);
			System.out.printf("\nO n�mero %.2f � �mpar e o seu quadrado � %.2f ", num, res);
		}
				
			
			
	
	
	/*Este programa classifica a categoria de um(a) participante baseado em sua idade*/
	
	}

}

	
	

