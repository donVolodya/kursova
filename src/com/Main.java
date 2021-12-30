package com.company;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.sun.javafx.logging.Logger;

import java.io.IOException;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MainLayout.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 770, 460);
        stage.setTitle("CoffeeShop");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop(){
    }
}