package com.microservices.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.Entity.Rating;

public interface Repository extends JpaRepository<Rating, String> {
	
	
	List<Rating> findByUserId(String userId);
	List<Rating> findByHotelId(String hotelId);

}
