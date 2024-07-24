package projeto.dio.projeto_dio.domain.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto.dio.projeto_dio.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
