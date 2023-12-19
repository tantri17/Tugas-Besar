module com.example.kalkulator {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.logging;


    opens com.example.kalkulator to javafx.fxml;
    exports com.example.kalkulator;
    exports konversibilangannn;
    opens konversibilangannn to javafx.fxml;
}