package com.moviejdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.moviejdbc.model.Movie;
import com.moviejdbc.service.IMovieService;

@SpringBootApplication
public class SpringMovieJdbcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringMovieJdbcApplication.class, args);
	}
	
	@Autowired
	IMovieService iMovieService;

	@Override
	public void run(String... args) throws Exception {

//		Movie movie=new Movie("Jackey", "Action", "Kannada", 1);
//		Movie movie1=new Movie("Hulk", "Action", "English", 2);
//		Movie movie2=new Movie("Bahubali", "Drama", "telagu", 3);
//		Movie movie3=new Movie("Hungama", "Comedy", "Hindi", 4);
//		Movie movie4=new Movie("Love Mocktail", "Love", "Kannada", 5);
//		Movie movie5=new Movie("Alien", "Horror", "English", 6);
		
		
//		iMovieService.addMovie(movie1);
//		iMovieService.addMovie(movie2);
//		iMovieService.addMovie(movie3);
//		iMovieService.addMovie(movie4);
//		iMovieService.addMovie(movie5);
		
		System.out.println("Get All");
		iMovieService.getAll().forEach(System.out::println);
		System.out.println();
		
		System.out.println("Get By Name");
		iMovieService.getByName("Hungama").forEach(System.out::println);
		System.out.println();
		
		System.out.println("Get By Genre");
		iMovieService.getByGenre("Action").forEach(System.out::println);
		System.out.println();
		
		System.out.println("Get By Language");
		iMovieService.getByLanguage("Kannada").forEach(System.out::println);
		System.out.println();
		
		System.out.println("Get By Id");
		System.out.println(iMovieService.getById(5));
		System.out.println();
	}

}
