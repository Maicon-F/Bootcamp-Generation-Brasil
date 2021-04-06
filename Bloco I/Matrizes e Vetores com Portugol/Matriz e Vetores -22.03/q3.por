programa
{
	// Esse programa cria duas matrizes e trabalhar expressoes de soma e subtração entre elas
	funcao inicio()
	{
		escreva("Questão #3) ")


		inteiro linha, coluna, rand, x, N1[4][6], N2[4][6], M1[4][6], M2[4][6]


		// Criação das matrizes
		para (linha = 0; linha < 4; linha++)
		{

			para (coluna = 0; coluna < 6; coluna++)
			{
				N1[linha][coluna] = sorteia(1,20)
				escreva("\n\n\nN1 =", N1[linha][coluna])
				
				N2[linha][coluna] = sorteia(1,60)
				escreva("\nN2 =",N2[linha][coluna])

				//subtração
				M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna]
				escreva("\n M2 = ",M2[linha][coluna])

				//Adição
				M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna]
				escreva("\n M1 = ",M1[linha][coluna])
								
			}
		}

		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 756; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {N1, 9, 34, 2}-{N2, 9, 44, 2}-{M1, 9, 54, 2}-{M2, 9, 64, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */