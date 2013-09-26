package com.mobileproto.lab3;

import android.net.Uri;

public class Chat {

    private String message;
    private String author;
    private Uri data;

    // Required default constructor for Firebase object mapping
    private Chat() { }

    Chat(String message, String author) {
        this.message = message;
        this.author = author;
    }

    Chat(String message, String author, Uri data)
    {
        this.message = message;
        this.author = author;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public String getAuthor() {
        return author;
    }

    public Uri getData() {
        return data;
    }
}