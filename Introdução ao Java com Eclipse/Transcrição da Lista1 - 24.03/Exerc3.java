package Lista1;

import java.util.Scanner;

public class Exerc3 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int seg, min, hor;
		
					
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual a duração do evento em segundos? ");
		seg = ler.nextInt();
		
		hor = seg/3600;
		min = (seg%3600)/60;
		seg = (seg%3600)%60;
								
		
		System.out.println("\nA quantidade de tempo deste evento é de precisamente "+hor+" horas "+min+" minutos e "+seg+" segundos");
		
       
	}
	
	/* Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos
	 * e mostre-o expresso em horas, minutos e segundos. */

}