package co.grandcircus.lab24.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.lab24.Users;
import co.grandcircus.lab24.daos.UserDao;

@Controller
public class UserController {

	@Autowired
	UserDao uDao;
	
//ADMIN LOGIN
	@RequestMapping("/login")
	public ModelAndView adminLogin() {
		return new ModelAndView("login");
	}
	@RequestMapping("/submit")
	public ModelAndView submit(@RequestParam("name") String name, @RequestParam("password") String password) {
		if(password.equals("admin")) {
			ModelAndView mv = new ModelAndView("admin-home");
			mv.addObject("name", name);
			mv.addObject("password", password);
			return mv;
		}
		else {
			ModelAndView mav = new ModelAndView("fail");
			mav.addObject("name", name);
			mav.addObject("password", password);
			return mav;
		}
	}

//CHECKOUT
	@RequestMapping("/register")
	public ModelAndView register() {
		return new ModelAndView("register");
	}

	@PostMapping("/register")
	public ModelAndView register(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName,
			@RequestParam("email") String email, @RequestParam("phoneNumber") String phoneNumber,
			@RequestParam("password") String password) {
		Users user = new Users(firstName,lastName,email,phoneNumber,password);
		ModelAndView mv = new ModelAndView("index");
		
		mv.addObject("user",user);
		uDao.addUser(user);
		
		return mv;
	}
}