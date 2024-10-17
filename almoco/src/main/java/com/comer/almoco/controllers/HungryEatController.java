package com.comer.almoco.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.comer.almoco.dtos.danilexDTO;
import com.comer.almoco.models.ComerModel;
import com.comer.almoco.repositorys.ComerRepository;

import jakarta.validation.Valid;

@Controller
@RequestMapping("esquina")

public class HungryEatController {
	@Autowired
	ComerRepository repository;
	@GetMapping("comer")
	public ResponseEntity<?> getComida() {
		var teste = repository.findAll();
	return ResponseEntity.ok().body(teste);
		
	}
	@PostMapping("comida")
	public ResponseEntity<?> postComida(@RequestBody @Valid danilexDTO data) {
		ComerModel teste = new ComerModel();
		teste.setProteina(data.proteina());
		teste.setCarboidrato(data.carboidrato());
		teste.setFibra(data.fibra());
		teste.setGordura(data.gordura());
		teste.setBebida(data.bebida());
		teste.setSobremesa(data.sobremesa());
		repository.save(teste);
	return ResponseEntity.ok().body(teste);
		
	}
}
