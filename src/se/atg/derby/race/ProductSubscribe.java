package se.atg.derby.race;

import java.util.List;

public class ProductSubscribe {
	public String planName;
	public String countryName;

	public CalendarDay calendar;
	public List<LandingPage> landingPage;
	public List<Game>  game;


	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public CalendarDay getCalendar() {
		return calendar;
	}

	public void setCalendar(CalendarDay calendar) {
		this.calendar = calendar;
	}

	public List<LandingPage> getLandingPage() {
		return landingPage;
	}

	public void setLandingPage(List<LandingPage> landingPage) {
		this.landingPage = landingPage;
	}

	public List<Game> getGame() {
		return game;
	}

	public void setGame(List<Game> game) {
		this.game = game;
	}


}
