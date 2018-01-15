package se.atg.derby.race;


public class RaceInquiryFacadeImpl implements RaceInquiryFacade {

	public static void main(String[] args) throws BaseException {
		RaceInquiryFacadeImpl imp = new RaceInquiryFacadeImpl();
		imp.searchRace("2017-10-24");
	}

	@Override
	public String searchRace(String date) throws BaseException {
		//		Get Calendar Data
		CalendarDayProxy calProxy = new CalendarDayProxy();
		CalendarDay calendar = calProxy.getCalendar(date);
		//		//		Get Landing Page
		LandingPageProxy proxy = new LandingPageProxy();
		LandingPage landingPage = proxy.getLandingPage("V5");
		//		Get Game
		GameProxy gameProxy = new GameProxy();
		Game game = gameProxy.getGame("V5_2017-10-24_7_5");
		RaceInquiryBiz biz = new RaceInquiryBizImpl();



		return biz.createProduct(calendar,landingPage,game);
	}

}
