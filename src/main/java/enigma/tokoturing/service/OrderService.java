package enigma.tokoturing.service;

import enigma.tokoturing.model.Order;
import enigma.tokoturing.utils.DTO.OrderDTO;

import java.util.List;

public interface OrderService {
    Order create(OrderDTO req);
    List<Order> getAll();
    Order getOne(Integer id);
    void delete(Integer id);
}
