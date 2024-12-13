package com.valcos98.onepiece_tracker_back.VolumeComponents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.mongodb.client.result.UpdateResult;

@Repository
public class CustomVolumeRepositoryImpl implements CustomVolumeRepository{

    @Autowired
    MongoTemplate mongoTemplate;

    public void updateVolumeDescription(String title, String description){
        Query query = new Query(Criteria.where("title").is(title));
        Update update = new Update();
        update.set("description", description);

        UpdateResult result = mongoTemplate.updateFirst(query, update, VolumenModel.class);

        if (result.equals(null)) 
            System.out.println("No documents were affected!");
        else 
            System.out.println(result.getModifiedCount()+" document(s) updated...");
        
    }

}
