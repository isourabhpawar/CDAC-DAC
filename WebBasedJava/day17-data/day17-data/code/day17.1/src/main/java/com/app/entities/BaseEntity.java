package com.app.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass // mandatory anno to tell hibernate , following is common super class ,
					// containing common fields , with no table associated with it !
@Getter
@Setter
public class BaseEntity {
	@Id // PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto generation of ids : auto_increment
//	@JsonProperty(access = Access.READ_ONLY)
	private Long id;	
}
