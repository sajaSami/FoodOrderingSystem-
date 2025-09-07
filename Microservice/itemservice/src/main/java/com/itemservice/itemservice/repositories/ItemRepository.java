
package com.itemservice.itemservice.repositories;

import com.itemservice.itemservice.models.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository  extends JpaRepository<Menu,Long>{
    
    
}
