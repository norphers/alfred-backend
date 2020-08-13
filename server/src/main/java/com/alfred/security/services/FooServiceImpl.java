package com.alfred.security.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.alfred.security.models.Foo;
import com.alfred.security.repositories.FooRepository;

@Service
public class FooServiceImpl implements FooService {

	private FooRepository fooRepository;

	public FooServiceImpl(FooRepository fooRepository) {
		this.fooRepository = fooRepository;
	}

	@Override
	public Optional<Foo> findById(Long id) {
		return fooRepository.findById(id);
	}

	@Override
	public Foo save(Foo foo) {
		return fooRepository.save(foo);
	}

	@Override
	public Iterable<Foo> findAll() {
		return fooRepository.findAll();
	}
}