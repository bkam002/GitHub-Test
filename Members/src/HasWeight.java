
public interface HasWeight {
public abstract int getWeight();
public default boolean isHeavy(){
	getWeight();
	if(getWeight()>100){
		return true;
	}
	else{
		return false;
	}
}
}
