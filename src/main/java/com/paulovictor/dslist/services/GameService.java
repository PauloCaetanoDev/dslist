package com.paulovictor.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paulovictor.dslist.DTO.GameDTO;
import com.paulovictor.dslist.DTO.GameMinDTO;
import com.paulovictor.dslist.entities.Game;
import com.paulovictor.dslist.projections.GameMinProjection;
import com.paulovictor.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
	
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x ->new GameMinDTO(x)).toList();
		return dto;	
	}
	
	@Transactional(readOnly = true)
	 public GameDTO findById(Long id) {
		 Game result = gameRepository.findById(id).get();
		 GameDTO dto = new GameDTO(result);
		 return dto;
	 }
	 
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByeList(Long listId) {
	
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		List<GameMinDTO> dto = result.stream().map(x ->new GameMinDTO(x)).toList();
		return dto;	
	
	}
	 
}
