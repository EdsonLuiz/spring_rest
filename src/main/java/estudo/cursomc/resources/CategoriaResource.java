package estudo.cursomc.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CategoriaResource
 */
@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

    @GetMapping
    public String show() {
        return "ok";
    }

}