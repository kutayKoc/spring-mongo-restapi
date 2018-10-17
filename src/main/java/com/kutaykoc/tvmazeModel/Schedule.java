package com.kutaykoc.tvmazeModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kutay on 16.10.2018.
 */
public class Schedule {
    private String time;
    private List<String> days;
    

    protected Schedule() {
    	this.days=new ArrayList<>();
    }
    
    public Schedule(String time, List<String> days) {
        this.time = time;
        this.days = days;
    }

    public String getTime() {
        return time;
    }

    public List<String> getDays() {
        return days;
    }
}
