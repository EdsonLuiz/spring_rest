package estudo.cursomc.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import estudo.cursomc.domains.Categoria;
import estudo.cursomc.repositories.CategoriaRepository;

/**
 * CategoriaService
 */
@Service
public class CategoriaService {

    private CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public Categoria index(Integer id) {
        Optional<Categoria> obj = categoriaRepository.findById(id);
        return obj.orElse(null);
    }

}