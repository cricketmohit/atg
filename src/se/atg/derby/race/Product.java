package se.atg.derby.race;

public class Product {
	String product;
	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public CalendarDay calendar;
	public LandingPage landingPage;
	public Game game;
	public CalendarDay getCalendar() {
		return calendar;
	}

	public void setCalendar(CalendarDay calendar) {
		this.calendar = calendar;
	}

	public LandingPage getLandingPage() {
		return landingPage;
	}

	public void setLandingPage(LandingPage landingPage) {
		this.landingPage = landingPage;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}
}
