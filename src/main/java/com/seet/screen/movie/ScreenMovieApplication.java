package com.seet.screen.movie;

import com.seet.screen.movie.model.DadosSerie;
import com.seet.screen.movie.service.ConsumoAPI;
import com.seet.screen.movie.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenMovieApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenMovieApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	var consumoApi = new ConsumoAPI();
	var json = consumoApi.obterDados("https://www.omdbapi.com/?i=tt3896198&apikey=db3925b");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dadosSerie = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dadosSerie);
	}
}
