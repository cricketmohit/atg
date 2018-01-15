package se.atg.derby.race;

public class TrackDetails {
	public TrackCondition condition;
	public TrackSurface surface;
	public String countryCode;
	public String name;
	public int id;
	public TrackCondition getCondition() {
		return condition;
	}
	public void setCondition(TrackCondition condition) {
		this.condition = condition;
	}
	public TrackSurface getSurface() {
		return surface;
	}
	public void setSurface(TrackSurface surface) {
		this.surface = surface;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
