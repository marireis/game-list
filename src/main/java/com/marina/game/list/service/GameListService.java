package com.marina.game.list.service;

import com.marina.game.list.model.GameList;
import com.marina.game.list.model.dto.GameListDTO;
import com.marina.game.list.repository.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository repository;

    @Transactional
    public List<GameListDTO> findAll(){
        List<GameList> result = repository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }


}
