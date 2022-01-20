package com.prejeto.PersonAPI.repository;

import com.prejeto.PersonAPI.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
