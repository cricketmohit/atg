package se.atg.derby.race;

public class ResultGame {
	public String id;
	public Track[] tracks;

	public String startTime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Track[] getTracks() {
		return tracks;
	}
	public void setTracks(Track[] tracks) {
		this.tracks = tracks;
	}

	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}


}
