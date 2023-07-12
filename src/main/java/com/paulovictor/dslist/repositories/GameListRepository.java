package com.paulovictor.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulovictor.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
