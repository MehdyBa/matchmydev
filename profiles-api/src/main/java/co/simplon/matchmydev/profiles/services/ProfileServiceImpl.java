package co.simplon.matchmydev.profiles.services;

import java.util.Collection;

import org.springframework.stereotype.Service;

import co.simplon.matchmydev.profiles.dtos.ProfileDetailView;
import co.simplon.matchmydev.profiles.dtos.ProfileUpdateDto;
import co.simplon.matchmydev.profiles.dtos.ProfileView;
import co.simplon.matchmydev.profiles.entities.Profile;
import co.simplon.matchmydev.profiles.repositories.ProfileRepository;

@Service
public class ProfileServiceImpl implements ProfileService {
	private ProfileRepository profiles;

	public ProfileServiceImpl(ProfileRepository profiles) {
		this.profiles = profiles;
	}

	@Override
	public Collection<ProfileView> getAll() {
		return profiles.findAllProjectedBy();
	}

	@Override
	public ProfileDetailView getProfile(Long id) {
		return profiles.findProjectedById(id);
	}

	@Override
	public void update(ProfileUpdateDto inputs, Long id) {
		Profile entity = profiles.findById(id).get();
		entity.setDescription(inputs.getDescription());

		profiles.save(entity);

	}

}
