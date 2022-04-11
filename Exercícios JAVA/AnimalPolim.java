package Exercicicios;

public abstract class AnimalPolim {
	
	public String animal;
	
	
	public AnimalPolim(String animal)
	{
		this.animal = animal;
		
	}
	
	abstract public void nome(String nome);
	abstract public void idade(String idade);
	abstract public void emite(String som);

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public void som(String som) {
		// TODO Auto-generated method stub
		
	}
	
}
