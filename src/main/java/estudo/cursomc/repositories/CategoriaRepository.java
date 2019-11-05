package estudo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import estudo.cursomc.domains.Categoria;

/**
 * CategoriaRepository
 */
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}