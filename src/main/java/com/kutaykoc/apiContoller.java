package com.kutaykoc;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kutaykoc.tvmazeModel.tvShows;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class apiContoller {
	
    private tvmazeRepository theTvmaze;

    public apiContoller(tvmazeRepository theTvmaze) {
        this.theTvmaze = theTvmaze;
    }

    @RequestMapping("/all")
    public List<tvShows> getAll(){
        List<tvShows>  data=this.theTvmaze.findAll();
        return data;
    }
    
    //insert data 
    @PutMapping
    public void insert(@RequestBody tvShows theShows) {
    	this.theTvmaze.insert(theShows);
    }
    
    //update data @ReguestMapping(value="/api/update" RequestMethod.POST )
	@SuppressWarnings("unchecked")
	@PostMapping
    public void update(@RequestBody tvShows theShows) {
    	this.theTvmaze.save(theShows);
    }
    
    //delete data with id param
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id) {
    	this.theTvmaze.deleteById(id);
    }
    
    //get data with id param
    @RequestMapping("/{id}")
    public Optional<tvShows> getById(@PathVariable("id") String id) {
    	Optional<tvShows> data= this.theTvmaze.findById(id);
    	return data;
    }
}
