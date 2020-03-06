package jokesapp.chucknorrisjokesapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import jokesapp.chucknorrisjokesapp.service.ChuckNorisJokesImpl;

@Controller
public class JokesController {
	
	ChuckNorisJokesImpl chuckNorisJokesImpl;
	@Autowired
	public JokesController(ChuckNorisJokesImpl chuckNorisJokesImpl) {
		super();
		this.chuckNorisJokesImpl = chuckNorisJokesImpl;
	}
	
	@RequestMapping("/")
	public String getJokes(Model model) {
		
		model.addAttribute("jokes", chuckNorisJokesImpl.getJoke());
		
		return "chucknorris";
	}

}
