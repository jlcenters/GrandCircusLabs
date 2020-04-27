package co.grandcircus.lab28;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ApiService {

	private RestTemplate rt;

	public DataResponse newReport(String latitude, String longitude) {
		String url = "https://forecast.weather.gov/MapClick.php?lat=" + latitude + "&lon=" + longitude + "&FcstType=json";
		
		DataResponse response = rt.getForObject(url, DataResponse.class);
		return response;
	}
	public Location

}
