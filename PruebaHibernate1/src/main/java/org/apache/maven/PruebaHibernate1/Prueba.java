package org.apache.maven.PruebaHibernate1;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Id;

@Entity
public class Prueba {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
