package com.murilo.microservices.hr_user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.murilo.microservices.hr_user.entities.User;

/**
 * Retrieves a user entity by its email address.
 * <p>
 * This method will be implemented automatically by Spring Data JPA based on its
 * name.
 * </p>
 *
 * @param email the email address of the user to retrieve
 * @return the {@link User} entity with the specified email, or {@code null} if
 *         none found
 */
public interface IUserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
