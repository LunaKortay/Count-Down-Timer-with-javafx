package com.kortay.testclass;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        try {
            String javaversion = System.getProperty("java.version");
            String javafxversion = System.getProperty("javafx.version");

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/mainScene.fxml"));

            Parent root = loader.load();

            Controller controller = loader.getController();
            controller.labelfirst.setText("Hello World " + javafxversion + " " + javaversion);
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch();
    }
}