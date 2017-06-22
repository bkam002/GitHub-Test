
public class Lead extends Member{
public String title;
	public Lead(String dname, int dgradelevel, String dsubteam, boolean disReturningMember) {
		super(dname, dgradelevel, dsubteam, disReturningMember);
		if(dsubteam.equals("Mechanical") ){
			dsubteam="Mechanical Lead";
		}
		else if(dsubteam.equals("Programming")){
			dsubteam="Programming Lead";
		}
		else if(dsubteam.equals("CAD")){
				dsubteam="CAD Lead";
	}
		else if(dsubteam.equals("Electrical")){
			dsubteam="Electrical Lead";
		}
		else if(dsubteam.equals("Design")){
			dsubteam="Design Lead";
		}
		else if(dsubteam.equals("Operations")){
			dsubteam="Operations Lead";
		}
		else if(dsubteam.equals("PR")){
			dsubteam="PR Lead";
		}
	}
	@Override
	public boolean isComputerSlave(){
		ComputerSlave=true;
		return ComputerSlave;
	}
	public String getTitle(){
		return title;
	}
}
