package com.marina.game.list.model.dto;

import com.marina.game.list.model.GameList;

public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO() {
    }

    public GameListDTO(GameList list) {
       id = list.getId();
       name = list.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
