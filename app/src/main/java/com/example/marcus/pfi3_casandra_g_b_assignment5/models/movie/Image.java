package com.example.marcus.pfi3_casandra_g_b_assignment5.models.movie;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

/**
 * Created by isak on 2015-04-24.
 */

@Parcel
public class Image {

    @SerializedName("poster")
    public Poster poster;

    @SerializedName("fanart")
    public FanArt fanArt;

    public Poster getPoster() {
        return poster;
    }

    public FanArt getFanArt() {
        return fanArt;
    }
}