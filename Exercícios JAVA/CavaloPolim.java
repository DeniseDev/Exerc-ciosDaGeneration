package Exercicicios;

public abstract class CavaloPolim extends AnimalPolim {

	public CavaloPolim()
	{
		super("� um cavalo");
	}
	
	
	@Override
	public void nome(String nome)
	{
	System.out.println("\nEsse cavalo se chama: "+nome);
	}
	@Override
	public void idade(String idade)
	{
	System.out.println("\nA idade do cavalo �: "+idade+ " anos.");
	}
	@Override
	public void som(String som)
	{
	System.out.println("\nO som que o cavalo emite �: "+som);
	}
}
