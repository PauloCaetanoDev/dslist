package com.paulovictor.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paulovictor.dslist.DTO.GameMinDTO;
import com.paulovictor.dslist.entities.Game;
import com.paulovictor.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
	
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x ->new GameMinDTO(x)).toList();
		return dto;	
	}
}
