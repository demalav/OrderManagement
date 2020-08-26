package demo;

import com.example.demo.Entity.OrderEntity;
import com.example.demo.Entity.OrderItemEntity;

import java.math.BigInteger;

@FeignClient(value = "order-management", configuration = ErrorResponseDecoder.class)
public interface IComponentDomainClient {


    @RequestMapping(value = "/data/orderdetails/order/{customername}", method = GET)
    public ResponseEntity<OrderEntity> getOrder(String customername);

    @RequestMapping(value = "/data/orderdetails/create/order", method = POST)
    public void createOrder(OrderEntity orderEntity);

    @RequestMapping(value = "/data/order/orderdetails/{productCode}", method = GET)
    public ResponseEntity<OrderItemEntity> getOrderItem(BigInteger productCode);

    @RequestMapping(value = "/data/order/create/orderitems", method = POST)
    public void createOrderItem(OrderItemEntity orderItemEntity);
}
