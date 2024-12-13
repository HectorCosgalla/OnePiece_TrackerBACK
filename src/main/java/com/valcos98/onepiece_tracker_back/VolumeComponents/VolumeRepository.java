package com.valcos98.onepiece_tracker_back.VolumeComponents;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface VolumeRepository extends MongoRepository<VolumenModel,String> {
    @Query("{volume:'?0'}")
    VolumenModel findByVolume(String volume);

    public long count();
}
