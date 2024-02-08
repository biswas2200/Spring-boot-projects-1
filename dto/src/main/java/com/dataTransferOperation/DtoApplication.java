package com.dataTransferOperation;

import com.dataTransferOperation.model.Location;
import com.dataTransferOperation.model.User;
import com.dataTransferOperation.repository.LocationRepository;
import com.dataTransferOperation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DtoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DtoApplication.class, args);
	}
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private LocationRepository locationRepository;

	@Override
	public void run(String ... args) throws Exception{
		Location location1 = new Location();
		location1.setPlace("Pune");
		location1.setDescription("A Great Place to live.");
		location1.setId(2330l);
		location1.setLongitude(223.871);
		location1.setLatitude(876.223);
		locationRepository.save(location1);

		User user1 = new User();
		user1.setFirstName("Girish");
		user1.setLastName("Lokhande");
		user1.setEmail("girish@gmail.com");
		user1.setPassword("pass");
		user1.setLocation(location1);
		userRepository.save(user1);

		Location location2 = new Location();
		location2.setPlace("Delhi");
		location2.setDescription("A Great Place for pollution.");
		location2.setId(1382l);
		location2.setLongitude(110.121);
		location2.setLatitude(420.721);
		locationRepository.save(location2);

		User user2 = new User();
		user2.setFirstName("Manik");
		user2.setLastName("Dutta");
		user2.setEmail("manik@gmail.com");
		user2.setPassword("pass0");
		user2.setLocation(location2);
		userRepository.save(user2);

	}

}
