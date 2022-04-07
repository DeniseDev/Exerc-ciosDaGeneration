package Exercicicios;

public class Exercicio1POOClassesEObjetos {
	//declaração de atributos da classe
	
	private String nomeCliente;
	private String cpf;
	private String idade;
	
	//declação do método construtor
	
	public Exercicio1POOClassesEObjetos (String nomeCliente,String cpf,String idade)
	{
		this.nomeCliente = nomeCliente;  // this
		this.cpf = cpf;
		this.idade = idade;
	}

	
	//declaração dos métodos gerais
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	public void imprimir()
	{
		System.out.println("\nNome do cliente: "+nomeCliente+" com o cpf: "+cpf+ " tem "+idade+ " anos");
	}
	
	
	
}
