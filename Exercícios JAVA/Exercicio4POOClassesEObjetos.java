package Exercicicios;

public class Exercicio4POOClassesEObjetos {

	
	//declara��o de atributos da classe
	
	private String matricula;
	private String setor;
	private String funcao;
	
	//declara��o de m�todo construtor
	
	public Exercicio4POOClassesEObjetos (String matricula, String setor, String funcao)
	{
		this.matricula = matricula;
		this.setor = setor;
		this.funcao = funcao;
		
	}

	//declara��o de m�todos gerais
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	public void mostrar4()
	{
	System.out.println("\nO funcion�rio de matr�cula "+matricula+" foi designado para o setor de "+setor+" para exercer a fun��o de "+funcao);
	}
	
}
