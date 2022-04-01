package Exercicicios;

import java.util.Scanner;

public class Exercicio2lacoDeDecisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num1,num2,num3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscreva o primeiro número: ");
		num1 = leia.nextFloat();
		System.out.println("\nEscreva o segundo número: ");
		num2 = leia.nextFloat();
		System.out.println("\nEscreva o terceiro número: ");
		num3 = leia.nextFloat();
		
		if(num1<=num2 && num2<=num3)
		{
			System.out.println("\nA ordem crescente é:"+num1+" , "+num2+" , "+num3);
		}
		else if(num1<=num3 && num3<=num2)
		{
			System.out.println("\nA ordem crescente é:"+num1+" , "+num3+" , "+num2);
		}
		else if(num2<=num1 && num1<=num3)
		{
			System.out.println("\nA ordem crescente é:"+num2+" , "+num1+" , "+num3);
		}
		else if(num2<=num3 && num3<=num1)
		{
			System.out.println("\nA ordem crescente é:"+num2+" , "+num3+" , "+num1);
		}
		else if(num3<=num1 && num1<=num2)
		{
			System.out.println("\nA ordem crescente é:"+num3+" , "+num1+" , "+num2);
		}
		else if(num3<=num2 && num2<=num1)
		{
			System.out.println("\nA ordem crescente é:"+num3+" , "+num2+" , "+num1);
		}
	}

}
