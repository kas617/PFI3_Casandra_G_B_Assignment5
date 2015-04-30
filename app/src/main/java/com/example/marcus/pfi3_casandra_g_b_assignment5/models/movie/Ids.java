package com.example.marcus.pfi3_casandra_g_b_assignment5.models.movie;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

/**
 * Created by isak on 2015-04-24.
 */
@Parcel
public class Ids {

    @SerializedName("slug")
    public String slug;

    @SerializedName("imdb")
    public String imdb;

    public String getImdb() {
        return imdb;
    }

    public String getSlug() {
        return slug;
    }
}