package Lista1;


import java.util.Scanner;
public class exec1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2, n3, diasVividos;
		
		
			
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Quantos anos você tem? ");
		n1 = ler.nextInt();
		
		System.out.println("Quantos meses para seu próximo aniversário? ");
		n2 = ler.nextInt();
		
		System.out.println("Caso tenha algum mês incompleto para seu próximo 'niver', quantos dias tem ele? ");
		n3 = ler.nextInt();
		
		diasVividos = n1*365 + n2*30 + n3;
		
		
		
		System.out.println("\nA quantidade dias já vividos por vóis é de "+diasVividos);
		

	}
	
	/*Faça um sistema que leia a idade de uma pessoa expressa em anos,
	* meses e dias e mostre-a expressa apenas em dias. */

}

