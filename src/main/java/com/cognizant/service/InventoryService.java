package com.cognizant.service;

import java.util.List;

import com.cognizant.model.Inventory;

public interface InventoryService {
	
	Inventory saveInventory(Inventory inventory);

	Inventory updateInventory(Inventory inventory);
	
	void deleteInventory(int id);

	Inventory getInventoryById(int id);

	List<Inventory> getAllInventory();
	
	
	
	 List<Inventory> getAllBannedProduct();


	List<Inventory> getAllPrice(int price);
	


	List<Inventory> getProductByName(String product);
	

	
	


}
