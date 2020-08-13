package com.alfred.security.controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.alfred.DTO.FooDto;
import com.alfred.security.models.Foo;
import com.alfred.security.services.FooService;

@RestController
@RequestMapping(value = "/api/foos")
public class FooController {
	
	private FooService fooService;
	
	public FooController(FooService fooService) {
		this.fooService=fooService;
	}
	
	@CrossOrigin(origins = "http://localhost:8089")
	@GetMapping(value = "/{id}")
	public FooDto findOne(@PathVariable Long id) {
		Foo entity = fooService.findById(id)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
		return convertToDto(entity);
	}
	
	@GetMapping
    public Collection<FooDto> findAll() {
        Iterable<Foo> foos = this.fooService.findAll();
        List<FooDto> fooDtos = new ArrayList<>();
        foos.forEach(p -> fooDtos.add(convertToDto(p)));
        return fooDtos;
    }
 
    protected FooDto convertToDto(Foo entity) {
        FooDto dto = new FooDto(entity.getId(), entity.getName());
 
        return dto;
    }
    
}
