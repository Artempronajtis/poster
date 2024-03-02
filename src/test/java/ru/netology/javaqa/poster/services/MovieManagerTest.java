package ru.netology.javaqa.poster.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieManagerTest {

    @Test
    public void testMovieManager() {

        MovieManager manager = new MovieManager();
        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");
        manager.addMovie("Movie 4");
        manager.addMovie("Movie 5");
        manager.addMovie("Movie 6");
        manager.addMovie("Movie 7");

        assertArrayEquals(new String[]{"Movie 1", "Movie 2", "Movie 3", "Movie 4", "Movie 5", "Movie 6", "Movie 7"}, manager.findAll());
        assertArrayEquals(new String[]{"Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3"}, manager.findLast());


        MovieManager limitedManager = new MovieManager(3);
        limitedManager.addMovie("Movie A");
        limitedManager.addMovie("Movie B");
        limitedManager.addMovie("Movie C");
        limitedManager.addMovie("Movie D");

        assertArrayEquals(new String[]{"Movie A", "Movie B", "Movie C", "Movie D"}, limitedManager.findAll());
        assertArrayEquals(new String[]{"Movie D", "Movie C", "Movie B"}, limitedManager.findLast());
    }
}
