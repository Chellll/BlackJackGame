package com.example.blackjackgame.network.responce.profile;

public class DataProfileRequest {

    private String menu;

    public DataProfileRequest(String menu) {
        this.menu = menu;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }
}
