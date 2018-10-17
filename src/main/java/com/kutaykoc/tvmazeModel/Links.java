package com.kutaykoc.tvmazeModel;

/**
 * Created by kutay on 16.10.2018.
 */
public class Links {
	private Self self;
	private Previousepisode previousepisode;
	
	public Links() {
		
	}
	public Links(Self self,Previousepisode previousepisode) {
		this.self=self;
		this.previousepisode=previousepisode;
	}

	public Self getSelf() {
		return self;
	}

	public Previousepisode getPreviousepisode() {
		return previousepisode;
	}
}
