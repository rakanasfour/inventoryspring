package com.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cognizant.model.Inventory;
import com.cognizant.repo.InventoryRepo;
import com.cognizant.service.InventoryService;

@CrossOrigin(origins = "http://localhost:3000/")
	
@Controller
public class InventoryController{
	
	
	
	
	@Autowired
	InventoryService service;
	
	@Autowired
	InventoryRepo repo;
	
@RequestMapping("/home")
	
	public String home() {
		
		
		return"home";
	}
	@RequestMapping("/saveInventory")
	public Inventory saveInventory(@RequestBody Inventory inventory) {
	
	return service.saveInventory(inventory)	;
	}

/*
	
	@RequestMapping("/saveInventory")
	public String saveInventory(@ModelAttribute("inventory") Inventory inventory, ModelMap modelMap) {
	Inventory inventorySaved = service.saveInventory(inventory)	;
	String message ="The "+ inventorySaved.getProduct() + " has been inserted into the database " + inventorySaved.getId();
	modelMap.addAttribute("message", message);
	return "home";
	}
	
*/
	/*
	@GetMapping("/displayInventory")
	public List <Inventory> displayInventory() {
		List<Inventory> inventory = service.getAllInventory();


		return service.getAllInventory();
	}
		*/

	
	
	@GetMapping("/displayInventory")
	public List<Inventory> displayInventory() {
		
		return repo.findAll();
	}



	@RequestMapping("deleteInventory")
	public String deleteProduct(@RequestParam("id") int id, ModelMap modelMap) {
		// Location location = service.getLocationById(id);
		Inventory inventory = new Inventory();
		inventory.setId(id);
		service.deleteInventory(inventory);
		List<Inventory> inventorys = service.getAllInventory();
		modelMap.addAttribute("inventorys", inventorys);
		return "displayInventory";
	}

	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("id") int id, ModelMap modelMap) {
		Inventory inventory = service.getInventoryById(id);
		modelMap.addAttribute("inventory", inventory);
		return "updateInventory";
	}

	@RequestMapping("/updateInventory")
	public String updateInventory(@ModelAttribute("inventory") Inventory inventory, ModelMap modelMap) {
		service.updateInventory(inventory);
		List<Inventory> inventorys = service.getAllInventory();
		modelMap.addAttribute("inventorys", inventorys);
		return "displayInventory";
	}
	@RequestMapping("/bannedProduct")
	public String displayBanned(ModelMap modelMap) {
		List<Inventory> inventorys = service.getAllBannedProduct();
		modelMap.addAttribute("inventorys", inventorys);
		return "displayInventory";
	}
	
	@RequestMapping("/minPrice")
	public String getAllPrice(int price, ModelMap modelMap) {
		List<Inventory> inventorys = service.getAllPrice(price);
		modelMap.addAttribute("inventorys", inventorys);
		return "displayInventory";
	}

	@RequestMapping("/searchProduct")
	public String searchProduct(String product, ModelMap modelMap) {
		 List<Inventory> inventorys = service.getProductByName(product);
		modelMap.addAttribute("inventorys", inventorys);
		return "displayInventory";
	}


	

	
}

