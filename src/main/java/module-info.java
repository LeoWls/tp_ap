module com.tpleo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.tpleo to javafx.fxml;

    exports com.tpleo;
}
