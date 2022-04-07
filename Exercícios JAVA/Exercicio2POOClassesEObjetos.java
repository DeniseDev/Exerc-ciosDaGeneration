package Exercicicios;

public class Exercicio2POOClassesEObjetos {
	
	//declaração de atributos da classe
	
	private String conforto;
	private String segurança;
	private String velocidade;

	
	//declaração do método construtor
	
	public Exercicio2POOClassesEObjetos (String conforto,String segurança,String velocidade)
	{
		this.conforto = conforto;
		this.segurança = segurança;
		this.velocidade = velocidade;
	}


	//declaração de métodos gerais
	public String getConforto() {
		return conforto;
	}


	public void setConforto(String conforto) {
		this.conforto = conforto;
	}


	public String getSegurança() {
		return segurança;
	}


	public void setSegurança(String segurança) {
		this.segurança = segurança;
	}


	public String getVelocidade() {
		return velocidade;
	}


	public void setVelocidade(String velocidade) {
		this.velocidade = velocidade;
	}
	 
	public void mostrar()
	{
		System.out.printf("\nO avião é " +conforto+ " confortável, nos passa " +segurança+ " segurança e é " + velocidade + " veloz");
	}
	
	//só deixou de dar erro quando usei o printf
	
}
