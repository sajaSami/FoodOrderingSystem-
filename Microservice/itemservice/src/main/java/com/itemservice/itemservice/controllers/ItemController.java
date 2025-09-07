
package com.itemservice.itemservice.controllers;

import com.itemservice.itemservice.models.Menu;
import com.itemservice.itemservice.services.ItemService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/items")
public class ItemController {
    @Autowired
    private ItemService itemService;
    
    
    @GetMapping("/")
    public ResponseEntity< List<Menu> >showtAllItems(){
       List<Menu> items=this.itemService.getAllItems();
       return new ResponseEntity(items,HttpStatus.OK);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Menu> getItemById(@PathVariable Long id){
        Menu retrievedItem=this.itemService.getItemById(id);
        return new ResponseEntity<>(retrievedItem, HttpStatus.OK);
    }
   @PostMapping("/add") 
   public ResponseEntity<Menu> addItem(@RequestBody Menu item){
    Menu newItem=this.itemService.addItem(item);
    return new ResponseEntity<>(newItem, HttpStatus.CREATED); 
   }
}
