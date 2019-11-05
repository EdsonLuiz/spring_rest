package estudo.cursomc.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import estudo.cursomc.domains.Categoria;
import estudo.cursomc.services.CategoriaService;

/**
 * CategoriaResource
 */
@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

    private CategoriaService categoriaService;

    public CategoriaResource(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping
    public List<Categoria> show() {

        List<Categoria> categorias = new ArrayList<>(
                Arrays.asList(new Categoria(1, "Informática"), new Categoria(2, "Escritório")));
        return categorias;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> index(@PathVariable Integer id) {
        Categoria obj = categoriaService.index(id);
        return ResponseEntity.ok().body(obj);
    }

}