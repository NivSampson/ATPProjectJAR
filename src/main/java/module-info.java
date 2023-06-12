module com.example.atpprojectjar {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.atpprojectjar to javafx.fxml;
    exports com.example.atpprojectjar;
}