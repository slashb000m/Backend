package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@Controller
public class AuthentificationController {

	@RequestMapping(value = { "/login" }, method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login"); // resources/template/login.html
		return modelAndView;
	}
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView register() {
		ModelAndView modelAndView = new ModelAndView();
		User user = new User();
		modelAndView.addObject("user", user);
		modelAndView.setViewName("register"); // resources/template/register.html
		return modelAndView;
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home"); // resources/template/home.html
		return modelAndView;
	}
	

	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public ModelAndView registerUser(@Valid User user, BindingResult bindingResult, ModelMap modelMap) {
		ModelAndView modelAndView = new ModelAndView();
		// Check for the validations
		if (bindingResult.hasErrors()) {
			modelAndView.addObject("successMessage", "verifier la saisie du formulaire");
			modelMap.addAttribute("bindingResult", bindingResult);
		}
		// we will save the user if no binding errors
		else if (userService.isUserAlreadyPresent(user))
		{
			modelAndView.addObject("successMessage", "Utilisateur déja inscrit !");
			
		}
		else 
		{ 
			userService.SaveUser(user);
			modelAndView.addObject("successMessage", "Inscription éfféctué avec succés !");
		}
			modelAndView.addObject("user", new User());
			modelAndView.setViewName("register");
			return modelAndView;
			
		
	}
	
	
	
	
}
