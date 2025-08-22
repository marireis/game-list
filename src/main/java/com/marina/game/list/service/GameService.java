package com.marina.game.list.service;

import com.marina.game.list.model.Game;
import com.marina.game.list.model.dto.GameDTO;
import com.marina.game.list.model.dto.GameDTOComplet;
import com.marina.game.list.projection.GameMinProjection;
import com.marina.game.list.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    @Transactional(readOnly = true)//assegura que não vai escrever, BD não usa operação de escrita
    public GameDTOComplet findById(long id){
        Game result = repository.findById(id).get();
        return new GameDTOComplet(result);
    }

    @Transactional(readOnly = true)
    public List<GameDTO> findAll(){
        List<Game> resultado =  repository.findAll();
        List<GameDTO> dto = resultado.stream().map(x -> new GameDTO(x)).toList();
        return dto;
    }

    @Transactional(readOnly = true)//assegura que não vai escrever, BD não usa operação de escrita
    public List<GameDTO> findByList(long listId){
        List<GameMinProjection> result = repository.searchByList(listId);
        return result.stream().map(x -> new GameDTO(x)).toList();
    }
}
