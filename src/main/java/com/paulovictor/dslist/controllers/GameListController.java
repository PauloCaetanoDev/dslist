package com.paulovictor.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paulovictor.dslist.DTO.GameListDTO;
import com.paulovictor.dslist.DTO.GameMinDTO;
import com.paulovictor.dslist.services.GameListService;
import com.paulovictor.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	@Autowired
	private GameService gameservice;
	
	
	@GetMapping
	public List<GameListDTO> findAll() {
		List<GameListDTO> result = gameListService.findAll();
		return result;	
	}
	
	@GetMapping(value = "/{ListId}/games")
	public List<GameMinDTO> findByeList(@PathVariable Long ListId) {
		List<GameMinDTO> result = gameservice.findByeList(ListId);
		return result;	
	}
}
