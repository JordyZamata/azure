package com.formacion.reactiva.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Person {
	
	
	private Integer id;
	private String nombre;
	private String apellido;
}
