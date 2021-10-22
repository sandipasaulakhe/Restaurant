package com.zensar.dao;

import java.util.List;

import com.zensar.model.Restaurant;

public interface RestaurantDao {
	Restaurant getRestaurant(int id);
    List<Restaurant> getAllRestaurant();
    boolean insertRestaurant(Restaurant Restaurant);
    boolean updateRestaurant(Restaurant r);
    boolean deleteRestaurant(int Rid);


}
