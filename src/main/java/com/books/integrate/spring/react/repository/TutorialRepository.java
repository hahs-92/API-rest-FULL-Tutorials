package com.books.integrate.spring.react.repository;

import java.util.List;
import java.util.Optional;

import com.books.integrate.spring.react.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
	List<Tutorial> findByPublished(boolean published);
	List<Tutorial> findByTitleContaining(String title);

	Optional<Tutorial> findByTitle(String title);
	List<Tutorial> findByPrice(double price);

}
