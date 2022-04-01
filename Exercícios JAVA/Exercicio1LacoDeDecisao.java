package Exercicicios;

import java.util.Scanner;

public class Exercicio1LacoDeDecisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num1,num2,num3,maiornum=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o primero número: ");
		num1 = leia.nextFloat();
		System.out.println("\nDigite o segundo número: ");
		num2 = leia.nextFloat();
		System.out.println("\nDigite o terceiro número: ");
		num3 = leia.nextFloat();
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("\nO maior numero é: "+num1);
		}
		
          else if(num2>num1 && num2>num3)
          {
        	  System.out.println("O maior número é: "+num2);
          }
          else 
          {
        	  System.out.println("O maior número é: "+num3);
          }
		
	
	}

}
