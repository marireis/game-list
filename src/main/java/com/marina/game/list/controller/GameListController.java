package com.marina.game.list.controller;

import com.marina.game.list.model.dto.GameListDTO;
import com.marina.game.list.service.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    public GameListService service;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = service.findAll();
        return result;
    }
}
