
package com.orderservice.orderservice.services;

import com.orderservice.orderservice.Repositories.OrderRepository;
import com.orderservice.orderservice.VO.Menu;
import com.orderservice.orderservice.VO.ResponseTemplateVO;
import com.orderservice.orderservice.models.Order;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepository orderRepository;
    
    
    @Autowired
    private RestTemplate restTemplate;
    
    public  List <Order>getAllOrders(){
        return this.orderRepository.findAll();
        
    }
    public  Order getOrderById(Long id){
        return this.orderRepository.findById(id).get();
        
    }
    public Order addOrder(Order order){
        return this.orderRepository.save(order);
    }

    public ResponseTemplateVO getOrderWithItemByOrderId(Long orderId) {
        Order order=this.getOrderById(orderId);
       Menu item= this.restTemplate
               .getForObject("http://ITEMSERVICE/items/"
                       +order.getItem_id(), Menu.class);
       
       ResponseTemplateVO vo= new ResponseTemplateVO();
       vo.setOrder(order);
       vo.setMenu(item);
       return vo;
       
        
    }
    
    
}
