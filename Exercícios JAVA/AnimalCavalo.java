package Exercicicios;

public class AnimalCavalo extends AnimalHeranca{
	
	private String bravo;
	private String veloz;
	private String correr;
	
	public AnimalCavalo(String nome, int idade,String som,String bravo, String veloz,String correr)
	{
		super(nome,idade,som);
		this.bravo = bravo;
		this.veloz = veloz;
		this.correr = correr;
	}

	public String getBravo() {
		return bravo;
	}

	public void setBravo(String bravo) {
		this.bravo = bravo;
	}

	public String getVeloz() {
		return veloz;
	}

	public void setVeloz(String veloz) {
		this.veloz = veloz;
	}		
	
	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}

	public void mostrar()
	{
		System.out.println("\nEsse cavalo é chamado de "+getNome()+", tem "+getIdade()+ " anos, emite o som " +getSom()+ 
		", é " +bravo+ " bravo, " +veloz+ " veloz e corre " +correr);
	}
// Esse cavalo é chamado de lula, tem 13 anos, emite o som hihihih é muito bravo, muito veloz e corre muito. 
}
