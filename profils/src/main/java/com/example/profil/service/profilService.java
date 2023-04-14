package com.example.profil.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.profils.entities.profil;
public interface profilService {
profil saveprofil(profil p);
profil updateprofil(profil p);
void deleteprofil(profil p);
 void deleteprofilById(Long id);
profil getprofil(Long id);
List<profil> getAllprofils();



}