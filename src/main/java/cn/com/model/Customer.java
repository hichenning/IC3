package cn.com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class User {
	
	private int id;

	private String name;

	private String password;
	
	private Address address;
	@OneToOne
	@JoinColumn(name="address_id")
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@ManyToOne(cascade=CascadeType.ALL,optional=false)
	@JoinColumn(name="level_id")
	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}
	private Level level;

	@Id
	@GeneratedValue(generator = "user_id")
	@GenericGenerator(name = "user_id", strategy = "identity")
	// @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	public int getId() {
		return id;
	}
	
	@Column(name = "NAME", unique = false, nullable = false, insertable = true, updatable = true, precision = 20, scale = 0)
	public String getName() {
		return name;
	}
	@Column(name = "PASSWORD", unique = false, nullable = true, insertable = true, updatable = true, length = 10)
	public String getPassword() {
		return password;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "PASSWORD", unique = false, nullable = true, insertable = true, updatable = true, length = 10)
	public void setPassword(String password) {
		this.password = password;
	}

}
