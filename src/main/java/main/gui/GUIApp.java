package main.gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class GUIApp extends Application {

    Button talk;
    TextArea field;

    public static void main(String[] args) {
        launch(args);
    }

    public void buttonAction(){

    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Talk2Me");

        talk = new Button();
        talk.setText("Speak MotherFucker");
        talk.setPrefWidth(200);
        field = new TextArea();
        field.setPrefSize(400,300);

        VBox pane = new VBox();
        pane.setPadding(new Insets(50,50,50,50));
        pane.setSpacing(20);
        pane.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(field, talk);

        Scene scene = new Scene(pane, 500, 450);
        stage.setScene(scene);
        stage.show();
    }
}

