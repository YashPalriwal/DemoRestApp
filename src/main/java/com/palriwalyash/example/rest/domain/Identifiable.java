package com.palriwalyash.example.rest.domain;

public interface Identifiable extends org.springframework.hateoas.Identifiable<Long> {
	public void setId(Long id);
}
