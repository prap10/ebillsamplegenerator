package io.github.acamsys.ebillsamplegenerator.repository;

import io.github.acamsys.ebillsamplegenerator.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
