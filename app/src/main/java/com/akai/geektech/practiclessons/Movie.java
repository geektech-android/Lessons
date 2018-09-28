package com.akai.geektech.practiclessons;

public class Movie {
    private long id;
    private String title;
    private String year;

    public Movie(long id, String title, String year) {
        this.id = id;
        this.title = title;
        this.year = year;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
