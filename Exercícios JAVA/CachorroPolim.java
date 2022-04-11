package Exercicicios;

public abstract class CachorroPolim extends AnimalPolim {

	public CachorroPolim()
	{
		super("� um cachorro");
	}
	
	
	@Override
	public void nome(String nome)
	{
	System.out.println("\nEle se chama: "+nome);
	}
	@Override
	public void idade(String idade)
	{
	System.out.println("\nA idade do cachorro �: "+idade+ " anos.");
	}
	@Override
	public void som(String som)
	{
	System.out.println("\nO som que o cachorro emite �: "+som);
	}
}
