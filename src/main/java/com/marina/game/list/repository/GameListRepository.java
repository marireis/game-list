package com.marina.game.list.repository;

import com.marina.game.list.model.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
