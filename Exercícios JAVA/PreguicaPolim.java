package Exercicicios;

public abstract class PreguicaPolim extends AnimalPolim {

	public PreguicaPolim()
	{
		super("� um pregui�a");
	}
	
	
	@Override
	public void nome(String nome)
	{
	System.out.println("\nEsse bicho pregui�a se chama: "+nome);
	}
	@Override
	public void idade(String idade)
	{
	System.out.println("\nA idade do bicho pregui�a �: "+idade+ " anos.");
	}
	@Override
	public void som(String som)
	{
	System.out.println("\nO som que o bicho pregui�a emite �: "+som);
	}
}
