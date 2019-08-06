package Entity;

import java.io.Serializable;

public class User implements Serializable{

	private Integer id;
	private String username;
	private String fullName;
	public Integer getId() {
		return id;
	}
	public User setId(Integer id) {
		this.id = id;
		return this;
	}
	public String getUsername() {
		return username;
	}
	public User setUsername(String username) {
		this.username = username;
		return this;
	}
	public String getFullName() {
		return fullName;
	}
	public User setFullName(String fullName) {
		this.fullName = fullName;
		return this;
	}
	
	
}
