package com.kutaykoc.tvmazeModel;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kutaykoc.tvmazeRepository;

@Component
public class dbSeeder implements CommandLineRunner {
    private  tvmazeRepository theTvmaze;

    public dbSeeder(tvmazeRepository theTvmaze) {
        this.theTvmaze = theTvmaze;
    }

    @Override
    public void run(String... args) throws Exception {
       
    }
}
