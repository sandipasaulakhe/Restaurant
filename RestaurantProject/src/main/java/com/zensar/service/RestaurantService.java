package com.zensar.service;

import java.util.List;

import com.zensar.model.Restaurant;

public interface RestaurantService {

	Restaurant getRestaurant(int Rid);
    List<Restaurant> getAllRestaurants();
    boolean insertRestaurant(Restaurant restaurant);
    boolean updateRestaurant(Restaurant r);
    boolean deleteRestaurant(int Rid);


}
