package Exercicicios;

import java.util.Scanner;

public class Exercicio1LacoDeDecisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num1,num2,num3,maiornum=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o primero n�mero: ");
		num1 = leia.nextFloat();
		System.out.println("\nDigite o segundo n�mero: ");
		num2 = leia.nextFloat();
		System.out.println("\nDigite o terceiro n�mero: ");
		num3 = leia.nextFloat();
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("\nO maior numero �: "+num1);
		}
		
          else if(num2>num1 && num2>num3)
          {
        	  System.out.println("O maior n�mero �: "+num2);
          }
          else 
          {
        	  System.out.println("O maior n�mero �: "+num3);
          }
		
	
	}

}
