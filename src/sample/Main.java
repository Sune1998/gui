package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.FileInputStream;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hej");

        FileInputStream input = new FileInputStream("/home/sune/Desktop/hejr.png");
        Image image  = new Image(input);
        ImageView imageView = new ImageView(image);

        TextField textField = new TextField();

        Button button = new Button("meme" , imageView);

        button.setWrapText(true);

        button.setOnAction(action -> {
            System.out.println(textField.getText());
        });
        HBox box = new HBox(textField, button);
        box.getChildren().addAll();

        Scene scene = new Scene(box, 1000 , 1000);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
