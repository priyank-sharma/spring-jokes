package jokesapp.chucknorrisjokesapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Configuration
public class ChuckConfig {

	@Bean
	public ChuckNorrisQuotes ChuckNorrisQuotes() {
		return new ChuckNorrisQuotes();
	}
}
