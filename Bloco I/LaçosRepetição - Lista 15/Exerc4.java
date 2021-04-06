package LaçosRepetição;

import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int np=1, npc=0, nmn=0, nha=0, noc=0, npn40=0, npc18=0,genero, humor, idade;
		
		Scanner leia = new Scanner(System.in);
		
		while (np < 4) {
			System.out.println("Qual o seu gênero?\n1-Feminino \n2-Masculino \n3-Outros");
			genero = leia.nextInt();
			
			System.out.println("Qual o seu gênero?\n1-Calmo \n2-Nervoso \n3-Agressivo");
			humor = leia.nextInt();
			
			System.out.println("Qual a sua idade?");
			idade = leia.nextInt();
			
			
			if (humor == 1) // Número de pessoas calmas
			{
				npc++;
			}
			
			if (genero == 1 && humor == 2) // Número de mulheres nervosas
			{
				nmn++;
			}
			
			if (genero == 2 && humor == 3) // Número de homens agressivos
			{
				nha++;
			}
			
			if (genero == 3 && humor == 1) // Número de 'outros' calmos
			{
				noc++;
			}
			
						
			if (idade > 40 && humor == 2) // Número de pessoas nervosas com mais de 40
			{
				npn40++;
			}
			
			if (idade < 18 && humor == 1) // Número de pessoas calmas com menos de 18 anos
			{
				npc18++;
			}
			
			np++;
			
		}
		
		System.out.println("\nNúmero de pessoas calmas: "+npc);
		System.out.println("\nNúmero de mulheres nervosas: "+nmn);
		System.out.println("\nNúmero de homens agressivos: "+nha);
		System.out.println("\nNúmero de 'outros' calmos: "+noc);
		System.out.println("\nNúmero de pessoas nervosas com mais de 40: "+npn40);
		System.out.println("\nNúmero de pessoas calmas com menos de 18: "+npc18);
		
		
		
	}

}
