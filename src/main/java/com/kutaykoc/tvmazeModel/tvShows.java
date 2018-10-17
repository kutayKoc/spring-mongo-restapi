package com.kutaykoc.tvmazeModel;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kutay on 16.10.2018.
 */
@Document(collection="tvmaze")
public class tvShows {
    @Id
    private String _id;
    private int id;
    @Indexed(direction = IndexDirection.ASCENDING)
    private String url;
    private String name;
    private String type;
    private String language;
    private List<String> genres;
    private String status;
    private int runtime;
    private String premiered;
    private String officalSite;
    private Schedule schedule;
    private Rating rating;
    private int weight;
    private Network network;
    private String webChannel;
    private Externals externals;
    private Image image;
    private String summary;
    private int updated;
    private Links _links;

    protected tvShows(){
        this.genres=new ArrayList<>();
    }
    public tvShows(int id,String url, String name, String type, String language, List<String> genres, String status, int runtime, String premiered, String officalSite, Schedule schedule, Rating rating, int weight, Network network, Externals externals, String webChannel, Image image, String summary, int updated, Links _links) {

    	this.id=id;
        this.url = url;
        this.name = name;
        this.type = type;
        this.language = language;
        this.genres = genres;
        this.status = status;
        this.runtime = runtime;
        this.premiered = premiered;
        this.officalSite = officalSite;
        this.schedule = schedule;
        this.rating = rating;
        this.weight = weight;
        this.network = network;
        this.webChannel = webChannel;
        this.externals = externals;
        this.image = image;
        this.summary = summary;
        this.updated = updated;
        this._links = _links;
    }


    public int getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getLanguage() {
        return language;
    }

    public List<String> getGenres() {
        return genres;
    }

    public String getStatus() {
        return status;
    }

    public int getRuntime() {
        return runtime;
    }

    public String getPremiered() {
        return premiered;
    }

    public String getOfficalSite() {
        return officalSite;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public Rating getRating() {
        return rating;
    }

    public int getWeight() {
        return weight;
    }

    public Network getNetwork() {
        return network;
    }

    public String getWebChannel() {
        return webChannel;
    }

    public Externals getExternals() {
        return externals;
    }

    public Image getImage() {
        return image;
    }

    public String getSummary() {
        return summary;
    }

    public int getUpdated() {
        return updated;
    }
	public Links get_links() {
		return _links;
	}
	public void set_links(Links _links) {
		this._links = _links;
	}
	public void setRating(Rating rating) {
		this.rating = rating;
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public void setGenres(List<String> genres) {
		this.genres = genres;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	public void setPremiered(String premiered) {
		this.premiered = premiered;
	}
	public void setOfficalSite(String officalSite) {
		this.officalSite = officalSite;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setNetwork(Network network) {
		this.network = network;
	}
	public void setWebChannel(String webChannel) {
		this.webChannel = webChannel;
	}
	public void setExternals(Externals externals) {
		this.externals = externals;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public void setUpdated(int updated) {
		this.updated = updated;
	}

  
}
