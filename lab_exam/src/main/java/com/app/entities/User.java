package com.app.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class User extends BaseEntity{
	private String userName;
	private String password;
	@Enumerated(EnumType.STRING)
	private Role role;
}
