package com.valcos98.onepiece_tracker_back;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.valcos98.onepiece_tracker_back.VolumeComponents.CustomVolumeRepositoryImpl;
import com.valcos98.onepiece_tracker_back.VolumeComponents.VolumeRepository;
import com.valcos98.onepiece_tracker_back.VolumeComponents.VolumenModel;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableMongoRepositories
public class OnepieceTrackerBackApplication implements CommandLineRunner{
	@Autowired
	VolumeRepository volumeRepository;

	@Autowired
	CustomVolumeRepositoryImpl customRepo;

	List<VolumenModel> volumeList = new ArrayList<VolumenModel>();

	public static void main(String[] args) {
		SpringApplication.run(OnepieceTrackerBackApplication.class, args);
	}

	@Override
	public void run(String... args){
		//volumeRepository.deleteAll();

		//createVolumes();
	}

	void createVolumes(){
		System.out.println("Data creation started!");
		String[] chaptersVolumeOne = new String[]{
			"Romance Dawn: Amanecer de una aventura",
			"El hombre del sombrero de paja, Luffy",
			"Zoro, el cazador de recompensas",
			"El Capitán Morgan, \"El del brazo de hacha\"",
			"El rey de los piratas",
			"El primero",
			"Amigos",
			"Aparece Nami"
		};

		volumeRepository.save(new VolumenModel("Volumen 1 \"Romance Dawn: Amanecer de una aventura\"",chaptersVolumeOne,"Años después de la muerte de Gold Roger, quien era conocido como el \"Rey de los Piratas\", Monkey D. Luffy, de siete años, intenta unirse a la tripulación pirata de Shanks \"El Pelirrojo\", pero es rechazado por ser demasiado joven."));
	}

}
