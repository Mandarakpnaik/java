package com.xworkz.movies.internal;

public abstract class Movies {
    public int noOfMovies;
    public String movieName;
    public double budget;

    public Movies(int noOfMovies,String movieName,double budget)
    {
        this.budget=budget;
        this.noOfMovies=noOfMovies;
        this.movieName=movieName;
    }
    public void dispalyMoviesDetails()
    {
        System.out.println("Number of movies");
        System.out.println("Movies name");
        System.out.println("Movies budget");
    }
    public abstract void moviesDetails(String movieName,double budget,int noOfMovies);



}
