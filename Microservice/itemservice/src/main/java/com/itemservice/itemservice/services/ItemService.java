package com.itemservice.itemservice.services;

import com.itemservice.itemservice.models.Menu;
import com.itemservice.itemservice.repositories.ItemRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;
    public List<Menu> getAllItems(){
        return this.itemRepository.findAll();
    }
    public Menu getItemById(Long id){
        return this.itemRepository.findById(id).get();
    }
    public Menu addItem(Menu item){
        return this.itemRepository.save(item);
    }
}
