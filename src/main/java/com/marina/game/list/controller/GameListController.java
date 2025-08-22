package com.marina.game.list.controller;

import com.marina.game.list.model.dto.GameDTO;
import com.marina.game.list.model.dto.GameListDTO;
import com.marina.game.list.service.GameListService;
import com.marina.game.list.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    public GameListService listServiceservice;

    @Autowired
    public GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = listServiceservice.findAll();
        return result;
    }

    @GetMapping(value="/{listId}/games")
    public List<GameDTO> findByList(@PathVariable Long listId) {
        List<GameDTO> result = gameService.findByList(listId);
        return result;
    }

}
