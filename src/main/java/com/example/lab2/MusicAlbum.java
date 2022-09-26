package com.example.lab2;

import java.time.LocalDate;
import java.time.Period;


public class MusicAlbum {
    private String albumName, artist;
    private LocalDate date;

    public MusicAlbum(String albumName, String artist, LocalDate date) {
        setAlbumName(albumName);
        setArtist(artist);
        setDate(date);
    }

    public String getAlbumName() {
        return albumName;
    }

    /**
     * This method assumes artist names only contain letters or spaces
     * @param albumName
     */
    public void setAlbumName(String albumName) {
        if (albumName.matches("[a-zA-Z\\s]*"))
            this.albumName = albumName;
        else
            throw new IllegalArgumentException("Album name must only contain letters or spaces");
    }

    public String getArtist() {

        return artist;
    }

    public void setArtist(String artist) {
        if (artist.matches("[a-zA-Z\\s]*"))
            this.artist = artist;
        else
            throw new IllegalArgumentException("Artist must only contain letters or spaces");
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        if (date.isAfter(LocalDate.now()))
            throw new IllegalArgumentException("date can not be in the future and is showing release year");
        else
            this.date = date;
    }

    public String toString()
    {
        return String.format("albumName: %s, artist: %s , date: %d years",albumName, artist, Period.between(date,LocalDate.now()).getYears());
    }
}

