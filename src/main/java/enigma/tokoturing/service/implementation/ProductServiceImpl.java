package enigma.tokoturing.service.implementation;

import enigma.tokoturing.model.Product;
import enigma.tokoturing.repository.ProductRepository;
import enigma.tokoturing.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product create(Product req) {
        return productRepository.save(req);
    }

    @Override
    public Product getOne(Integer id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product update(Product req) {
        return productRepository.save(req);
    }

    @Override
    public void delete(Integer id) {
        productRepository.deleteById(id);
    }
}
