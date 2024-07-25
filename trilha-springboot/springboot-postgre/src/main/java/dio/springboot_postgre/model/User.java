package dio.springboot_postgre.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int id;
	
	@Column(length = 30, nullable = false)
	private String firstName;
	
	@Column(length = 40, nullable = false)
	private String lastName;
	
	@Column(length = 20, nullable = false)
	private String userName;
	
	@Column(length = 10, nullable = false)
	private String password;
	
	@Column(length = 100, nullable = false)
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "User {id = " + id + ", firstName = " + firstName + ", lastName = " + lastName + ", userName = " + userName
				+ ", password = " + password + ", email = " + email + "}";
	}

}
