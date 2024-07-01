package enigma.tokoturing.service.implementation;

import enigma.tokoturing.model.Order;
import enigma.tokoturing.model.OrderDetail;
import enigma.tokoturing.model.Product;
import enigma.tokoturing.repository.OrderDetailRepository;
import enigma.tokoturing.service.OrderDetailService;
import enigma.tokoturing.service.ProductService;
import enigma.tokoturing.utils.DTO.OrderDetailDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderDetailServiceImpl implements OrderDetailService {
    private final OrderDetailRepository repo;
    private final ProductService productService;

    @Override
    public OrderDetail create(OrderDetailDTO req) {
        OrderDetail newOrder = new OrderDetail();
        Product product = productService.getOne(req.getProduct_id());
        Order order = req.getOrder();

        newOrder.setPrice(product.getPrice());
        newOrder.setQuantity(req.getQuantity());
        newOrder.setOrder(order);
        newOrder.setProduct(product);

        return repo.save(newOrder);
    }

    @Override
    public List<OrderDetail> getAll() {
        return repo.findAll();
    }

    @Override
    public OrderDetail getOne(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public OrderDetail update(Integer id, OrderDetail req) {
        OrderDetail od = this.getOne(id);
        od.setQuantity(req.getQuantity());
        od.setPrice(req.getPrice());
        return repo.save(od);
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
