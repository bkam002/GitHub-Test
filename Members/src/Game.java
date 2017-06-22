
public abstract class Game {
protected int blueAllianceScore;
protected int redAllianceScore;
public Game(int dblueAllianceScore, int dredAllianceScore){
	blueAllianceScore=dblueAllianceScore;
	redAllianceScore=dredAllianceScore;
}
public int getblueAllianceScore(){
	return getBlueAllianceScore();
}
public int getredAllianceScore(){
	return redAllianceScore;
}
public int getBlueAllianceScore() {
	return blueAllianceScore;
}
public void setBlueAllianceScore(int blueAllianceScore) {
	this.blueAllianceScore = blueAllianceScore;
}
}
