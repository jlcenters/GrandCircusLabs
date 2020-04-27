package co.grandcircus.lab24.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;
import co.grandcircus.lab24.Product;
import co.grandcircus.lab24.daos.*;

@Controller
public class ProductController {

	@Autowired
	ProductDao pdao;
	@Autowired
	AdminDao adao;
	
	
	
//GENERAL USER
	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("index");	
	}
	@RequestMapping("/menu")
	public ModelAndView buy() {
		List<Product> products = pdao.getProducts();
		return new ModelAndView("menu","products",products);
	}
	
	
//ADMIN	
	@RequestMapping("/admin-home")
	public ModelAndView adminHome() {
	return new ModelAndView("admin-home");
	}
	@RequestMapping("/admin-menu")
	public ModelAndView adminPage() {
		List<Product> products = pdao.getProducts();
		return new ModelAndView("admin-menu","products",products);
	}
	
	
	
	@RequestMapping("/admin-add")
	public ModelAndView showAdd() {
			return new ModelAndView("add-form","title","Add Product");
		}
	@PostMapping("/admin-add")
	public ModelAndView submitAdd(@RequestParam("name") String name, @RequestParam("description") String description, @RequestParam("price") Double price) {
		Product product = new Product(name,description,price);
		adao.addProduct(product);
		return new ModelAndView("redirect:/admin-menu");
	}

	
	
	@RequestMapping("/admin-update")
	public ModelAndView showEdit(@RequestParam("id") Long id) {
		ModelAndView mv = new ModelAndView("update-form");
		mv.addObject("update", adao.findById(id));
		mv.addObject("title", "Update Menu Item");
		return mv;
	}
	@PostMapping("/admin-update")
	public ModelAndView submitEdit(@RequestParam("name") String name, @RequestParam("description") String description, @RequestParam("price") Double price) {
		Product product = new Product(name,description,price);
		adao.updateProduct(product);
		return new ModelAndView("redirect:/admin-menu");
	}
	
	
	
	@RequestMapping("/admin-remove")
	public ModelAndView remove(@RequestParam("id") Long id) {
		adao.removeProduct(id);
		return new ModelAndView("redirect:/admin-menu");
		
	}
	
}