package se.atg.derby.race;

import java.util.Map;

public class RacingSheet {
	public String id;
	public String name;
	public String date;
	public int number;
	public int distance;
	public StartMethod startMethod;
	public String startTime;
	public String scheduledStartTime;
	public String prize;
	public String[] terms;
	public Sport sport;
	public TrackDetails track;
	public RaceResult result;
	public int[] reserveOrder;
	public RaceStatus status;
	public String mediaId;
	public Map<BetType, Pool> pools;
	public Start[] starts;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public StartMethod getStartMethod() {
		return startMethod;
	}
	public void setStartMethod(StartMethod startMethod) {
		this.startMethod = startMethod;
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
	public String getPrize() {
		return prize;
	}
	public void setPrize(String prize) {
		this.prize = prize;
	}
	public String[] getTerms() {
		return terms;
	}
	public void setTerms(String[] terms) {
		this.terms = terms;
	}
	public Sport getSport() {
		return sport;
	}
	public void setSport(Sport sport) {
		this.sport = sport;
	}
	public TrackDetails getTrack() {
		return track;
	}
	public void setTrack(TrackDetails track) {
		this.track = track;
	}
	public RaceResult getResult() {
		return result;
	}
	public void setResult(RaceResult result) {
		this.result = result;
	}
	public int[] getReserveOrder() {
		return reserveOrder;
	}
	public void setReserveOrder(int[] reserveOrder) {
		this.reserveOrder = reserveOrder;
	}
	public RaceStatus getStatus() {
		return status;
	}
	public void setStatus(RaceStatus status) {
		this.status = status;
	}
	public String getMediaId() {
		return mediaId;
	}
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
	public Map<BetType, Pool> getPools() {
		return pools;
	}
	public void setPools(Map<BetType, Pool> pools) {
		this.pools = pools;
	}
	public Start[] getStarts() {
		return starts;
	}
	public void setStarts(Start[] starts) {
		this.starts = starts;
	}


}
