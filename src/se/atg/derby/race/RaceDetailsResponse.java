package se.atg.derby.race;

public class RaceDetailsResponse {
	public String response;
	public ErrorResultBaseType error;


	public ErrorResultBaseType getError() {
		return error;
	}

	public void setError(ErrorResultBaseType error) {
		this.error = error;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}


}
