package Exercicicios;

public abstract class PreguicaPolim extends AnimalPolim {

	public PreguicaPolim()
	{
		super("É um preguiça");
	}
	
	
	@Override
	public void nome(String nome)
	{
	System.out.println("\nEsse bicho preguiça se chama: "+nome);
	}
	@Override
	public void idade(String idade)
	{
	System.out.println("\nA idade do bicho preguiça é: "+idade+ " anos.");
	}
	@Override
	public void som(String som)
	{
	System.out.println("\nO som que o bicho preguiça emite é: "+som);
	}
}
