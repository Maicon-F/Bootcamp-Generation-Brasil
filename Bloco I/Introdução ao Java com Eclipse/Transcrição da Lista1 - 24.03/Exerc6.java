package Lista1;

import java.util.Scanner;

public class Exerc6 {




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Double x1,x2,y1,y2,xx,yy,dist;
				
			
					
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Coordenadas de P1: ");
		System.out.println("x1 = ");
		x1 = ler.nextDouble();
		System.out.println("y1 = ");
		y1 = ler.nextDouble();
		
		System.out.println("Coordenadas de P2: ");
		System.out.println("x2 = ");
		x2 = ler.nextDouble();
		System.out.println("y2 = ");
		y2 = ler.nextDouble();
		
		xx = Math.pow((x2-x1),2);
		yy = Math.pow((y2-y1),2);
		
		dist = Math.sqrt(xx + yy);
		
		
			
		System.out.printf("\n A Distância entre os pontos P1 e P2 é de %.2f ",dist);
		
       
	}
	
	/* Este programa calcula a distância entre dois pontos em um sistema de coordenadas cartesiano */

}