//Exercício para achar a média de salário da população, média de número de filhos, maior salário e perceltual de pessoas com salário até 100,00//



programa
{
	
	funcao inicio()
	{
		real salario,mediaS,numerodefilhos,mediaF,MSP=0.0,MNF=0.0,MaiorS=0.0,cont100=0,PDPCS100 // percentual de pessoas com salário até RS 100,00//
		inteiro x

		para(x=1;x<=20;x++)
		{ 
			escreva("\nDigite o seu salário: ",x," : ")
			leia(salario)
			escreva("\nQuantos filhos você tem?: ",x," : ")
			leia(numerodefilhos)
			MSP = MSP+salario
			MNF = MNF+numerodefilhos
			se(MaiorS < salario)
			{
				MaiorS = salario
			}
			se(salario<=100)
			{
				cont100++
			}
		}
			mediaS= MSP / 20
			mediaF= MNF / 20
			PDPCS100= (cont100 * 100) / 20

			
			escreva("\nA média do salário da população é: ",mediaS)
			escreva("\nA média de número de filhos é: ",mediaF)
			escreva("\nO maior salário é: ",MaiorS)
			escreva("\nO percentual de pessoas com salário até 100,00 é: ",PDPCS100)
			
		}
		
		
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 145; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */