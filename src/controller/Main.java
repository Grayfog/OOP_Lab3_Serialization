package controller;

import controller.Plugins.PluginEngine;
import controller.Plugins.PluginLoader;
import javafx.application.Application;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.File;


public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("/view/frame.fxml"));
        Scene scene = new Scene(root, 600, 400);

        PluginEngine pluginEngine = new PluginEngine();
        PluginLoader loader = new PluginLoader("plugins" , ClassLoader.getSystemClassLoader());
        pluginEngine.initialize(loader);
        Controller.getInstance().setPrimaryStage(primaryStage);



        primaryStage.setTitle("Lab3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {

        launch(args);

    }

}
