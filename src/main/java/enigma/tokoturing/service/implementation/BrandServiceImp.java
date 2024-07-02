package enigma.tokoturing.service.implementation;

import enigma.tokoturing.model.Brand;
import enigma.tokoturing.repository.BrandRepository;
import enigma.tokoturing.service.BrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BrandServiceImp implements BrandService {
    private final BrandRepository brandRepository;
    @Override
    public List<Brand> getAll() {
        return brandRepository.findAll();
    }

    @Override
    public Brand create(Brand req) {
        return brandRepository.save(req);
    }

    @Override
    public Brand getOne(Integer id) {
        return brandRepository.findById(id).orElse(null);
    }

    @Override
    public Brand update(Brand req) {
        return brandRepository.save(req);
    }

    @Override
    public void delete(Integer id) {
        brandRepository.deleteById(id);
    }
}