package Exercicicios;

import java.util.Scanner;

public class Exercicio2lacoDeDecisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num1,num2,num3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscreva o primeiro n�mero: ");
		num1 = leia.nextFloat();
		System.out.println("\nEscreva o segundo n�mero: ");
		num2 = leia.nextFloat();
		System.out.println("\nEscreva o terceiro n�mero: ");
		num3 = leia.nextFloat();
		
		if(num1<=num2 && num2<=num3)
		{
			System.out.println("\nA ordem crescente �:"+num1+" , "+num2+" , "+num3);
		}
		else if(num1<=num3 && num3<=num2)
		{
			System.out.println("\nA ordem crescente �:"+num1+" , "+num3+" , "+num2);
		}
		else if(num2<=num1 && num1<=num3)
		{
			System.out.println("\nA ordem crescente �:"+num2+" , "+num1+" , "+num3);
		}
		else if(num2<=num3 && num3<=num1)
		{
			System.out.println("\nA ordem crescente �:"+num2+" , "+num3+" , "+num1);
		}
		else if(num3<=num1 && num1<=num2)
		{
			System.out.println("\nA ordem crescente �:"+num3+" , "+num1+" , "+num2);
		}
		else if(num3<=num2 && num2<=num1)
		{
			System.out.println("\nA ordem crescente �:"+num3+" , "+num2+" , "+num1);
		}
	}

}
