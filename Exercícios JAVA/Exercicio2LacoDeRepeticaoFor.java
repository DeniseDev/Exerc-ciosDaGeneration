package Exercicicios;

import java.util.Scanner;

public class Exercicio2LacoDeRepeticaoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)//
		
		float num, SomaPar=0, SomaImp=0,contnum=0;
		int x;
		Scanner leia = new Scanner (System.in);
		
		for(x=1;x<=10;x++)
		{
		System.out.println("Digite um n�mero: ");
		num = leia.nextFloat();
		
		 
		if(num%2==0)
		{
			SomaPar+=num;
			
		}
		if(num%2!=0)
		{
			SomaImp+=num;
		}
		
		
		}
		System.out.println("\nSomat�rio dos numeros pares: "+SomaPar);
		System.out.println("\nSomat�rio dos numeros impares: "+SomaImp);
	}

}
