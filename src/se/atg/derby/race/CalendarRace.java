package se.atg.derby.race;

public class CalendarRace {

	public String id;
	public int number;
	public RaceStatus status;
	public String startTime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public RaceStatus getStatus() {
		return status;
	}
	public void setStatus(RaceStatus status) {
		this.status = status;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
