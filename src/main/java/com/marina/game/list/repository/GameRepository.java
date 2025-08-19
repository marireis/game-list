package com.marina.game.list.repository;

import com.marina.game.list.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {
}
