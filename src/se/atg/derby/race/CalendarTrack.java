package se.atg.derby.race;

public class CalendarTrack {
	public int id;
	public String name;
	public String startTime;
	public String nextRace;
	public CalendarRace[] races;
	public BetType biggestGameType;
	public Sport sport;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getNextRace() {
		return nextRace;
	}
	public void setNextRace(String nextRace) {
		this.nextRace = nextRace;
	}
	public CalendarRace[] getRaces() {
		return races;
	}
	public void setRaces(CalendarRace[] races) {
		this.races = races;
	}
	public BetType getBiggestGameType() {
		return biggestGameType;
	}
	public void setBiggestGameType(BetType biggestGameType) {
		this.biggestGameType = biggestGameType;
	}
	public Sport getSport() {
		return sport;
	}
	public void setSport(Sport sport) {
		this.sport = sport;
	}
}
