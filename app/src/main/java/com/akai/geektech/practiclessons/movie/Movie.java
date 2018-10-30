package com.akai.geektech.practiclessons.movie;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {
    private String title;
    private int year;
    private int duration;
    private String genre;
    private String country;
    private int like;

    public Movie(String title, int year, int duration, String genre, String country, int like) {
        this.title = title;
        this.year = year;
        this.duration = duration;
        this.genre = genre;
        this.country = country;
        this.like = like;
    }

    protected Movie(Parcel in) {
        title = in.readString();
        year = in.readInt();
        duration = in.readInt();
        genre = in.readString();
        country = in.readString();
        like = in.readInt();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeInt(year);
        parcel.writeInt(duration);
        parcel.writeString(genre);
        parcel.writeString(country);
        parcel.writeInt(like);
    }
}
