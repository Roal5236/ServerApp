package com.example.android.androidclubserver;

public class Song_Creator {

    private String song_name;
    private String song_art,imageid;

    public Song_Creator(String regno, String mac, String uni) {

        song_name = regno;
        song_art = mac;
        imageid = uni;
    }

    public String get_Song_name() {
        return song_name;
    }

    public String get_Song_art() {
        return song_art;
    }

    public String get_Song_image() {
        return imageid;
    }

}
