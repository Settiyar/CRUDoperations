package com.springjpademo.jpapractice;

import java.util.List;

import java.util.Optional;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springjpademo.jpapractice.Repo.UserRepository;
import com.springjpademo.jpapractice.User.User;

@SpringBootApplication
public class JpapracticeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(JpapracticeApplication.class, args);

		UserRepository repo = context.getBean(UserRepository.class);

		User user1 = new User();
		user1.setName("Ammu");
		user1.setStatus("Done");

		User user2 = new User();
		user2.setName("Kanna");
		user2.setStatus("Yes");

		// saving single users
		// User result = repo.save(user2);

		// saving multiple users in one go!

		/*
		 * List<User> userList = List.of(user1, user2);
		 * 
		 * Iterable<User> result = repo.saveAll(userList);
		 * 
		 * result.forEach(user -> {
		 * System.out.println(user);
		 * });
		 * 
		 * System.out.println("done");
		 */

		// update users by id

		/*
		 * Optional<User> optional = repo.findById(103);
		 * 
		 * User user3 = optional.get();
		 * user3.setName("Sreejithhh");
		 * 
		 * User resulet1 = repo.save(user3);
		 * System.out.println(resulet1);
		 * 
		 * // how to get data
		 * Iterable<User> itr = repo.findAll();
		 * itr.forEach(user -> {
		 * System.out.println(user);
		 * });
		 */

		// Delete user element
		/*
		 * repo.deleteById(52);
		 * System.out.println("deleted!!!!!!");
		 */

		// delete all users

		Iterable<User> allusers = repo.findAll();
		allusers.forEach(user -> {
			System.out.println(user);
		});

		repo.deleteAll(allusers);

	}

}
