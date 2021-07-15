package com.eden.garden;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tools.api.Cocktail;
import com.tools.models.Drink;

@Controller
public class eden {
 @GetMapping("/")
 public String welcome(Model model) {
	 Cocktail ct=new Cocktail();
	 try {
		model.addAttribute("drink", ct.request().getDrinks().get(0));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 return "welcome";
 }
}
