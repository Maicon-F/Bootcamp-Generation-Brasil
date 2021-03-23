programa
{
	
// Esse programa cria duas matrizes e trabalha expressoes de soma e subtração entre elas
	funcao inicio()
	{
		escreva("Questão #3) \n")


		inteiro linha, coluna, rand, x, matriz[3][3], soma = 0, somaDiagonal = 0


		// Criação das matrizes
		para (linha = 0; linha < 3; linha++)
		{

			para (coluna = 0; coluna < 3; coluna++)
			{

				escreva("\nInsira o valor do elemento ", coluna, " da linha ", linha, ": ")
				leia(matriz[linha][coluna])
				
				soma = soma + matriz[linha][coluna]

		// Soma dos elementos da Diagonal
				se (linha == coluna)
				{
				somaDiagonal = somaDiagonal + matriz[linha][coluna]
				}
								
			}
		}

		escreva("\n\nSoma total = ", soma)
		escreva("\n\nSoma dos elementos da Diagonal = ", somaDiagonal, "\n\n")
		
		
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 532; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */