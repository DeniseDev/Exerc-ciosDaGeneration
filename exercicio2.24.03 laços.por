programa
{
	
	//Calculo do salário de um funcionário de acordo com horas trabalhadas//
	
	funcao inicio()
	{
		real C,N,H,E,He,Sl
		escreva("informe o seu codigo: ")
		leia(C)
		escreva("\nQuantas horas você trabalhou esse mês: ")
		leia(N)

          se (N>50)

     
          { 
          	Sl=500
          	E=N-50
          	escreva("\nVocê excedeu " , E, "horas") 
          	
          	He=20*E 
          	escreva("\nVocê receberá " ,He + Sl)
          }
          senao
          {
          	Sl=10*N
          escreva("\nVocê não excedeu suas horas")
		escreva("\nNesta caso, seu salário será: ", Sl)
          }
          
         

		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 448; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */