package com.xworkz.movies.external;

import com.xworkz.movies.internal.KannadaMovies;
import com.xworkz.movies.internal.Movies;

public class MoviesRunner {
    public static void main(String[] args) {
        Movies movie =new KannadaMovies(2000,"Kantara",450000000);
        movie.dispalyMoviesDetails();
    }
}
