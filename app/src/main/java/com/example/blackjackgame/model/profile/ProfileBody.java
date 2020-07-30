package com.example.blackjackgame.model.profile;

import com.google.gson.annotations.SerializedName;

public class ProfileBody {

    @SerializedName("menu")
    private String menu;

    @SerializedName("status")
    private String status;

    @SerializedName("toast")
    private String toast;

    @SerializedName("profile")
    private Profile profile;

    @SerializedName("time_server")
    private long time_server;

    public ProfileBody(String menu, String status, String toast, Profile profile, long time_server) {
        this.menu = menu;
        this.status = status;
        this.toast = toast;
        this.profile = profile;
        this.time_server = time_server;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getToast() {
        return toast;
    }

    public void setToast(String toast) {
        this.toast = toast;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public long getTime_server() {
        return time_server;
    }

    public void setTime_server(long time_server) {
        this.time_server = time_server;
    }
}
