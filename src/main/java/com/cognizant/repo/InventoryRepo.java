package com.cognizant.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.model.Inventory;
@Repository
//the name  of the model class == <Inventory, type of the primary key Integer>
public interface InventoryRepo extends JpaRepository<Inventory, Integer> {
	public List<Inventory> findByStatus(String status);
	
	@Query(value ="SELECT * FROM inventory.inventory where price <= ?1", nativeQuery= true)
	public List<Inventory> findPrice(int price);



@Query(value ="SELECT * FROM inventory.inventory where product = ?1", nativeQuery= true)
public List<Inventory> findProduct(String product );
}
