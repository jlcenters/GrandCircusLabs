package co.grandcircus.lab28.objects;

public class Forecast {

	private String location;
	private String time;
	private String data;
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Forecast [location=" + location + ", time=" + time + ", data=" + data + "]";
	}
}
