package com.valcos98.onepiece_tracker_back.VolumeComponents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Document("VolumeItem")
public class VolumenModel {
    @Id
    private String id;

    private String title;
    private String[] chapters;
    private String description;

    public VolumenModel(String title, String[] chapters, String description){
        this.title = title;
        this.chapters = chapters;
        this.description = description;
    }
}
