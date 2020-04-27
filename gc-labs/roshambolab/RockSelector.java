package roshambolab;

public class RockSelector extends Player{

	public RockSelector(String name,String description,int wins, int losses) {
		super(name,description, wins, losses);
	}
	
	@Override
	public String toString() {
		return String.format("%s", name);
	}

	@Override
	public void generateRoShamBo() {
		this.rps = Roshambo.ROCK;
	}
	

}
