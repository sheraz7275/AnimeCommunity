package com.example.ahmadsheraz.worldanimecommunity.ModelClasses;

public class mainScreenModal {

    int postType;
    String fullname;


    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }


    public int getPostType() {
        return postType;
    }

    public void setPostType(int postType) {
        this.postType = postType;
    }



    public mainScreenModal(int postType, String fullname) {
        this.postType = postType;
        this.fullname = fullname;
    }
}
