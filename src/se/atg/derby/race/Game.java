package se.atg.derby.race;

import java.util.Map;

public class Game {
	public String id;
	public BetType status;
	public String rules;
	public Map<BetType, Pool> pools;
	public RacingSheet[] races;
	public int currentVersion;
	public int previousVersion;
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
	public Map<BetType, Pool> getPools() {
		return pools;
	}
	public void setPools(Map<BetType, Pool> pools) {
		this.pools = pools;
	}
	public RacingSheet[] getRaces() {
		return races;
	}
	public void setRaces(RacingSheet[] races) {
		this.races = races;
	}
	public int getCurrentVersion() {
		return currentVersion;
	}
	public void setCurrentVersion(int currentVersion) {
		this.currentVersion = currentVersion;
	}
	public int getPreviousVersion() {
		return previousVersion;
	}
	public void setPreviousVersion(int previousVersion) {
		this.previousVersion = previousVersion;
	}


}
