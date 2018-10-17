package com.kutaykoc.tvmazeModel;

/**
 * Created by kutay on 16.10.2018.
 */
public class Image {
    private String medium;
    private String original;

    public Image() {
    	
    }
    public Image(String medium, String original) {
        this.medium = medium;
        this.original = original;
    }

    public String getMedium() {
        return medium;
    }

    public String getOriginal() {
        return original;
    }
}
