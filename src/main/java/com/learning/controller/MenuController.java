package com.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.entity.Menu;
import com.learning.repository.MenuRepository;

@RestController
public class MenuController {

	@Autowired
	public MenuRepository menuRepo;
	@Autowired Menu menu;
	
	@PostMapping("/add-menu")
	public String addMenu(@RequestBody Menu menu) {
		menuRepo.save(menu);
		return"Menu add successfully...";
	}
	
	@GetMapping("/get-menu")
	public List<Menu> getMenu(){
		return menuRepo.findAll();
	}
	
	@DeleteMapping("/delete-menu-by-id")
	public String deleteMenuById(@RequestParam int id) {
		return "Menu with id "+ menu.getItem_id() +" deleted successfully.";
	}
}
