package labshopcompensation.domain;

import java.util.*;
import labshopcompensation.domain.*;
import labshopcompensation.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class DeliveryDeleted extends AbstractEvent {

    private Long id;
    private String address;
    private String customerId;
    private Integer quantity;
    private Long orderId;

    public DeliveryDeleted(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryDeleted() {
        super();
    }
}
