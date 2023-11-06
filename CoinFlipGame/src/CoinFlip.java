
public class CoinFlip {
	Player player;
	Coin coin;
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
		return CoinFlip.WIN;
	}
	
	protected int getWager() {
		return 5;
	}
	protected boolean getGuess() {
		return Coin.HEADS;
		
	}
	
	protected boolean flipCoin() {
		return coin.flip();
		
	}
}









