package Lista1;

import java.util.Scanner;

public class Exerc8 {




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double precoFabrica, precoTotal;
				
			
					
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual o valor de f�brica do autom�vel? ");
		precoFabrica = ler.nextDouble();
		
		precoTotal = precoFabrica*1.73;
		
					
		System.out.printf("\n O custo total em R$ desse autom�vel ser� de %.2f ", precoTotal);
	
		
       
	}
	
	/* O custo ao consumidor de um carro novo � a soma do custo de f�brica com a 
	 * percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
	 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
	 * escrever um sistema que leia o custo de f�brica de um carro e escreva o custo
	 *  ao consumidor.  */

}