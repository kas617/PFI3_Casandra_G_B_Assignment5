package com.example.marcus.pfi3_casandra_g_b_assignment5.models.movie;

import org.parceler.ParcelConstructor;

/**
 * Created by isak on 2015-04-24.
 */

public class Movie {
    private String title;
    private String slugline;
    private String poster;
    private String fanArt;
    private String rating;
    private String tagline;
    private String imdbId;
    private String runtime;
    private int likes;
    private int year;


    @ParcelConstructor
    private Movie(Builder builder) {
        this.likes = builder.likes;
        this.title = builder.title;
        this.slugline = builder.slugline;
        this.poster = builder.poster;
        this.fanArt = builder.fanArt;
        this.year = builder.year;
        this.imdbId = builder.imdbId;
        this.rating = builder.rating;
        this.tagline = builder.tagline;
        this.runtime = builder.runtime;
    }

    public String getTitle() {
        return title;
    }

    public String getImdbId() {
        return imdbId;
    }

    public String getRuntime() {
        return runtime;
    }

    public int getLikes() {
        return likes;
    }

    public String getSlugline() {
        return slugline;
    }

    public String getPoster() {
        return poster;
    }

    public String getFanArt() {
        return fanArt;
    }

    public int getYear() {
        return year;
    }

    public String getRating() {
        return rating;
    }

    public String getTagline() {
        return tagline;
    }


    public static class Builder {
        private String title, slugline, poster, fanArt, tagline, imdbId, runtime, rating;
        private int year, likes;

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder slugLine(String slugLine) {
            this.slugline = slugLine;
            return this;
        }

        public Builder poster(String poster) {
            this.poster = poster;
            return this;
        }

        public Builder fanArt(String fanArt) {
            this.fanArt = fanArt;
            return this;
        }

        public Builder year(int year) {
            this.year = year;
            return this;
        }

        public Builder rating(String rating) {
            this.rating = rating;
            return this;
        }

        public Builder tagline(String tagline) {
            this.tagline = tagline;
            return this;
        }

        public Builder imdbId(String imdbId) {
            this.imdbId = imdbId;
            return this;
        }

        public Builder runtime(String runtime) {
            this.runtime = runtime;
            return this;
        }

        public Builder likes(int likes) {
            this.likes = likes;
            return this;
        }

        public Movie build() {
            return new Movie(this);
        }
    }
}
