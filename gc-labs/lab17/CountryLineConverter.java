package lab17;


public class CountryLineConverter implements LineConverter<Country>{

	@Override
	public String toLine(Country country) {
		return String.format("%s\t%d", country.getName(),country.getPopulation());
	}

	@Override
	public Country fromLine(String line) {
		String[] parts = line.split("\t");
		String name = parts[0];
		int population = Integer.parseInt(parts[1]);
		return new Country(name,population);
		}

	
}
