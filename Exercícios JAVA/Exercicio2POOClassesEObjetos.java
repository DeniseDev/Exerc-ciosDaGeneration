package Exercicicios;

public class Exercicio2POOClassesEObjetos {
	
	//declara��o de atributos da classe
	
	private String conforto;
	private String seguran�a;
	private String velocidade;

	
	//declara��o do m�todo construtor
	
	public Exercicio2POOClassesEObjetos (String conforto,String seguran�a,String velocidade)
	{
		this.conforto = conforto;
		this.seguran�a = seguran�a;
		this.velocidade = velocidade;
	}


	//declara��o de m�todos gerais
	public String getConforto() {
		return conforto;
	}


	public void setConforto(String conforto) {
		this.conforto = conforto;
	}


	public String getSeguran�a() {
		return seguran�a;
	}


	public void setSeguran�a(String seguran�a) {
		this.seguran�a = seguran�a;
	}


	public String getVelocidade() {
		return velocidade;
	}


	public void setVelocidade(String velocidade) {
		this.velocidade = velocidade;
	}
	 
	public void mostrar()
	{
		System.out.printf("\nO avi�o � " +conforto+ " confort�vel, nos passa " +seguran�a+ " seguran�a e � " + velocidade + " veloz");
	}
	
	//s� deixou de dar erro quando usei o printf
	
}
