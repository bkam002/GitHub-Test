import java.util.ArrayList;

public class Member implements Spirited, HasWeight {
	protected static String  name;
	protected int gradeLevel;
	protected static String subTeam;
	protected boolean isReturningMember;
	protected boolean ComputerSlave;
	public int weight;
	public Member(String dname, int dgradelevel, String dsubteam, boolean disReturningMember){
		name = dname;
		gradeLevel = dgradelevel;
		subTeam = dsubteam;
		isReturningMember = disReturningMember;
	}
	public void setWeight(int dWeight){
		weight = dWeight;
	}
	public int getWeight(){
		return weight;
	}
	public String showTeamSpirit(){
		String tSpirit = new String();
		if(subTeam.equals("Programming")){
		tSpirit = "3473";
			return tSpirit;
		}
		else{
		tSpirit = "110110010001";
		return tSpirit;
		}
	}
	public String getsubTeam(){
		return subTeam;
	}
	public void setsubTeam(String b){
		subTeam = b;
	}
	public void setisReturningMember(boolean a){
		isReturningMember = a;
	}
	public boolean getisReturningMember(){
		return isReturningMember;
	}
	public void setName(String z){
		name = z;
	}
	public String getName(){
		return name;
	}
	public int getgradeLevel(){
		return gradeLevel;
	}
	public void setgradeLevel(int aa){
		gradeLevel = aa;
	}
	public void graduate(){
		isReturningMember = true;
		gradeLevel++;
	}
	public static char getFirstInitialOfName(String dName){
		return dName.charAt(0);
	}
	public boolean isComputerSlave(){
		if(subTeam.equals("Programming") || subTeam.equals("CAD")||subTeam.equals("Operations")||subTeam.equals("PR")||subTeam.equals("design")){
			ComputerSlave= true;
		}
		else{
			ComputerSlave=false;
		}
		return ComputerSlave;
	}


}
