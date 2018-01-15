package se.atg.derby.race;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.sun.grizzly.http.SelectorThread;
import com.sun.jersey.api.container.grizzly.GrizzlyWebContainerFactory;


@Path("searchRace")
public class RunRestService {



	public static void main(String[] args) {
		final String baseUri = "http://localhost:8001/";
		final Map<String, String> initParams = new HashMap<String, String>();

		// Register the package that contains your javax.ws.rs-annotated beans here
		initParams.put("com.sun.jersey.config.property.packages","se.atg.derby.race");

		System.out.println("Starting grizzly...");
		try {
			SelectorThread threadSelector =
				GrizzlyWebContainerFactory.create(baseUri, initParams);
			System.out.println(String.format("Jersey started with WADL "
					+ "available at %sapplication.wadl.", baseUri));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String searchRace() {

		RaceDetailsResponse raceDetailsResponse = new RaceDetailsResponse();

		Gson gson = new Gson();
		try {
			// Calling searchRace through Facade layer
			RaceInquiryFacade raceInquiryFacade = new RaceInquiryFacadeImpl();
			raceDetailsResponse.setResponse(raceInquiryFacade
					.searchRace(new SimpleDateFormat("yyyy-MM-dd")
					.format(new Date())));

		} catch (BaseException serviceException) {

			ErrorResultBaseType erBase = new ErrorResultBaseType();
			erBase.setErrorCode(serviceException.getExceptionCode());
			erBase.setErrorDescription(serviceException.getMessage());
			raceDetailsResponse.setError(erBase);
		}

		return gson.toJson(raceDetailsResponse);
	}
}
