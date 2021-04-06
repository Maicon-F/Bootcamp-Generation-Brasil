package Lista1;

import java.util.Scanner;

public class Exerc4 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float A, B, C;
		Double R, S, D;
				
			
					
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o Valor de A: ");
		A = ler.nextFloat();
		
		System.out.println("Digite o Valor de B: ");
		B = ler.nextFloat();
		
		System.out.println("Digite o Valor de C: ");
		C = ler.nextFloat();
		
		
		R = Math.pow((A+B),2);
		
		S = Math.pow((B+C),2);
		
		D = (R+S)/2;
		
		System.out.println("\n O Valor de 'D' é: "+D);
		
       
	}
	
	/* Este programa calcula o valor de D através de valores de entrada (A,B,C) e de expressoes (R e S) */

}