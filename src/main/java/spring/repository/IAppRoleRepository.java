package spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.model.AppRole;

public interface IAppRoleRepository extends JpaRepository<AppRole, Long> {
}
