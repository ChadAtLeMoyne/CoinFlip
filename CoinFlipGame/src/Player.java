
public class Player {

	public static final int STARTING_POINTS = 100;
	protected String name;
	protected int currentPoints;

	public Player() {
		this.currentPoints = Player.STARTING_POINTS;
	}
	
	public void setName(String string) {
		this.name= string;
	}

	public String getName() {
		return name;
	}

	public int getPoints() {
		return currentPoints;
	}

	public static int getLoseScore() {
		return Player.STARTING_POINTS / 2;
	}

	public static int getWinScore() {
		return Player.STARTING_POINTS * 2;
	}

	public void adjustPoints(int wager) {
		currentPoints += wager;
		
	}

}
