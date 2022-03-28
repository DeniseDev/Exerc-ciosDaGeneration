programa
{
	
	funcao inicio()
	{
		real N1[4][6],N2[4][6], SomaMesmaPosicao=0.0, DiferencaDosElementosNaMesmaPosicao=0.0,M1[4][6],M2[4][6]
		inteiro linha,coluna
		
		para(linha=0;linha<4;linha++)
		{
			para(coluna=0;coluna<6;coluna++)
			{
				escreva("\nEntre com um elemento: ")
				leia(N1[linha][coluna])
				escreva("\nEntre com um elemento: ")
				leia(N2[linha][coluna])
				M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna]
				M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna]
			}
		}
		para(linha=0;linha<4;linha++)
		{
			para(coluna=0;coluna<6;coluna++)
			{
				escreva("\nM1: ",M1[linha][coluna])
				escreva("\nM2: ",M2[linha][coluna])
				}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 679; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {N1, 6, 7, 2}-{N2, 6, 16, 2}-{M1, 6, 88, 2}-{M2, 6, 97, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */