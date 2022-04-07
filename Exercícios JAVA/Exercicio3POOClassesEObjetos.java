package Exercicicios;

public class Exercicio3POOClassesEObjetos {

	//declaração de atributos da classe

	private String tipo;
	private String cor;
	private String armazenamento;
	private String memoria;
	
	
	//declaração de método construtor
	
	public Exercicio3POOClassesEObjetos (String tipo, String cor, String armazenamento, String memoria)
	{
		this.tipo = tipo;
		this.cor = cor;
		this.armazenamento = armazenamento;
		this.memoria = memoria;
	}


	//declaração de métodos gerais
	
	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getArmazenamento() {
		return armazenamento;
	}


	public void setArmazenamento(String armazenamento) {
		this.armazenamento = armazenamento;
	}


	public String getMemoria() {
		return memoria;
	}


	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}
	
	public void mostrar3()
	{
		System.out.println("\nO produto eletrônico é um "+tipo+", com a cor "+cor+", com um armazenamento de "+armazenamento+" e uma memória de "+memoria);
	}
}
