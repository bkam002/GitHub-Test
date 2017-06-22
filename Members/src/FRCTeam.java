import java.lang.reflect.Array;

public class FRCTeam extends Team{
	private final String robot = "FRCRobot";
	static String game = new String();
	static int x = 0;
	static int i = 0;
	static String[] games = new String[x];
	public static void setGames(String dName){
		games[x]=dName;
		x++;
	}
	public static int getAverageScore(){
		int total = FRCGame.teamScore[i];
		for(int i = 1; i<x;i++){
			total = total+FRCGame.teamScore[i];
		}
		return Math.round(total/x);
	}
	public String[] getGames(){
		return games;
		
	}
	public String getFRCRobot(){
		return robot;
	}
	public FRCTeam(int dteamNumber, String dName) {
		super(dteamNumber, dName, dteamNumber);
		// TODO Auto-generated constructor stub
	}

    @Override
	public String get2017Game() {
		game = "FIRST Stronghold";
		return game;
	}

}
