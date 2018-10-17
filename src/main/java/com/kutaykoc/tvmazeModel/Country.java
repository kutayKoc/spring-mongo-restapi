package com.kutaykoc.tvmazeModel;

/**
 * Created by kutay on 16.10.2018.
 */
public class Country {
    private String name;
    private String code;
    private String timezone;

    private Country() {
    	
    }
    public Country(String name, String code, String timezone) {
        this.name = name;
        this.code = code;
        this.timezone = timezone;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getTimezone() {
        return timezone;
    }
}
