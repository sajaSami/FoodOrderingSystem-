
package com.orderservice.orderservice.models;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String customerName;
    private Long item_id;
    private  Integer quantity;
    
}
