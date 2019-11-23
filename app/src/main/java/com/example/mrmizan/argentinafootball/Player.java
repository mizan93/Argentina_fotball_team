package com.example.mrmizan.argentinafootball;

/**
 * Created by mrmiz on 15-Oct-18.
 */

public class Player {

    private int pImage;
    private String pName;
    private String pDetails;

    public Player(int pImage, String pName, String pDetails) {
        this.pImage = pImage;
        this.pName = pName;
        this.pDetails = pDetails;
    }

    public int getpImage() {
        return pImage;
    }

    public void setpImage(int pImage) {
        this.pImage = pImage;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpDetails() {
        return pDetails;
    }

    public void setpDetails(String pDetails) {
        this.pDetails = pDetails;
    }
}
