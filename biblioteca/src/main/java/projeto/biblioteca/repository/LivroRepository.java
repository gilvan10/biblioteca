package projeto.biblioteca.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import projeto.biblioteca.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

}
