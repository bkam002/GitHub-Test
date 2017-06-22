import java.util.ArrayList;
//SET COUNT = 0 WHEN USING MAIN 
public abstract class Team {
	public int count;
	public static	ArrayList <String> mmembers=new ArrayList<>();
	public static ArrayList <String> subteamSearch;
	public ArrayList <String> blank;
	public static String name;
	public int teamNumber;
	public String members;
	private final int rookieYear;
	public final int NUMBER_OF_FRC_TEAMS_IN_2017 = 3357;
	public final String EXPANSION_OF_FIRST = "For Inspiration and Recognition in Science and Technology";
	public Team(int dteamNumber, String dName, int drookieYear){
		teamNumber=dteamNumber;
		name=dName;
		rookieYear = drookieYear;
	}
	public abstract String get2017Game();
	
    
	public void setName(String bb){
		name=bb;
	}
	public int getrookieYear(){
		return rookieYear;
	}
	public String getName(){
		return name;
	}
	public void setTeamNumber(int cc){
		teamNumber=cc;
	}
	public int getTeamNumber(){
		return teamNumber;
	}
	public void addMember(String Member){
		count++;
		mmembers.add( Member);
	}
	public ArrayList <String> getAllSubteamMembers(String st){
		subteamSearch=mmembers;
		if(st.equals("Programming")){
		
			for(int j=1; j<count;j++){
				if(!Member.subTeam.equals("Programming")){
					subteamSearch.remove(j);
				}
			}
		}
		 if(st.equals("Mechanical")){
		
			for(int j=1; j<count;j++){
				if(!Member.subTeam.equals("Mechanical")){
					subteamSearch.remove(j);
				}
			}
		}
		 if(st.equals("Electrical")){
	
			for(int j=1; j<count;j++){
				if(!Member.subTeam.equals("Electrical")){
					subteamSearch.remove(j);
				}
			}
		}
		 if(st.equals("CAD")){
		
			for(int j=1; j<count;j++){
				if(!Member.subTeam.equals("CAD")){
					subteamSearch.remove(j);
				}
			}
		}
		 if(st.equals("Operations")){
		
			for(int j=1; j<count;j++){
				if(!Member.subTeam.equals("Operations")){
					subteamSearch.remove(j);
				}
			}
		}
		 if(st.equals("Design")){
	
			for(int j=1; j<count;j++){
				if(!Member.subTeam.equals("Design")){
					subteamSearch.remove(j);
				}
			}
		}
		 if(st.equals("PR")){
	
			for(int j=1; j<count;j++){
				if(!Member.subTeam.equals("PR")){
					subteamSearch.remove(j);
				}
			}
		}
		
		return subteamSearch;
	}
	
	public static void main(String[] args) {
		//Team jj = new Team(13, "sd");
		//Member a = new Member("a", 12, "Programming", true);
		//Member b = new Member("b", 11, "Mechanical", true);
		//Member C= new Member("C", 13, "Electrical", true);
		//jj.addMember("a");
		//jj.addMember("b");
		//jj.addMember("C");
		//jj.getAllSubteamMembers("Programming");
		//System.out.println(subteamSearch);
	}
}
