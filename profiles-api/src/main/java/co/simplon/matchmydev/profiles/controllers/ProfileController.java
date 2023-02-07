package co.simplon.matchmydev.profiles.controllers;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.matchmydev.profiles.dtos.ProfileView;
import co.simplon.matchmydev.profiles.services.ProfileService;

@RestController
@RequestMapping("/profiles")
public class ProfileController {

	private ProfileService service;

	public ProfileController(ProfileService service) {

		this.service = service;
	}

	@GetMapping
	public Collection<ProfileView> getAll() {

		return service.getAll();
	}

}
