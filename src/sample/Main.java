package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        GridPane root = new GridPane();
//        root.setAlignment(Pos.CENTER);
//        root.setVgap(10);
//        root.setHgap(10);
//
//        Label greeting = new Label("Welcome to Halloween!");
//        greeting.setTextFill(Color.DARKORANGE);
//        greeting.setFont(Font.font("Times New Roman", FontWeight.BOLD, 60));
//        root.getChildren().add(greeting);
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("It's almost Halloween!");
        primaryStage.setScene(new Scene(root, 500, 275));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
