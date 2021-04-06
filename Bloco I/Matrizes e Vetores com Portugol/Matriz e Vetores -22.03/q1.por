programa
{
	// Esse programa calcula a maior nota de 5
	
	funcao inicio()
	{
		escreva("questão #1) \n\n")

		real vet[5], maior = 0
		inteiro x

		para (x=0; x < 4; x++)
		{
			escreva("\n\nQual a nota da tarefa #", x, "? ")
			leia(vet[x])

			escreva("A nota registrada foi: ", vet[x])


			se (maior < vet[x])
			{
				maior = vet[x]
			}
		}

		
		escreva("\n\nA maior nota foi : ", maior, "\n\n")

		

		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 382; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */