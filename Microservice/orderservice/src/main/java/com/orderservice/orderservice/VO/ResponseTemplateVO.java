
package com.orderservice.orderservice.VO;

import com.orderservice.orderservice.models.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private Order order;
    private Menu menu;
    
    
}
