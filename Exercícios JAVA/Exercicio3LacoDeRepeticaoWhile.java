package Exercicicios;

import java.util.Scanner;

public class Exercicio3LacoDeRepeticaoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/
		
		int idade,tcmenos21=0,tcmais50=0,ContIdade=0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite sua idade: ");
		idade = leia.nextInt();
		
		while(idade!=-99)
		{
			ContIdade++;
			System.out.println("\nDigite sua idade: ");
			idade = leia.nextInt();
		
		if(idade<21)
		{
			tcmenos21++;
		}
		if(idade>50)
		{
			tcmais50++;
		}
		}
		System.out.println("\nO total de pessoas com menos de 21 anos é: "+tcmenos21);
		System.out.println("\nO total de pessoas com mais de 50 anos é: "+tcmais50);
		
		
	}
}
