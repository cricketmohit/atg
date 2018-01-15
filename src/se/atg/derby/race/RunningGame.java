package se.atg.derby.race;


public class RunningGame {
	public String id;
	public BetType status;
	public String rules;
	public String startTime;
	public String scheduledStartTime;
	public int [] tracks;
	public String[] races;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public BetType getStatus() {
		return status;
	}
	public void setStatus(BetType status) {
		this.status = status;
	}
	public String getRules() {
		return rules;
	}
	public void setRules(String rules) {
		this.rules = rules;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getScheduledStartTime() {
		return scheduledStartTime;
	}
	public void setScheduledStartTime(String scheduledStartTime) {
		this.scheduledStartTime = scheduledStartTime;
	}
	public int[] getTracks() {
		return tracks;
	}
	public void setTracks(int[] tracks) {
		this.tracks = tracks;
	}
	public String[] getRaces() {
		return races;
	}
	public void setRaces(String[] races) {
		this.races = races;
	}


}
