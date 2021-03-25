package Lista1;

import java.util.Scanner;

public class Exerc2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dias, anos, meses, diasVividos;
		
					
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual sua idade em dias? ");
		diasVividos = ler.nextInt();
		
		anos = (diasVividos/365);
		meses = (diasVividos%365)/30;
		dias = ((diasVividos%365)%30);
		
				
		
		System.out.println("\nSua idade é de precisamente "+anos+" anos "+meses+" meses e "+dias+" dias");
		

	}
	
	/*Faça um sistema que leia a idade de uma pessoa expressa em dias 
	 * e mostre-a expressa em anos, meses e dias.*/

}

