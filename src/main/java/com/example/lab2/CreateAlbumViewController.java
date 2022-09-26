package com.example.lab2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class CreateAlbumViewController {

    @FXML
    private ComboBox<MusicAlbum> artistComboBox;

    @FXML
    private TextField nameTextField;

    @FXML
    private Spinner<Integer> yearSpinner;


    @FXML
    void createAlbum(ActionEvent event) {
        MusicAlbum MusicAlbum1 = new MusicAlbum(" Buzz  "," Arshad  ", LocalDate.of( 2018,3,5  ));
        MusicAlbum MusicAlbum2 = new MusicAlbum("Airlift","Arijit", LocalDate.of(2017,4,5));

        artistComboBox.getItems().add(MusicAlbum1);
        artistComboBox.getItems().add(MusicAlbum2);


    }


    public void createalbum(ActionEvent actionEvent) {
    }
}
