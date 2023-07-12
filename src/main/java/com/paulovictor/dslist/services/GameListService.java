package com.paulovictor.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paulovictor.dslist.DTO.GameListDTO;
import com.paulovictor.dslist.entities.GameList;
import com.paulovictor.dslist.repositories.GameListRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		List<GameListDTO> dto = result.stream().map(x ->new GameListDTO(x)).toList();
		return dto;	
	}
	
	 
	  
}
