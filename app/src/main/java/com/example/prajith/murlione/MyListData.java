package com.example.prajith.murlione;

import android.content.Intent;

import java.util.HashMap;
import java.util.Map;

public class MyListData{

    private Map<String, String> map = new HashMap<>();
    private String description;
    private int imgId;
    public MyListData(String description, int imgId, String link) {
        this.description = description;
        this.imgId = imgId;
        map.put(description,link);
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getImgId() {
        return imgId;
    }
    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public Map<String, String> getMap() {
        return map;
    }
}
