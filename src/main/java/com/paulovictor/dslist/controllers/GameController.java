package com.paulovictor.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paulovictor.dslist.DTO.GameDTO;
import com.paulovictor.dslist.DTO.GameMinDTO;
import com.paulovictor.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameservice;
	
	
	@GetMapping
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> result = gameservice.findAll();
		return result;	
	}
	
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id) {
		GameDTO result = gameservice.findById(id);
		return result;	
	}

}
