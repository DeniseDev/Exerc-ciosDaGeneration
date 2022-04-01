package Exercicicios;

import java.util.Scanner;

public class ExercicioExtra2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dias, resto_dias, meses, anos, resto_anos;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEscreva sua idade em dias: ");
		dias = leia.nextInt();
		
		anos = dias / 365;
		resto_anos = dias % 365;
		meses = resto_anos / 30;
		resto_dias = resto_anos % 30;
		
		
		System.out.println("\nVocê tem " +anos+" anos, " +meses+ " meses e " +resto_anos+ " dias de idade.");
	}

}
