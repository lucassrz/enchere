package fr.lsarazin.encherev2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    public void initialize() {
        int nbEnchere = 3;
        int count = 0;

        Lot[] allLot = new Lot[nbEnchere];

        allLot[0] = new Lot("iPhone 15 Pro Max 512Go Titane Naturel", 1250, 340, "Lucas");
        allLot[1] = new Lot("Tesla Model X 34000Km", 35600, 2300, "Elon Musk");
        allLot[2] = new Lot("Golf 6 GTI 90000Km", 13400, 1145, "Jacky");
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Bienvenue au enchères!");
    }
}