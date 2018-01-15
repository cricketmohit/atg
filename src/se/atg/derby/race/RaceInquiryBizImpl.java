package se.atg.derby.race;

import com.google.gson.Gson;

public class RaceInquiryBizImpl implements RaceInquiryBiz{


	@Override
	public String createProduct(CalendarDay calendar, LandingPage landingPage,
			Game game) throws BaseException {
		Gson gson = new Gson();
		Product product = new Product();
		product.setProduct("My Bet");
		product.setCalendar(calendar);
		product.setGame(game);
		product.setLandingPage(landingPage);
		return gson.toJson(product);

	}

}
