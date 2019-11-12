package estudo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import estudo.cursomc.domains.Produto;

/**
 * CategoriaRepository
 */
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}