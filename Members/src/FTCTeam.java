
public class FTCTeam extends Team{
	String game = new String();
	public FTCTeam(int dteamNumber, String dName) {
		super(dteamNumber, dName, dteamNumber);
		// TODO Auto-generated constructor stub
	}

    @Override
	public String get2017Game() {
		game = "Velocity Vortex";
		return game;
	}
}
