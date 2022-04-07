package Exercicicios;

public class AnimalCachorro extends AnimalHeranca {
	
	private String peludo;
	private String mordedor;
	private String correr;
	
	public AnimalCachorro(String nome,int idade,String som,String peludo,String mordedor,String correr)
	{
		super(nome,idade,som);
		this.peludo = peludo;
		this.mordedor = mordedor;
		this.correr = correr;
	}

	public String getPeludo() {
		return peludo;
	}

	public void setPeludo(String peludo) {
		this.peludo = peludo;
	}

	public String getMordedor() {
		return mordedor;
	}

	public void setMordedor(String mordedor) {
		this.mordedor = mordedor;
	}
	 	
	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}

	public void mostrar()
	{
		System.out.println("\nO nome do cachorro é: "+getNome()+", ele possui a idade de "+getIdade()+" meses, emite o som "+getSom()+
				", é "+peludo+" peludo , "+mordedor+ " mordedor e corre "+correr);
		
		// A raça desse cachorro é poodle, ele possui a idade de 7 meses, emite o som AUAU, é pouco peludo, muito mordedor e corre muito.
	}
	
	
	

}
