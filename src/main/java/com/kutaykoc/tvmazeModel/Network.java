package com.kutaykoc.tvmazeModel;


public class Network {
	
    private int id;
	private String name;
    private Country country;
    public Network() {
    	
    }
    
    public Network(int id, String name, Country country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }
}
