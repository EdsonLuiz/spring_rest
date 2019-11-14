package estudo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import estudo.cursomc.domains.Estado;;

/**
 * CategoriaRepository
 */
@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}