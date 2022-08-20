package com.app.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Product extends BaseEntity{
private String p_name;
private String p_desc;
private int p_Qnty;
private int p_price;
@ManyToOne
@JoinColumn(nullable = false)
private User user;
}
