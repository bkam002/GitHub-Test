
public interface Spirited {
String showTeamSpirit();



public default void chant(int n){
	for(int i = 1; i<n;i++){
	System.out.println(showTeamSpirit());
}}
}