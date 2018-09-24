package me.daniel.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Animal {
	
	@NotNull
	@Size(min = 2, max = 30)
	private String name;
	
	@NotNull
	private Long id;
	
	@NotNull
	@Size(min = 1, max = 10)
	private String sound;

	@Override
	public String toString() {
		return "Animal [name=" + name + ", id=" + id + ", sound=" + sound + "]";
	}
	
	/*
	 * Getters and setters
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
	
}
