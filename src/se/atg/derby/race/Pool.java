package se.atg.derby.race;

public class Pool {
	public String id;
	public String status;
	public String timestamp;
	public int turnover;
	public String harry;
	public int systemCount;
	public String potentialPayOutRaceId;
	public String getPotentialPayOutRaceId() {
		return potentialPayOutRaceId;
	}
	public void setPotentialPayOutRaceId(String potentialPayOutRaceId) {
		this.potentialPayOutRaceId = potentialPayOutRaceId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public int getTurnover() {
		return turnover;
	}
	public void setTurnover(int turnover) {
		this.turnover = turnover;
	}
	public String getHarry() {
		return harry;
	}
	public void setHarry(String harry) {
		this.harry = harry;
	}
	public int getSystemCount() {
		return systemCount;
	}
	public void setSystemCount(int systemCount) {
		this.systemCount = systemCount;
	}

}
