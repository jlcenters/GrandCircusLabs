package lab17;

public class Country {

	protected  String name;
	protected  int population;
	public  String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public  int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	
	
	
	public Country(String name, int population) {
		super();
		this.name = name;
		this.population = population;
	}
	public Country() {
		super();
	}
	
	
	
	@Override
	public String toString() {
		return String.format("%s holds %d people", name, population);
	}
	
	
}
