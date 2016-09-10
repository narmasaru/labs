package Lab12;

public class RockPlayer extends Player {

	public RockPlayer(String playerName) {
		super(playerName);

	}

	@Override
	public Roshambo generateRoshambo() {
		System.out.println("ROCK PLAYER ::" + " Rock");

		return (Roshambo.ROCK);

	}

}
