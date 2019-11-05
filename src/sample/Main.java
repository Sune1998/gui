package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;




public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hej");

        TextField textField = new TextField();

        Button button = new Button("click to get text");

        button.setOnAction(action -> {
            System.out.println(textField.getText());
        });
        HBox box = new HBox(textField, button);
        box.getChildren().addAll();

        Scene scene = new Scene(box, 400 , 200);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
