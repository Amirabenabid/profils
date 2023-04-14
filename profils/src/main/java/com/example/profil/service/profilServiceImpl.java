
package com.example.profil.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.profil.repos.profilRepository;
import com.example.profils.entities.profil;
@Service
public class profilServiceImpl implements profilService {
@Autowired
profilRepository profilRepository;
@Override
public profil saveprofil(profil p) {
	return profilRepository.save(p);
	}
	@Override
	public profil updateprofil(profil p) {
	return profilRepository.save(p);
	}
	@Override
	public void deleteprofil(profil p) {
	profilRepository.delete(p);
	}
	 @Override
	public void deleteprofilById(Long id) {
	profilRepository.deleteById(id);
	}
	@Override
	public profil getprofil(Long id) {
	return profilRepository.findById(id).get();
	}
	
	@Override
	public List<profil> getAllprofils() {
		return profilRepository.findAll();

	}

	
	
	/*@Autowired
	private profilRepository repo;
	 
	public List<profil> listAll(String keyword) {
	    if (keyword != null) {
	        return repo.search(keyword);
	    }
	    return repo.findAll();
	}*/
}