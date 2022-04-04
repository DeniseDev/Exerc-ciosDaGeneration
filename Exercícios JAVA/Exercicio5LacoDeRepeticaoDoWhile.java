package Exercicicios;

import java.util.Scanner;

public class Exercicio5LacoDeRepeticaoDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/
		
		int num,SomaNum=0;
		Scanner leia = new Scanner(System.in);
		
	
		do
		{
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			
			SomaNum += num;
		
		}
		while(num!=0);
		{
			System.out.println("\nVocê digitou zero, vamos finalizar o sistema");
			System.out.println("\nA soma dos números digitados é: "+SomaNum);
		}
			
			
		
		}
	}


