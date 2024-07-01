package enigma.tokoturing.utils.DTO;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class OrderDTO {
    private Integer user_id;
    private List<OrderDetailDTO> details;
}
