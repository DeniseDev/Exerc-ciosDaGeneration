programa
{
	
	funcao inicio()
	{
		inteiro dias,dias2,meses,anos,resto_ano
		escreva("\nEscreva a sua idade em dias ")
		leia(dias)
		anos = dias/365
		resto_ano = dias % 365
		meses = resto_ano/30
		dias2 = resto_ano % 30
		escreva("\nVocê tem ", anos, " ano(s) ",meses, " meses e ", dias2, " dias de vida.")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 79; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */