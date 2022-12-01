package com.cognizant;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.model.Inventory;
import com.cognizant.repo.InventoryRepo;

@SpringBootTest
class InventorymsApplicationTests {
	@Autowired
	private InventoryRepo repo;


	@Test
	public void testSave() {
		Inventory i = new Inventory();
		i.setId(4);
		i.setProduct("cup");
		i.setPrice(300);
		i.setAisle(4);
		i.setDate("01/01/2020");
		i.setStatus("Available");
		repo.save(i);
		assertNotNull(repo.findById(4).get());
	}
	
	@Test
	public void testDisplayAll() {
		
		List<Inventory>list = repo.findAll();
		assertThat(list).size().isGreaterThan(0);
		
		
	}
	
	
	
	
	
	
}
