package com.vg.azure.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vg.azure.entity.UserProfile;
import com.vg.azure.repo.UserProfileRepo;

@RestController
@RequestMapping("rest")
public class AzureRestController {
	
	@Autowired
	private UserProfileRepo userProfileRepo;
	
	@GetMapping("/users")
	  List<UserProfile> all() {
	    return (List<UserProfile>) userProfileRepo.findAll();
	  }
	
}
