package Lista1;

import java.util.Scanner;

public class Exerc5 {




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float A, B, C, media;
				
			
					
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o Valor de Primeira Nota: ");
		A = ler.nextFloat();
		
		System.out.println("Digite o Valor da Segunda Nota: ");
		B = ler.nextFloat();
		
		System.out.println("Digite o Valor da Terceira Nota: ");
		C = ler.nextFloat();
		
		media = (2*A + 3*B + 5*C)/10;
		
		System.out.println("\n A Média das notas é: "+media);
		
       
	}
	
	/* Este programa calcula a média ponderada de 3 notas */

}