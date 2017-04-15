package com.example.apple.medizone.DataProviders;

/**
 * Created by Apple on 3/26/2017.
 */
public class ReviewsDataProvider {
    String username,description;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ReviewsDataProvider(String username, String description) {

        this.username = username;
        this.description = description;
    }
}
