package se.atg.derby.race;

public class LandingPage {
	public BetType betType;
	public UpcomingGame[] upcoming;
	public ResultGame []results;
	public BetType getBetType() {
		return betType;
	}
	public void setBetType(BetType betType) {
		this.betType = betType;
	}
	public UpcomingGame[] getUpcoming() {
		return upcoming;
	}
	public void setUpcoming(UpcomingGame[] upcoming) {
		this.upcoming = upcoming;
	}
	public ResultGame[] getResults() {
		return results;
	}
	public void setResults(ResultGame[] results) {
		this.results = results;
	}

}
