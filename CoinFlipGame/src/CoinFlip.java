
public class CoinFlip {
	protected Player player;
	protected Coin coin;
	public static final boolean WIN = true;
	
	public static void main(String[] args) {
		if (new CoinFlip().play() == CoinFlip.WIN) {
			System.out.println("Yay, you won");
		} else {
			System.out.println("Bummer, you lost");
		}

	}
	
	public CoinFlip() {
		player = new Player();
		coin = Coin.getInstance();
		
	}
	public boolean play() {
		player.setName("Rusty Katt");
		System.out.println("Hello, " + player.getName());
		System.out.println("Here are " + player.getPoints() + " points to start!");
		
		while(player.getPoints() >= Player.getLoseScore() && 
				player.getPoints() <= Player.getWinScore()) {
			int wager = getWager();
			boolean guess = getGuess(player);
			boolean result = flipCoin();
			if (guess == result) {
				System.out.println("You guessed right!");
				player.adjustPoints(wager);
			} else {
				System.out.println("You guess wrong!");
				player.adjustPoints(-wager);
			}
			System.out.println("You now have " + player.getPoints() +
					" points.");
		}
		
		if(player.getPoints() < Player.getLoseScore()) {
			return !CoinFlip.WIN;
		} else {
			return CoinFlip.WIN;
		}
		
	}
	
	protected int getWager() {
		return 10;
	}
	
	protected boolean getGuess(Player p) {
		return p.getGuess();
		
	}
	
	protected boolean flipCoin() {
		return coin.flip();
		
	}
	
}









