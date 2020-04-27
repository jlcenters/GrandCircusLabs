package co.grandcircus.lab28;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ApiController {

	@Autowired
	private ApiService api;
	
	
	
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/weather-report")
	public ModelAndView report(@RequestParam("latitude") String latitude,@RequestParam("longitude") String longitude) {
		DataResponse data = api.newReport(latitude, longitude);
		System.out.println(data.toString());
		System.out.println(data.getLocation());
		return new ModelAndView("report","data",data);
				
	}
}
