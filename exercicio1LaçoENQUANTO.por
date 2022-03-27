programa
{
	inclua biblioteca Util
	funcao inicio()
	{
	inteiro numero,SomaTotal=0, quantidade=0
	real Media=0.0
	
	escreva("\nDigite um número: ")
		leia(numero)
	
	enquanto (numero>0)	
	{ 

        SomaTotal = SomaTotal + numero
        quantidade =  quantidade + 1
        Media = SomaTotal / quantidade
        
		
		escreva("\nDigite um número: ")
		leia(numero)
	
		
	}
	
	escreva("\nA soma total dos numeros digitados é: ",SomaTotal)
	escreva("\nA Média dos números digitados é: ", Media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 504; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */