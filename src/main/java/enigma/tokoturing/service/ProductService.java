package enigma.tokoturing.service;

import enigma.tokoturing.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
    Product create(Product req);
    Product getOne(Integer id);
    Product update(Product req);
    void delete(Integer id);
}
