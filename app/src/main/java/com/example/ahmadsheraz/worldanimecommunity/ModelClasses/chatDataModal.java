package com.example.ahmadsheraz.worldanimecommunity.ModelClasses;

public class chatDataModal {


    String username;
    String chatContent;
    int userImage;
    int chatImage;
    int chatGif;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getChatContent() {
        return chatContent;
    }

    public void setChatContent(String chatContent) {
        this.chatContent = chatContent;
    }

    public int getUserImage() {
        return userImage;
    }

    public void setUserImage(int userImage) {
        this.userImage = userImage;
    }

    public int getChatImage() {
        return chatImage;
    }

    public void setChatImage(int chatImage) {
        this.chatImage = chatImage;
    }

    public int getChatGif() {
        return chatGif;
    }

    public void setChatGif(int chatGif) {
        this.chatGif = chatGif;
    }

    public chatDataModal(String username, String chatContent, int userImage, int chatImage, int chatGif) {
        this.username = username;
        this.chatContent = chatContent;
        this.userImage = userImage;
        this.chatImage = chatImage;
        this.chatGif = chatGif;
    }
}
