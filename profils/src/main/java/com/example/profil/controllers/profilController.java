package com.example.profil.controllers;

import java.text.ParseException;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.profil.service.profilService;
import com.example.profils.entities.profil;
@Controller
public class profilController {
@Autowired
profilService profilService;


/*
@RequestMapping("/saveprofil")
public String saveprofil(ModelMap modelMap,@Valid profil profil,
BindingResult bindingResult)
{
	
System.out.println(profil);
if (bindingResult.hasErrors()) return "formprofil";
profilService.saveprofil(profil);
return "redirect:/listeprofil";
}

*/

@RequestMapping("/modifierprofil")
public String editerprofil(@RequestParam("id") Long id,ModelMap modelMap)
{
	profil p= profilService.getprofil(id);
	modelMap.addAttribute("profil", p);
	modelMap.addAttribute("mode", "edit");
	return "formprofil";

}
@RequestMapping("/updateprofil")
public String updateprofil(@ModelAttribute("profil") profil profil,
@RequestParam("date") String date,ModelMap modelMap) throws ParseException {
	
	 profilService.updateprofil(profil);
	 List<profil> m = profilService.getAllprofils();
	 modelMap.addAttribute("profils", m);
	return "listeprofil";
	}
}
