package ru.netology.javaqa.poster.services;

public class MovieManager {
    private String[] movies;
    private int limit;

    public MovieManager() {
        this.movies = new String[0];
        this.limit = 5;
    }

    public MovieManager(int limit) {
        this.movies = new String[0];
        this.limit = limit;
    }

    public void addMovie(String movie) {
        String[] newMovies = new String[movies.length + 1];
        System.arraycopy(movies, 0, newMovies, 0, movies.length);
        newMovies[movies.length] = movie;
        movies = newMovies;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int numToDisplay = Math.min(limit, movies.length);
        String[] lastMovies = new String[numToDisplay];

        for (int i = 0; i < numToDisplay; i++) {
            lastMovies[i] = movies[movies.length - i - 1];
        }

        return lastMovies;
    }
}




