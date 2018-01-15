package se.atg.derby.race;

public class UpcomingGame {
	public String id;
	public String startTime;
	public Track[] tracks;
	public FavoriteInfo[] favorites;
	public CombinationOdds[] mostPlayed;
	public String [] addOns;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public Track[] getTracks() {
		return tracks;
	}
	public void setTracks(Track[] tracks) {
		this.tracks = tracks;
	}
	public FavoriteInfo[] getFavorites() {
		return favorites;
	}
	public void setFavorites(FavoriteInfo[] favorites) {
		this.favorites = favorites;
	}
	public CombinationOdds[] getMostPlayed() {
		return mostPlayed;
	}
	public void setMostPlayed(CombinationOdds[] mostPlayed) {
		this.mostPlayed = mostPlayed;
	}
	public String[] getAddOns() {
		return addOns;
	}
	public void setAddOns(String[] addOns) {
		this.addOns = addOns;
	}
}
