package jokesapp.chucknorrisjokesapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class ChuckNorisJokesImpl {

	private ChuckNorrisQuotes chuckNorisQuotes;
	
	public ChuckNorisJokesImpl(ChuckNorrisQuotes chuckNorisQuotes) {
		super();
		this.chuckNorisQuotes = chuckNorisQuotes;
	}

	public String getJoke() {
		
		return chuckNorisQuotes.getRandomQuote();
	}
}
