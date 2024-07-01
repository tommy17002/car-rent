package enigma.tokoturing.service;

import enigma.tokoturing.model.OrderDetail;
import enigma.tokoturing.utils.DTO.OrderDetailDTO;

import java.util.List;

public interface OrderDetailService {
    OrderDetail create(OrderDetailDTO req);
    List<OrderDetail> getAll();
    OrderDetail getOne(Integer id);
    OrderDetail update(Integer id, OrderDetail req);
    void delete(Integer id);
}
