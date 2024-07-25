package dio.springboot_postgre;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.springboot_postgre.model.User;
import dio.springboot_postgre.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {
	
	@Autowired
	private UserRepository repository;
	
	@Override
	public void run(String... args) throws Exception {	
//		insertUser();
		
		List<User> users = repository.findByEmailAndLastName("sebastiao@outlook.com.br", "Ferreira");
		
		for (User u: users) {
			System.out.println(u);
		}
		
		users = repository.filterByFirstNameOrLastName("Souza");
		
		for (User u: users) {
			System.out.println(u);
		}
		
		User user = repository.findByUserName("joana");
		System.out.println(user);
	}
	
	private void insertUser() {
		User user = new User();
		user.setFirstName("Rewer");
		user.setLastName("Pinheiro");
		user.setEmail("rewer@outlook.com.br");
		user.setUserName("rewerp");
		user.setPassword("dio123456");
		
		repository.save(user);
	}
}
