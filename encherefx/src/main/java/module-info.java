module fr.lsarazin.encherev2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.lsarazin.encherev2 to javafx.fxml;
    exports fr.lsarazin.encherev2;
}