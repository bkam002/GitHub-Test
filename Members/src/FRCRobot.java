
public abstract class FRCRobot implements HasWeight {
private String name;
private int weight;
public final int MAX_WEIGHT = 120;
public void setName(String dName){
	name=dName;
}
public String getName(){
	return name;
}
public void setWeigt(int dWeight){
	weight=dWeight;
}
public int getWeigt(){
	return weight;
}
public FRCRobot(String dName, int dWeight){
	name=dName;
	weight=dWeight;
}
}
