package com.kutaykoc.tvmazeModel;

/**
 * Created by kutay on 16.10.2018.
 */
public class Externals {
    private String tvrage;
    private String thetvdb;
    private  String imdb;

    public Externals() {
    	
    }
    public Externals(String tvrage, String thetvdb, String imdb) {
        this.tvrage = tvrage;
        this.thetvdb = thetvdb;
        this.imdb = imdb;
    }

    public String getTvrage() {
        return tvrage;
    }

    public String getThetvdb() {
        return thetvdb;
    }

    public String getImdb() {
        return imdb;
    }
}
