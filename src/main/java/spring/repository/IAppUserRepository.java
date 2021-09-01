package spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.model.AppUser;

@Repository
public interface IAppUserRepository extends JpaRepository<AppUser, Long> {
    AppUser findByUsername(String username);
}
