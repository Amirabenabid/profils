package com.amira.profil;
import java.util.Date;


import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.example.profil.repos.profilRepository;
import com.example.profil.service.profilService;
import com.example.profils.entities.profil;

@SpringBootTest
class profilApplicationTests {
@Autowired
private profilRepository profilRepository;

@Autowired
private profilService profilService;

@Test
public void testFindprofil()
{
//profil p = profilRepository.findById(1L).get(); 
//System.out.println(p);
}
@Test
public void testUpdateprofil()
{
//profil p= profilRepository.findById(1L).get();
//p.setPrixprofil(1000.0);
//profilRepository.save(p);
}
@Test
public void testDeleteprofil()
{
profilRepository.deleteById(1L);;
}
 
@Test
public void testListerTousprofils()
{
List<profil> prods = profilRepository.findAll();
for (profil p : prods)
{
System.out.println(p);
}
}
/*
@Test
public void testFindByNomprofil()
{
List<profil> prods = profilRepository.findByNomprofil("Stromae – Multitude");
for (profil p : prods)
{
System.out.println(p);
}
}
@Test
public void findByNomprofilContains()
{
List<profil> prods=profilRepository.findByNomprofilContains("P");
for (profil p : prods)
{
System.out.println(p);
} }
/*@Test
public void testfindByNomPrix()
{
List<profil> prods = profilRepository.findByNomPrix("Stromae – Multitude"+, 10.0);
for (profil p : prods)
{
System.out.println(p);
}
}

@Test
public void testTrierprofilsNomsPrix()
{
List<profil> prods = profilRepository.trierprofilsNomsPrix();
for (profil p : prods)
{
System.out.println(p);
}
}*/
}
