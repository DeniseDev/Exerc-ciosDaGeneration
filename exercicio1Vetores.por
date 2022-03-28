programa
{
	
	funcao inicio()
	{
		inteiro valor[5],x=0 ,MaiorPon=0

		para(x=0;x<5;x++)
		{
			
			escreva("\nEscreva um número: ")
			leia(valor[x])

			se (valor[x] > MaiorPon)
			{
				MaiorPon= valor[x]
			}
		
		}
		
		escreva("\nA maior pontuação é: ",MaiorPon)
	
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 67; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {valor, 6, 10, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */