package com.microservices.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.Entity.Rating;
import com.microservices.ImplServices.ImpleRatingServices;

@RestController
@RequestMapping("/ratings")
public class RatingController {
	
	@Autowired
	private ImpleRatingServices implser;
	
	@PostMapping
	public ResponseEntity<Rating> create(@RequestBody Rating rating) {
		Rating createRating = implser.createRating(rating);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(createRating);
		
	}
	
	@GetMapping
	public ResponseEntity<List<Rating>> getAllrating(@PathVariable int ratingid){
		List<Rating> rating = implser.getRating();	
		
		return ResponseEntity.ok(rating);
	}
	
	
	@GetMapping("/users/{id}")
	public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String id){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(implser.getratingByUserId(id));
		
		
	}
	
	@GetMapping("/hottes/{id}")
	public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String id){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(implser.getRatingByHotelId(id));
		
		
	}

}
