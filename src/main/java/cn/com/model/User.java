package cn.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {
	
	private String name;
	private String password;
	@Id
	@Column(name = "NAME", unique = true, nullable = false, 
	insertable = true, updatable = true, precision = 20, scale = 0) 
	public String getName() {
		return name;
	}
	
	 @Column(name = "PASSWORD", unique = false, nullable = true, 
			 insertable = true, updatable = true, length = 10)
	public String getPassword() {
		return password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
