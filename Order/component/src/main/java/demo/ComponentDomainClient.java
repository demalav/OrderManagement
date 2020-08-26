package demo;

import com.example.demo.Entity.OrderEntity;

@EnableFeignClients
@EnableDiscoveryClient
@Service
public class ComponentDomainClient {

    @Autowired
    IComponentDomainClient componentDomainClient;

    public ResponseEntity<OrderEntity> getOrder(String customername) {
        return componentDomainClient.getOrder(customername);
    }

    public void createOrder(OrderEntity orderEntity) {
        componentDomainClient.createOrder(orderEntity);
    }
}
