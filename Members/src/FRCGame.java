
public abstract class FRCGame extends Game {
	private String red1;
	private String red2;
	private String red3;
	private String blue1;
	private String blue2;
	private String blue3;
	public static int c = 0;
    public static int[] teamScore = new int[c];
	public FRCGame(String dred1, String dred2, String dred3, String dblue1, String dblue2, String dblue3, int dblueAllianceScore, int dredAllianceScore) {
		super(dblueAllianceScore, dredAllianceScore);
		red1=dred1;
		red2=dred2;
		red3=dred3;
		blue1=dblue1;
		blue2=dblue2;
		blue3=dblue3;
		// TODO Auto-generated constructor stub
	}
	public int getblueAllianceScore(String dName){
		return blueAllianceScore;
	}
	public int getredAllianceScore(){
		return redAllianceScore;
	}
	public void setred1(String dred1){
		red1=dred1;
	}
	public void setred2(String dred2){
		red2=dred2;
	}
	public void setred3(String dred3){
		red3=dred3;
	}
	public void setblue1(String dblue1){
		blue1=dblue1;
	}
	public void setblue2(String dblue2){
		blue2=dblue2;
	}
	public void setblue3(String dblue3){
		blue3=dblue3;
	}
	public void setblueAllianceScore(int dblueAllianceScore){
		setBlueAllianceScore(dblueAllianceScore);
	}
	public void setredAllianceScore(int dredAllianceScore){
		setredAllianceScore(dredAllianceScore);
	}
	public String getred1(){
		return red1;
	}
	public String getred2 (){
		return red2;
	}
	public String getred3(){
		return red3;
	}
	public String getblue1(){
		return blue1;
	}
	public String getblue2(){
		return blue2;
	}
	public String getblue3(){
		return blue3;
	}

	private boolean isBlueAlliance(String dName){
		if(dName.equals(blue1)||dName.equals(blue2)||dName.equals(blue3)){
			return true;
		}
		else{
			return false;
		}
	}
	private boolean isRedAlliance(String dName){
		if(dName.equals(red1)||dName.equals(red2)||dName.equals(red3)){
			return true;
		}
		else{
			return false;
		}
	
	}
	private int getAllianceScore(String dName){
		if(isRedAlliance(dName) == true){
			if(dName.equals(FRCTeam.name)){
					
					teamScore[c] = blueAllianceScore;
					c++;
					}
			
			return redAllianceScore;
		}
		else if(isBlueAlliance(dName)==true){
			if(dName.equals(FRCTeam.name)){
				
				teamScore[c] = blueAllianceScore;
				c++;
				}
			return blueAllianceScore;
		}
		else{
			return -1;
		}
	}
	
	
}
