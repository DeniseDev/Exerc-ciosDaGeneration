package Exercicicios;

import java.util.Scanner;

public class Exercicio5LacoDeRepeticaoDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/
		
		int num,SomaNum=0;
		Scanner leia = new Scanner(System.in);
		
	
		do
		{
			System.out.println("Digite um n�mero: ");
			num = leia.nextInt();
			
			SomaNum += num;
		
		}
		while(num!=0);
		{
			System.out.println("\nVoc� digitou zero, vamos finalizar o sistema");
			System.out.println("\nA soma dos n�meros digitados �: "+SomaNum);
		}
			
			
		
		}
	}


