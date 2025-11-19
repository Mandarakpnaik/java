package com.xworkz.movies.internal;

public abstract class Movies {
    public int noOfMovies;
    public String movieName;
    public double budget;
    public KannadaMovies movies;

    public Movies(int noOfMovies,String movieName,double budget,KannadaMovies movies)
    {
        this.budget=budget;
        this.noOfMovies=noOfMovies;
        this.movieName=movieName;
        this.movies=movies;
    }
    public void dispalyMoviesDetails()
    {
        System.out.println("Number of movies :"+noOfMovies);
        System.out.println("Movies name :"+movieName);
        System.out.println("Movies budget :"+budget);
    }
    public abstract void moviesDetails(String movieName,double budget,int noOfMovies);



}
