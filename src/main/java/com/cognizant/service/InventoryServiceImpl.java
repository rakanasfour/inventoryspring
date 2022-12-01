package com.cognizant.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import com.cognizant.model.Inventory;
import com.cognizant.repo.InventoryRepo;
@EnableCaching
@Service
public class InventoryServiceImpl implements InventoryService {
	
	@Autowired
	private InventoryRepo repo;

	
	
	
	@Override
	public Inventory saveInventory(Inventory inventory) {
		return repo.save(inventory);

	}
	@Override
	public Inventory updateInventory(Inventory inventory) {
		return repo.save(inventory);
	}
	@Override
	public void deleteInventory(Inventory inventory) {
		repo.delete(inventory);
	}
	

	@Override
	//@Cacheable(cacheNames="getInventoryById", key="id")
	public Inventory getInventoryById(int id) {
		
		return repo.findById(id).get();
		
		
	}

	
	
	 
	 @Override 
	public 	List<Inventory> getAllInventory(){
		 List<Inventory> inventory=repo.findAll();
		 
		return inventory;
	}

	 
	 
	 

	@Override 
	public 	List<Inventory> getAllBannedProduct(){
		//List<inventory> bannedList= new 

		return repo.findByStatus("Banned");
	}	
 
	public List<Inventory> getAllPrice(int price){
		
		return repo.findPrice(price);
		
	}

	public List<Inventory> getProductByName(String product) {
		
		return repo.findProduct(product);
		
	}
	
	

	

}

