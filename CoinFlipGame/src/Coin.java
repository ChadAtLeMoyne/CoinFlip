import java.util.Random;

public class Coin {

	public static final boolean HEADS = true;
	public static final boolean TAILS = false;
	private static Coin instance;

	private Coin() {}
	
	public boolean flip() {
		return new Random().nextBoolean();
	}

	public static Coin getInstance() {
		if (Coin.instance == null) {
			Coin.instance = new Coin();
		}
		return Coin.instance;
	}

}








