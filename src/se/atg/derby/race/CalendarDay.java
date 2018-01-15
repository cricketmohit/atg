package se.atg.derby.race;

import java.util.List;
import java.util.Map;

public class CalendarDay {
	public String date;
	public CalendarTrack[] tracks;
	public Map<BetType,List> games;
	public long currentVersion;
	public long previousVersion;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public CalendarTrack[] getTracks() {
		return tracks;
	}
	public void setTracks(CalendarTrack[] tracks) {
		this.tracks = tracks;
	}
	public Map<BetType, List> getGames() {
		return games;
	}
	public void setGames(Map<BetType, List> games) {
		this.games = games;
	}
	public long getCurrentVersion() {
		return currentVersion;
	}
	public void setCurrentVersion(long currentVersion) {
		this.currentVersion = currentVersion;
	}
	public long getPreviousVersion() {
		return previousVersion;
	}
	public void setPreviousVersion(long previousVersion) {
		this.previousVersion = previousVersion;
	}

}
