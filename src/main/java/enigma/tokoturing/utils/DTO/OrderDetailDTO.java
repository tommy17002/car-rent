package enigma.tokoturing.utils.DTO;
import enigma.tokoturing.model.Order;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class OrderDetailDTO {
    private Integer price;
    private Integer quantity;
    private Integer product_id;
    private Order order;
}
