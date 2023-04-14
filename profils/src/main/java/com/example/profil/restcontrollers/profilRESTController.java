package com.example.profil.restcontrollers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.profil.service.profilService;
import com.example.profils.entities.profil;
@RestController
@RequestMapping("/api")
@CrossOrigin
public class profilRESTController {
@Autowired
profilService profilService;
@RequestMapping(method = RequestMethod.GET)
public List<profil> getAllMusiuques() {
return profilService.getAllprofils();
}
@RequestMapping(value="/{id}",method = RequestMethod.GET)
public profil getprofilById(@PathVariable("id") Long id) {
return profilService.getprofil(id);
 }
@RequestMapping(method = RequestMethod.POST)
public profil createprofil(@RequestBody profil profil) {
return profilService.saveprofil(profil);
}
@RequestMapping(method = RequestMethod.PUT)
public profil updateprofil(@RequestBody profil profil) {
return profilService.updateprofil(profil);
}
@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
public void deleteprofil(@PathVariable("id") Long id)
{
profilService.deleteprofilById(id);
}

}
