package estudo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import estudo.cursomc.domains.Cidade;

/**
 * CategoriaRepository
 */
@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}