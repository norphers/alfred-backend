package com.alfred.security.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.alfred.security.models.Foo;

public interface FooRepository extends PagingAndSortingRepository<Foo, Long> {

}
