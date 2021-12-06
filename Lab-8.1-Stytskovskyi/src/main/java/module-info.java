module com.mycompany.lab.stytskovskyi {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.lab.stytskovskyi to javafx.fxml;
    exports com.mycompany.lab.stytskovskyi;
}
