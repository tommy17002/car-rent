package enigma.tokoturing.controller;

import enigma.tokoturing.model.Product;
import enigma.tokoturing.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public Product create(@RequestBody Product req) {
        return productService.create(req);
    }

    @GetMapping
    public List<Product> getAll() {
        return productService.getAll();
    }
}
