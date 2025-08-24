package com.marina.game.list.service;

import com.marina.game.list.model.GameList;
import com.marina.game.list.model.dto.GameListDTO;
import com.marina.game.list.projection.GameMinProjection;
import com.marina.game.list.repository.GameListRepository;
import com.marina.game.list.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository listRepository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional
    public List<GameListDTO> findAll(){
        List<GameList> result = listRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex) {

        List<GameMinProjection> list = gameRepository.searchByList(listId);

        GameMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        for (int i = min; i <= max; i++) {
            listRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }
    }

}
