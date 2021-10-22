package com.zensar.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.zensar.model.Restaurant;

@Repository
public class RestaurantDaoImpl implements RestaurantDao {
	
	@Autowired
	private JdbcTemplate jdbctemplate;

	@Override
	public Restaurant getRestaurant(int Rid) {

		Restaurant ob=jdbctemplate.queryForObject("select * from restaurant where rid="+Rid,new myRowmapper());
		
		return ob;
	}

	@Override
	public List<Restaurant> getAllRestaurant() {
		List<Restaurant> rlist=new ArrayList<>();
		rlist=jdbctemplate.query("select * from restaurant", new myRowmapper());
		return rlist;
	}

	@Override
	public boolean insertRestaurant(Restaurant restaurant) {
		int i=jdbctemplate.update("insert into restaurant values(?,?,?,?,?,?,?)",restaurant.getRid(),restaurant.getRname(),restaurant.getRadd(),restaurant.getRphno(),restaurant.getOpeningTime(),restaurant.getClosingTime(),restaurant.getCuisine());
		return i>0;
	}

	@Override
	
	public boolean updateRestaurant(Restaurant r) {
		System.out.println("Hiiiiii"+r);
		int i=jdbctemplate.update("update restaurant set rname=?,radd=?,rphno=?,openingTime=?,closingTime=?,cuisine=? where rid=?",r.getRname(),r.getRadd(),r.getRphno(),r.getOpeningTime(),r.getClosingTime(),r.getCuisine(),r.getRid());
		return i>0;
	}

	@Override
	public boolean deleteRestaurant(int Rid) {
		int i=jdbctemplate.update("delete from restaurant where rid=?",Rid);
		return i>0;
	}
	
	class myRowmapper implements RowMapper<Restaurant>
	{

		@Override
		public Restaurant mapRow(ResultSet rs, int rowNum) throws SQLException {
		Restaurant r1=new Restaurant();
		

			r1.setRid(rs.getInt(1));
			r1.setRname(rs.getString(2));
			r1.setRadd(rs.getString(3));
			r1.setRphno(rs.getLong(4));
			r1.setOpeningTime(rs.getString(5));
			r1.setClosingTime(rs.getString(6));
			r1.setCuisine(rs.getString(7));
			
		return r1;
		}
		
	}
}

