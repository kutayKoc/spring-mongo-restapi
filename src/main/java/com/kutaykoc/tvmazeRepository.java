package com.kutaykoc;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kutaykoc.tvmazeModel.tvShows;

@Repository
public interface tvmazeRepository extends MongoRepository<tvShows,String>{

}
