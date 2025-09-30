package poly.edu.controller;

import java.util.List;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import poly.edu.Product;

@Controller
public class ProductControllerB4 {
	@GetMapping("/productb4/form")
	public String form(Model model) {
	    Product p = new Product();
	    p.setName("iPhone 30");
	    p.setPrice(5000.0);
	    model.addAttribute("p1", p);
	    return "productb4";
	}

	@PostMapping("/productb4/save")
	public String save(@ModelAttribute("p2") Product p, Model model) {
	    model.addAttribute("p2", p);
	    return "productb4";
	}

	/* ?3 */
	@ModelAttribute("items")
	public List<Product> getItems() {
		return Arrays.asList(new Product("A", 1.0),new Product("B", 12.0));
	}
}
