package com.kutaykoc.tvmazeModel;

import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;

/**
 * Created by kutay on 16.10.2018.
 */
public class Rating {
    private String average;

    public Rating () {
	}
    
    public Rating(String average) {
        this.average = average;
    }

    public String getAverage() {
        return average;
    }

	public void setAverage(String average) {
		this.average = average;
	}
}
