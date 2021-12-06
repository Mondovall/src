module main.gui {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires eu.hansolo.tilesfx;

    opens main.gui to javafx.fxml;
    exports main.gui;
}