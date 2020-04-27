package co.grandcircus.lab28.objects;

import java.util.Arrays;

public class Data {

	private String temperature;
	private String[] weather;
	private String[] text;

	public String[] getText() {
		return text;
	}
	public void setText(String[] text) {
		this.text = text;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String[] getWeather() {
		return weather;
	}
	public void setWeather(String[] weather) {
		this.weather = weather;
	}
	@Override
	public String toString() {
		return "Data [temperature=" + temperature + ", weather=" + Arrays.toString(weather) + "]";
	}
	
	
}
