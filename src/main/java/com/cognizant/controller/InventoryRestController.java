package com.cognizant.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.model.Inventory;
import com.cognizant.service.InventoryService;
@CrossOrigin
/*(origins = "http://localhost:3000/")*/
@RestController
@RequestMapping("/inventorys")


public class InventoryRestController  {
	
	
		@Autowired
		InventoryService inventoryService;
		
		@GetMapping("/getAll")
		public List<Inventory> getInventory(){
			return inventoryService.getAllInventory();
		}

		@PostMapping("/add")
		public Inventory createInventory(@RequestBody Inventory inventory) {
			return inventoryService.saveInventory(inventory);
		}

		@DeleteMapping("/{id}")
		public void deleteLocation(@PathVariable("id") int id) {
			inventoryService.deleteInventory(id);
		}

		@GetMapping("/{id}")
		public Inventory getLocation(@PathVariable("id") int id) {
			return inventoryService.getInventoryById(id);

		}
		

	


}
