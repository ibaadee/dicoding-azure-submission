package id.web.dragonbee.model;

import java.util.Date;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity(name = "User")
@Table(name = "users", schema = "dbo")
public class User {
	@Id
	@GeneratedValue
	@Column(name = "id")
	int id;
	
	@Column(name = "name")
	String name;
	
	@Column(name = "position")
	String position;
	
	@Column(name = "email")
	String email;
	
	@Column(name = "phone")
	String phone;
	
	@Column(name = "date_joined")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date dateJoined;
	
	public User() {
		
	}
	
	public User(String name, String position) {
		this.name = name;
		this.position = position;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getDateJoined() {
		return dateJoined;
	}

	public void setDateJoined(Date dateJoined) {
		this.dateJoined = dateJoined;
	}

}
