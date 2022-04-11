package Exercicicios;


public class TesteAnimalPolim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CachorroPolim cachorro = new CachorroPolim();
		CavaloPolim cavalo = new CavaloPolim();
		PreguicaPolim preguica = new PreguicaPolim();
		
	
		System.out.println(cachorro.getAnimal());
		cachorro.nome("Theo");
		cachorro.idade("7");
		cachorro.som("AU AU AU");
		
		System.out.println(cavalo.getAnimal());
		cavalo.nome("Lula");
		cavalo.idade("13");
		cavalo.som("HI HI HI");
		
		System.out.println(preguica.getAnimal());
		preguica.nome("Bernardo");
		preguica.idade("15");
		preguica.som("zZzZzZz");


	}

}
