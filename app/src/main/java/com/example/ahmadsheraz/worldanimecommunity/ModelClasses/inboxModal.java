package com.example.ahmadsheraz.worldanimecommunity.ModelClasses;

public class inboxModal {


    int image;
    String fullname;
    String lastUpdate;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public inboxModal(int image, String fullname, String lastUpdate) {
        this.image = image;
        this.fullname = fullname;
        this.lastUpdate = lastUpdate;
    }
}
