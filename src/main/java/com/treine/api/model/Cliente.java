/**
 * 
 */
package com.treine.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

/**
 * @author diego
 *
 */
@Data
@Entity
public class Cliente {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	
	@Column(nullable = false)
	private String nome;

	
}
