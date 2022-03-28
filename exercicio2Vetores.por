/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação*/


programa
{
	
	funcao inicio()
	{
		inteiro Lanc[10],SomaLan=0,ContMaior=0,x
		real Media 

		para(x=0;x<10;x++)
		{
			escreva("\nEntre com o lançamento: ")
			leia(Lanc[x])
			SomaLan= SomaLan + Lanc[x]
			se(Lanc[x] ==6)
			{
				ContMaior++
			}
		}
		Media = SomaLan / 10
		escreva("\nMédia dos lançamentos: ",Media)
		escreva("\nQuandidade do número maior é: ",ContMaior)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 579; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {Lanc, 12, 10, 4}-{SomaLan, 12, 19, 7}-{ContMaior, 12, 29, 9};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */