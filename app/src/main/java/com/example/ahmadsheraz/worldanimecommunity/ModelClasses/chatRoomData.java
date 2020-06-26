package com.example.ahmadsheraz.worldanimecommunity.ModelClasses;

public class chatRoomData {



    int image;
    String chatRoomName;
    String peopleInside;
    String lastUpdate;
    String founder;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getChatRoomName() {
        return chatRoomName;
    }

    public void setChatRoomName(String chatRoomName) {
        this.chatRoomName = chatRoomName;
    }

    public String getPeopleInside() {
        return peopleInside;
    }

    public void setPeopleInside(String peopleInside) {
        this.peopleInside = peopleInside;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public chatRoomData(int image, String chatRoomName, String peopleInside, String lastUpdate, String founder) {
        this.image = image;
        this.chatRoomName = chatRoomName;
        this.peopleInside = peopleInside;
        this.lastUpdate = lastUpdate;
        this.founder = founder;
    }
}
