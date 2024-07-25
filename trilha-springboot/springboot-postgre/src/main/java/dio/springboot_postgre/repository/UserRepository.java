package dio.springboot_postgre.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import dio.springboot_postgre.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	List<User> findByEmailAndLastName(String email, String lastName);
	
	@Query("SELECT u FROM User u WHERE u.firstName LIKE %:name% OR u.lastName LIKE %:name%")
    List<User> filterByFirstNameOrLastName(@Param("name") String name);
	
	User findByUserName(String userName);
	
}
