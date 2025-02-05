package com.microservices.ImplServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.Entity.Rating;
import com.microservices.Repository.Repository;
import com.microservices.Services.RatingServices;



@Service
public class ImpleRatingServices implements RatingServices{
	
	@Autowired
	private Repository repo;

	@Override
	public Rating createRating(Rating rating) {
		Rating save = repo.save(rating);
		return save;
		
	}

	@Override
	public List<Rating> getRating() {
		
		return repo.findAll();
	}

	@Override
	public List<Rating> getratingByUserId(String userId) {
		
		return repo.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		
		return repo.findByHotelId(hotelId);
	}

}
