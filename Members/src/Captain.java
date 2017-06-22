
public class Captain extends Member{
public String title;
	public Captain(String dname, int dgradelevel, String dsubteam, boolean disReturningMember) {
		super(dname, dgradelevel, dsubteam, disReturningMember);
		if(subTeam.equals("Mechanical")||subTeam.equals("Electrical")||subTeam.equalsIgnoreCase("Programming")||subTeam.equals("CAD")){
			title="Engineering Captain";
		}
		else if(subTeam.equals("Operations")||subTeam.equals("PR")||subTeam.equals("Design")){
			title="Buisness Captain";
		}
	}
	@Override
	public boolean isComputerSlave(){
		ComputerSlave=false;
		return ComputerSlave;
	}
	public String getTitle(){
		return title;
	}

}
