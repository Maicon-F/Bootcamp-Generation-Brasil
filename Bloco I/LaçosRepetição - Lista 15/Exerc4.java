package La�osRepeti��o;

import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int np=1, npc=0, nmn=0, nha=0, noc=0, npn40=0, npc18=0,genero, humor, idade;
		
		Scanner leia = new Scanner(System.in);
		
		while (np < 4) {
			System.out.println("Qual o seu g�nero?\n1-Feminino \n2-Masculino \n3-Outros");
			genero = leia.nextInt();
			
			System.out.println("Qual o seu g�nero?\n1-Calmo \n2-Nervoso \n3-Agressivo");
			humor = leia.nextInt();
			
			System.out.println("Qual a sua idade?");
			idade = leia.nextInt();
			
			
			if (humor == 1) // N�mero de pessoas calmas
			{
				npc++;
			}
			
			if (genero == 1 && humor == 2) // N�mero de mulheres nervosas
			{
				nmn++;
			}
			
			if (genero == 2 && humor == 3) // N�mero de homens agressivos
			{
				nha++;
			}
			
			if (genero == 3 && humor == 1) // N�mero de 'outros' calmos
			{
				noc++;
			}
			
						
			if (idade > 40 && humor == 2) // N�mero de pessoas nervosas com mais de 40
			{
				npn40++;
			}
			
			if (idade < 18 && humor == 1) // N�mero de pessoas calmas com menos de 18 anos
			{
				npc18++;
			}
			
			np++;
			
		}
		
		System.out.println("\nN�mero de pessoas calmas: "+npc);
		System.out.println("\nN�mero de mulheres nervosas: "+nmn);
		System.out.println("\nN�mero de homens agressivos: "+nha);
		System.out.println("\nN�mero de 'outros' calmos: "+noc);
		System.out.println("\nN�mero de pessoas nervosas com mais de 40: "+npn40);
		System.out.println("\nN�mero de pessoas calmas com menos de 18: "+npc18);
		
		
		
	}

}
