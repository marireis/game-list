package com.marina.game.list.controller;

import com.marina.game.list.model.dto.GameDTO;
import com.marina.game.list.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService service;

    @GetMapping
    public List<GameDTO> findAll() {
        List<GameDTO> result = service.findAll();
        return result;
    }
}
