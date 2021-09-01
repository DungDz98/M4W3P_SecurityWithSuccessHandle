package spring.service;

import spring.model.AppUser;

import java.util.Optional;

public interface IAppUserService {
    Iterable<AppUser> findAll();
    Optional<AppUser> findById(Long id);
}
