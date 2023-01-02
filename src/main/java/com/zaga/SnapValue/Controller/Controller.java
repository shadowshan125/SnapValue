package com.zaga.SnapValue.Controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zaga.SnapValue.Repositories.UserRepository;
import com.zaga.SnapValue.model.UserModel;

@RestController
@RequestMapping("/api/UserModels")
public class Controller {

	@Autowired
	private UserRepository userRepository;

	// get all UserModels
	@GetMapping
	public List<UserModel> getAllUserModels() {
		return this.userRepository.findAll();
	}

	// get UserModel by id
	@GetMapping("/{id}")
	public UserModel getUserModelById(@PathVariable(value = "id") BigInteger UserModelId) {
		return this.userRepository.findById(UserModelId)
				.orElseThrow(() -> new ResourceNotFoundException("UserModel not found with id :" + UserModelId));
	}

	// create UserModel
	@PostMapping
	public UserModel createUserModel(@RequestBody UserModel UserModel) {
		return this.userRepository.save(UserModel);
	}

	// update UserModel
	@PutMapping("/{id}")
	public UserModel updateUserModel(@RequestBody UserModel UserModel, @PathVariable("id") BigInteger UserModelId) {
		UserModel existingUserModel = this.userRepository.findById(UserModelId)
				.orElseThrow(() -> new ResourceNotFoundException("UserModel not found with id :" + UserModelId));
		existingUserModel.setUserName(UserModel.getUserName());
		existingUserModel.setUserAge(UserModel.getUserAge());
		return this.userRepository.save(existingUserModel);
	}

	// delete UserModel by id
	@DeleteMapping("/{id}")
	public ResponseEntity<UserModel> deleteUserModel(@PathVariable("id") BigInteger UserModelId) {
		UserModel existingUserModel = this.userRepository.findById(UserModelId)
				.orElseThrow(() -> new ResourceNotFoundException("UserModel not found with id :" + UserModelId));
		this.userRepository.delete(existingUserModel);
		return ResponseEntity.ok().build();
	}
}
