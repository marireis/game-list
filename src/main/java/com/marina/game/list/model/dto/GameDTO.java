package com.marina.game.list.model.dto;

import com.marina.game.list.model.Game;

public class GameDTO {

    private Long id;
    private String title;
    private String year;
    private String imgUrl;
    private String shortDescription;

    public GameDTO() {
    }

    public GameDTO(Game game) {
        id = game.getId();
        title = game.getTitle();
        year = game.getYear();
        imgUrl = game.getImgUrl();
        shortDescription = game.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
