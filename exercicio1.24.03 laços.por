
// Atividade para medir o peso e excesso da saca de tomate//

programa
{
	
	funcao inicio()
	{
		inteiro P,E,M
		
		escreva("\nDigite a quantidade de kilos que você pegou: ")
		leia (P)
		se (P>50)
		{
			E=P-50
			M=E*4

			escreva("\nO peso total da saca é de: " ,P, "Kg")
			escreva("\nO peso excedente é de: " ,E, "Kg")
			escreva("\nA multa pelo peso em execesso será de: " ,M, ",00")
		}
		senao
		{
			escreva("\nVocê não pagará pelo execesso porque não excedeu o limite de peso") 
			
		}
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 16; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */