package roshambolab;

public abstract class Player {

	protected String description;
	protected String name;
	protected int wins;
	protected int losses;
	protected Roshambo rps;
	
	public Roshambo getRps() {
		return rps;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int inc) {
		wins += inc;
	}
	public int getLosses() {
		return losses;
	}
	public void setLosses(int dec) {
		losses += dec;
	}
	public String getDescription() {
		return description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Player(String name, String description, int wins, int losses) {
		super();
		this.name = name;
		this.description = description;
		this.wins = wins;
		this.losses = losses;
		Roshambo rps = Roshambo.SCISSORS;
		this.rps = rps;
	}
	
	public abstract void generateRoShamBo();
	
	public String toString() {
		return null;
	}
}
