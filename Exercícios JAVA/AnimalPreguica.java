package Exercicicios;

public class AnimalPreguica extends AnimalHeranca{
	
	private String garras;
	private String lentidao;
	private String subir;
	
	public AnimalPreguica(String nome, int idade,String som,String garras,String lentidao,String subir)
	{
		super(nome,idade,som);
		this.garras = garras;
		this.lentidao = lentidao;
		this.subir = subir;
	}

	public String getGarras() {
		return garras;
	}

	public void setGarras(String garras) {
		this.garras = garras;
	}

	public String getLentidao() {
		return lentidao;
	}

	public void setLentidao(String lentidao) {
		this.lentidao = lentidao;
	}
	
	
	public String getSubir() {
		return subir;
	}

	public void setSubir(String subir) {
		this.subir = subir;
	}

	public void mostrar()
	{
		System.out.println("\nEu dei pra esse bicho pregui�a o nome de "+getNome()+", ele possui a idade de "+getIdade()+
				" anos, ele emite o som "+getSom()+ ", suas garras est�o "+garras+" grandes, ele � "+lentidao+ " lento e "+subir+ " subir em �rvores");
	}
/*Eu dei pra esse bicho pregui�a o nome de Bernardo, ele possui a idade de 15 anos, ele emite o som zzzzzzz.
 *  suas garras est�o muito grandes, ele � muito lento e vai subir em �rvores.
 */
}
