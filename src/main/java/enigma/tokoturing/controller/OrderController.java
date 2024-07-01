package enigma.tokoturing.controller;

import enigma.tokoturing.model.Order;
import enigma.tokoturing.service.OrderDetailService;
import enigma.tokoturing.service.OrderService;
import enigma.tokoturing.service.ProductService;
import enigma.tokoturing.service.UserService;
import enigma.tokoturing.utils.DTO.OrderDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    public Order create(@RequestBody OrderDTO request) {
        return orderService.create(request);
    }

    @GetMapping
    public List<Order> getAll() {
        return orderService.getAll();
    }
}
