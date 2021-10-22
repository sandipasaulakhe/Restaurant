package com.zensar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.dao.RestaurantDao;
import com.zensar.model.Restaurant;

@Service
public class RestaurantServiceImpl implements RestaurantService {

	@Autowired
	private RestaurantDao rdao;

	@Override
	public Restaurant getRestaurant(int id) {
		// TODO Auto-generated method stub
		return rdao.getRestaurant(id);
	}

	@Override
	public List<Restaurant> getAllRestaurants() {
		// TODO Auto-generated method stub
		return rdao.getAllRestaurant();
	}

	@Override
	public boolean insertRestaurant(Restaurant restaurant) {
		// TODO Auto-generated method stub
		return rdao.insertRestaurant(restaurant);
	}

	@Override
	public boolean updateRestaurant(Restaurant r) {
		// TODO Auto-generated method stub
		return rdao.updateRestaurant(r);
	}

	@Override
	public boolean deleteRestaurant(int Rid) {
		// TODO Auto-generated method stub
		return rdao.deleteRestaurant(Rid);
	}
}
	
	