package Lab12;

public class Player {

	private String playerName;           //Player base class,and attribute player is defined as private
	
	
	

	public Player(String playerName) {
		this.playerName = playerName;
	}

	public Roshambo generateRoshambo() {
		return null;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;

	}

	public String getPlayerName() {
		return playerName;
	}

}
