package com.stephanie.instagramclone.Models;


public class Like {

    private String user_id;

    public Like() {
    }

    public Like(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

