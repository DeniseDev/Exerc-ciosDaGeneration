package Exercicicios;

import java.util.ArrayList;
import java.util.List;

public class CollectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> minhaLista = new ArrayList<Integer>();
		
		minhaLista.add(3); 
		minhaLista.add(4);
		minhaLista.add(2);
		minhaLista.add(1);
		minhaLista.add(1);
		minhaLista.add(2);
		minhaLista.add(3);
		
		for(Integer ListaEstoque:minhaLista)
		{
			System.out.println(ListaEstoque);
		}
		
		System.out.println("\nRemovendo um elemento da minha lista...");
		System.out.println();
		minhaLista.remove(3);
		for(Integer ListaEstoque:minhaLista)
		{
			System.out.println(ListaEstoque);
		}
		
		int primeiroProduto = minhaLista.get(0);
		System.out.println("\nO primeiro produto da minha lista é: "+primeiroProduto);
		
		

	}
}
