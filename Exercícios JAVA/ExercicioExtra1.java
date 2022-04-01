package Exercicicios;

import java.util.Scanner;

public class ExercicioExtra1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ano, mes, dia, total;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite sua idade em anos: ");
		ano = leia.nextInt();
		System.out.println("\nVocê tem "+ano+ " e quantos meses?");
		mes = leia.nextInt();
		System.out.println("\nDigite o dia de hoje: ");
		dia = leia.nextInt();
		
		total = (ano*365) + (mes*30) + dia;
		
		System.out.println("\nSua idade, em dias, é: "+total);
		
	}

}
