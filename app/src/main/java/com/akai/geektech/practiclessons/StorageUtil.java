package com.akai.geektech.practiclessons;

import java.util.ArrayList;
import java.util.List;

public class StorageUtil {
    private static StorageUtil instance;
    private List<Movie> movieList;

    private StorageUtil() {}

    public List<Movie> getMovies() {
        if (movieList == null) {
            movieList = prepareData();
        }
        return movieList;
    }

    public static StorageUtil getInstance() {
        if (instance == null) {
            instance = new StorageUtil();
        }
        return instance;
    }

    private List<Movie> prepareData() {
        List<Movie> list = new ArrayList<>();
        list.add(new Movie(1, "A", "1990"));
        list.add(new Movie(2, "B", "1980"));
        list.add(new Movie(3, "C", "1991"));
        list.add(new Movie(4, "D", "2010"));
        return list;
    }

    public Movie getMovieById(long id) {
        for (int i = 0; i < movieList.size(); i++) {
            Movie movie = movieList.get(i);
            if (movie.getId() == id) {
                return movie;
            }
        }
        return null;
    }

}
