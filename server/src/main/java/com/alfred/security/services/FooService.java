package com.alfred.security.services;

import java.util.Optional;

import com.alfred.security.models.Foo;

public interface FooService {
	Optional<Foo> findById(Long id);

	Foo save(Foo foo);

	Iterable<Foo> findAll();

}