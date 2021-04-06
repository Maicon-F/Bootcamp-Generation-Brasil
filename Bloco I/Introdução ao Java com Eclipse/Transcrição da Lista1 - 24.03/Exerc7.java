package Lista1;

import java.util.Scanner;

public class Exerc7 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float a, b, c, d, e, f, x, y;
				
			
					
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira o valor de A: ");
		a = ler.nextFloat();
		
		System.out.println("Insira o valor de B: ");
		b = ler.nextFloat();
		
		System.out.println("Insira o valor de C: ");
		c = ler.nextFloat();
		
		System.out.println("Insira o valor de D: ");
		d = ler.nextFloat();
		
		System.out.println("Insira o valor de E: ");
		e = ler.nextFloat();
		
		System.out.println("Insira o valor de F: ");
		f = ler.nextFloat();
		
		
		x = (c*e - b*f)/(a*e - b*d);
	
		y = (a*f - c*d)/(a*e - b*d);
		
		
		System.out.printf("\n O valor de x é %.2f ",x);
		System.out.printf("\n O valor de y é %.2f ",y);
		
       
	}
	
	/* Este programa calcula o valor de x, y dados valores de entrada (a,b,c,d,e,f) */

}