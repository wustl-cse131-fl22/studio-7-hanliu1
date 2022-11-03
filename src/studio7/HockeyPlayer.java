package studio7;

public class HockeyPlayer {
	private String name;
	private int jerseyNumber;
	private int points;
	private int goals;
	private int assists;
	private int totalpoints=this.goals+this.assists;
	
	public HockeyPlayer(String name, int jerseyNumber, int goals, int assists, int points){
		this.name=name;
		this.jerseyNumber=jerseyNumber;
		this.goals=goals;
		this.assists=assists;
		this.points=points;
	}
	
	
	public int games() {
		return this.totalpoints/this.points;
	}

}
