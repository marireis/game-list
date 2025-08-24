package com.marina.game.list.controller;

import com.marina.game.list.model.dto.GameDTO;
import com.marina.game.list.model.dto.GameListDTO;
import com.marina.game.list.model.dto.ReplacementDTO;
import com.marina.game.list.service.GameListService;
import com.marina.game.list.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    public GameListService listService;

    @Autowired
    public GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = listService.findAll();
        return result;
    }

    @GetMapping(value="/{listId}/games")
    public List<GameDTO> findByList(@PathVariable Long listId) {
        List<GameDTO> result = gameService.findByList(listId);
        return result;
    }

    @PostMapping(value="/{listId}/replacement")
    public void move(@PathVariable Long listId, ReplacementDTO body){
        listService.move(listId,body.getSourceIndex(),body.getDestinationIndex());
    }

}
