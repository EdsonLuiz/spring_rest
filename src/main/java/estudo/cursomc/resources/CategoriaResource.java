package estudo.cursomc.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import estudo.cursomc.domains.Categoria;

/**
 * CategoriaResource
 */
@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

    @GetMapping
    public List<Categoria> show() {

        List<Categoria> categorias = new ArrayList<>(
                Arrays.asList(new Categoria(1, "Informática"), new Categoria(2, "Escritório")));
        return categorias;
    }

}