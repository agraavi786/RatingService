package com.microservices.Services;

import java.util.List;

import com.microservices.Entity.Rating;

public interface RatingServices {
	
	Rating createRating(Rating rating);
	
	
	List<Rating> getRating();
	
	//get all rating by userid
	
	List<Rating> getratingByUserId(String userId);
	
	//get all rating by hotel id
	
	List<Rating> getRatingByHotelId(String hotelId);

}
