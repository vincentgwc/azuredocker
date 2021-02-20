package com.vg.azure.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.vg.azure.entity.UserProfile;

public interface UserProfileRepo extends PagingAndSortingRepository<UserProfile, String>{

}
