package com.marina.game.list.service;

import com.marina.game.list.model.Game;
import com.marina.game.list.model.dto.GameDTO;
import com.marina.game.list.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    public List<GameDTO> findAll(){
        List<Game> resultado =  repository.findAll();
        List<GameDTO> dto = resultado.stream().map(x -> new GameDTO(x)).toList();
        return dto;
    }
}
