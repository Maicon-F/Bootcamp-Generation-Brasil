package LaçosDecisão;

import java.util.Scanner;

public class Exerc2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2, n3, primeiro, segundo, terceiro;
	
		Scanner ler = new Scanner(System.in);
	
	
		System.out.println("Insira o valor do primeiro número: ");
		n1 = ler.nextInt();
	
		System.out.println("Insira o valor do segundo número: ");
		n2 = ler.nextInt();
	
		System.out.println("Insira o valor do terceiro número: ");
		n3 = ler.nextInt();
	
		
		primeiro = n1;
		segundo = n2;
		terceiro = n3;
	
		
		// Define a ordem
		
		if (n2 >= n1 && n1 >= n3) 
		{
			primeiro = n2;	
			segundo = n1;
			terceiro = n3;
		}
		
		else if (n2 >= n3 && n3 >= n1) 
		{
			primeiro = n2;	
			segundo = n3;
			terceiro = n1;
		}
		
		else if (n3 >= n1 && n2 >= n1) 
		{
			primeiro = n3;	
			segundo = n2;
			terceiro = n1;
		}
		
		else if (n3 >= n1 && n1 >= n2) 
		{
			primeiro = n3;	
			segundo = n1;
			terceiro = n2;
		}
		else if (n1 >= n2 && n3 >= n2) 
		{
			primeiro = n1;	
			segundo = n3;
			terceiro = n2;
		}
		
		
			
			
		
		System.out.println("A Ordem crescente dos números é: "+primeiro+" / "+segundo+" / "+terceiro);
		
			
	
	
	/*Faça um programa que receba três inteiros e os coloque em ordem crescente.*/
	
}

}



