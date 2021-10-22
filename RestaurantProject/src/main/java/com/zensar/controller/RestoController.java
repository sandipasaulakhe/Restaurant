package com.zensar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zensar.model.Restaurant;
import com.zensar.service.RestaurantService;

@Controller
public class RestoController {
	
	@Autowired
	private RestaurantService restoservice;
	
	@GetMapping(value="/list")
	public String viewallrestaurants(Model m)
	{

		System.out.println("innnnn");
		List<Restaurant> rlist=restoservice.getAllRestaurants();
		m.addAttribute("listRestaurant",rlist);
		return "restaurantlist";
	}
	
	
	
	@PostMapping(value="/insert")
	public String addresto(@ModelAttribute("resto") Restaurant r)
	{
		restoservice.insertRestaurant(r);
		return "redirect:/list";
	}
	
	@GetMapping(value="/delete/{rid}")
	public String deleterestaurant(@PathVariable("rid")int Rid)
	{
		restoservice.deleteRestaurant(Rid);
		return "redirect:/list";
	
	}
	@GetMapping(value="/edit/{rid}")
	public String updateresto(@PathVariable int rid,Model m)
	{

		Restaurant r1=restoservice.getRestaurant(rid);
		System.out.println(r1);
		System.out.println("in edit "+rid );
		m.addAttribute("restaurant",r1);
		return "Addresto";
	}
	@PostMapping(value="/edit/save")
	public String saveResto(@ModelAttribute("resto") Restaurant r1)
	{  

		System.out.println("save :"+ r1);
	     restoservice.updateRestaurant(r1);
	     return "redirect:/list";
	}
	
}