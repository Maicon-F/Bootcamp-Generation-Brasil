programa
{
	// Esse programa trabalha com vetores. Calculando o número de ocorrencias do maior valor e a media de medidas de um dado não viciado
	
	funcao inicio()
	{
		escreva("Questão #2) ")

		real vet[10], media, soma =0, maior = 0, rand
		inteiro x, freq = 0


     // CRIAÇÃO DO VETOR
		para (x = 0; x < 10; x++)
		{
			rand = sorteia(1,6)
			escreva("\n", rand)
			vet[x] = rand
			
			soma = soma + vet[x]

			se (maior < vet[x])
				{
					maior = vet[x]
				}

			
		}

 	// FREQUENCIA DO MAIOR VALOR
		para (x = 0; x < 10; x++)
		{
		
			se (maior == vet[x])
				{
					freq++
				}
		}


		
			media = soma/10

			escreva("\n\nMédia = ", media)
			escreva("\n\nO Maior valor registrado foi: ", maior, " e a quantidade de vezes em que ele aparece é de: ", freq, "\n\n")

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 779; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */