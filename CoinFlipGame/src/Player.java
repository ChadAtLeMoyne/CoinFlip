import java.util.Scanner;

public class Player {

	public static final int STARTING_POINTS = 100;
	protected String name;
	protected int currentPoints;
	protected boolean automated;

	public Player() {
		this.currentPoints = Player.STARTING_POINTS;
		automated = false;
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

	public boolean getGuess() {
		if(automated) return Coin.getInstance().flip();
		
		Scanner in = new Scanner(System.in);
		for(;;) {
			System.out.print("Heads or Tails (H/T/Heads/Tails): ");
			String choice = in.nextLine();
			if (choice.length() == 1) {
				if(choice.compareToIgnoreCase("H") == 0) {
					System.out.println("You chose heads.");
					return Coin.HEADS;
				} else if (choice.compareToIgnoreCase("T") == 0) {
					System.out.println("You chose tails.");
					return Coin.TAILS;
				} else if (choice.compareToIgnoreCase("A") == 0) {
					automated = true;
					return Coin.getInstance().flip();
				}
			} else if(choice.compareToIgnoreCase("Heads") == 0) {
				System.out.println("You chose heads.");
				return Coin.HEADS;
			} else if(choice.compareToIgnoreCase("Tails") == 0) {
				System.out.println("You chose tails.");
				return Coin.TAILS;
			}
		}			
	}

}





