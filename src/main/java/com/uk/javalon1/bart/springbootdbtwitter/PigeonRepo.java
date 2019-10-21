package com.uk.javalon1.bart.springbootdbtwitter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PigeonRepo extends JpaRepository<Pigeon, Long> {
}
