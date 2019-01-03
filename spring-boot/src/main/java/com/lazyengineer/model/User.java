package com.lazyengineer.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@Table(name = "user")
@ToString @Getter @Setter
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter
	@Setter(AccessLevel.PUBLIC)
	private int id;

	@Getter
	@Setter(AccessLevel.PUBLIC)
	@Column(name = "email")
	private String email;

	@Getter
	@Setter(AccessLevel.PUBLIC)
	@Column(name = "firstname")
	private String firstname;

	@Getter
	@Setter(AccessLevel.PUBLIC)
	@Column(name = "lastname")
	private String lastname;

	@Getter
	@Setter(AccessLevel.PUBLIC)
	@Column(name = "password")
	private String password;

	@Getter
	@Setter(AccessLevel.PUBLIC)
	@Column(name = "active")
	private int active;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	@Getter
	@Setter(AccessLevel.PUBLIC)
	private Set<Role> roles;

	public User() {
		super();
	}
	
	

}
