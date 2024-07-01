package enigma.tokoturing.service.implementation;

import enigma.tokoturing.model.Order;
import enigma.tokoturing.model.OrderDetail;
import enigma.tokoturing.model.User;
import enigma.tokoturing.repository.OrderRepository;
import enigma.tokoturing.service.OrderDetailService;
import enigma.tokoturing.service.OrderService;
import enigma.tokoturing.service.ProductService;
import enigma.tokoturing.service.UserService;
import enigma.tokoturing.utils.DTO.OrderDTO;
import enigma.tokoturing.utils.DTO.OrderDetailDTO;
import lombok.RequiredArgsConstructor;
import org.aspectj.weaver.ast.Or;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    private final ProductService productService;
    private final UserService userService;
    private final OrderDetailService oDetailService;
    @Override
    public Order create(OrderDTO req) {
        User user = userService.getOne(req.getUser_id());
        List<OrderDetailDTO> details = req.getDetails();
//        List<OrderDetail> details = req.getDetails();
        Order newOrder = new Order();
        newOrder.setUser(user);

        Order result = orderRepository.save(newOrder);

        for (OrderDetailDTO detail : details) {
            detail.setOrder(result);
            oDetailService.create(detail);
        }

        return result;
    }

    @Override
    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOne(Integer id) {
        return orderRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        orderRepository.deleteById(id);
    }
}
