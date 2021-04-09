package POO;

import java.util.Scanner;

public class AnimalTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String nome, idade;
		int n;
		
		Scanner leia = new Scanner (System.in);
		
		
		System.out.println("Qual animal você deseja cadastrar?\n1--> Cachorro\n2--> Cavalo\n3--> Preguica \n ****\n ");
		n = leia.nextInt();
		
		
		if (n==1) {
			
		}
		
		switch (n)
		{
		
		case (1):
			System.out.println("Qual o nome do seu cachorro? ");
			String nome = leia.nextLine();
			System.out.println("Qual a idade do seu cachorro? ");
			String idade = leia.nextLine();
			cachorro novo = new cachorro(nome,idade);
			novo.ImprimirInfo();
			break;
		case (2):
			System.out.println("Qual o nome do seu cavalo? ");
			nome = leia.nextLine();
			System.out.println("Qual a idade do seu cavalo? ");
			idade = leia.nextLine();
			cavalo novoCavalo = new cavalo (nome,idade);
			novoCavalo.ImprimirInfo();
			break;
			
		case (3):
			System.out.println("Qual o nome do seu preguiça? ");
			nome = leia.nextLine();
			System.out.println("Qual a idade do seu preguiça? ");
			idade = leia.nextLine();
			preguica novaPreguica = new preguica(nome,idade);
			novaPreguica.ImprimirInfo();
			break;
		}
		

		
	}

}
