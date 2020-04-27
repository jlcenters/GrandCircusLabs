package co.grandcircus.lab28;

import java.util.List;

import co.grandcircus.lab28.objects.Data;

public class DataResponse {

	
	private String location;
	private List<Data> database;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<Data> getDatabase() {
		return database;
	}
	public void setForecasts(List<Data> database) {
		this.database = database;
	}
	@Override
	public String toString() {
		return "ForecastResponse [location=" + location + ", forecasts=" + database + "]";
	}
	
	
}
