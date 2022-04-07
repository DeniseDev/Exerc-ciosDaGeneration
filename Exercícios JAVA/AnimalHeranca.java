package Exercicicios;

public class AnimalHeranca {
	
	//declara��o de atributos da classe
	
		private String nome;
		private int idade;
		private String som;
		
		
		//declara��o do m�todo construtor
		
		public AnimalHeranca (String nome, int idade, String som)
		
		{
			super();
			this.nome = nome;
			this.idade = idade;
			this.som = som;
		
		}

		//declara��o de m�todos gerais
		
		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public int getIdade() {
			return idade;
		}


		public void setIdade(int idade) {
			this.idade = idade;
		}
		
		
		
		
		public String getSom() {
			return som;
		}

		public void setSom(String som) {
			this.som = som;
		}

		public void mostrar()
		{
			System.out.println("\nO animal � um(a) "+nome+" e sua idade � "+idade+" anos e ele emite o som: "+som);
		}
		
		

		

}
