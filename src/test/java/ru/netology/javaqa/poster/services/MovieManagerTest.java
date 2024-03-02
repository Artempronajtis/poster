package ru.netology.javaqa.poster.services;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieManagerTest {
    @Test
    public void testFindLastWhenLessThanLimit() {
        MovieManager manager = new MovieManager(5);
        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");

        assertArrayEquals(new String[]{"Movie 2", "Movie 1"}, manager.findLast());
    }

    @Test
    public void testFindLastWhenMoreThanLimit() {
        MovieManager manager = new MovieManager(2);
        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");
        manager.addMovie("Movie 4");

        assertArrayEquals(new String[]{"Movie 4", "Movie 3"}, manager.findLast());
    }

    @Test
    public void testFindLastWhenEqualToLimit() {
        MovieManager manager = new MovieManager(3);
        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");

        assertArrayEquals(new String[]{"Movie 3", "Movie 2", "Movie 1"}, manager.findLast());
    }

    @Test
    public void testAddMovie() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");

        assertArrayEquals(new String[]{"Movie 1", "Movie 2"}, manager.findAll());
    }

    @Test
    public void testFindAll() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");

        assertArrayEquals(new String[]{"Movie 1", "Movie 2"}, manager.findAll());
    }


}
