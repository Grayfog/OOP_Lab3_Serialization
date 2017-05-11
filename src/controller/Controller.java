package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import model.classes.Motorcycle;

import java.io.*;

import model.factory.Factory;



/**
 * Created by dmitry on 25.04.17.
 */
public class Controller {

    private static Controller instance;

    private Stage primaryStage;

    public Factory factory = new Factory();


    public ObservableList<Motorcycle> motorcycles = FXCollections.observableArrayList();
    private SerializationOfList<Motorcycle> serializator = new SerializationOfList<>();


    @FXML
    public ComboBox<Motorcycle> comboBoxClass;

    @FXML
    private BorderPane border;


    public void setPrimaryStage(Stage primaryStage){
        this.primaryStage = primaryStage;
    }


    private static void setInstance(Controller instance){
        Controller.instance = instance;
    }

    public static Controller getInstance(){
        return instance;
    }

    @FXML
    public void initialize(){
        setInstance(this);

        comboBoxClass.getSelectionModel().selectedItemProperty().addListener(((observable, oldValue, newValue) -> showParametrs(newValue)));

    }

    @FXML
    public void clickOpenFile(ActionEvent actionEvent) throws IOException, ClassNotFoundException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Document");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Binary files (*.bin)", "*.bin"));

        File file = fileChooser.showOpenDialog(primaryStage);

        if (file != null) {

            serializator.LoadFromFile(motorcycles, file);

            comboBoxClass.setItems(motorcycles);


        }

    }

    @FXML
    public void clickSaveFile(ActionEvent actionEvent) throws IOException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save Document");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Binary files (*.bin)", "*.bin"));

        File file = fileChooser.showSaveDialog(primaryStage);


        if (file != null)
        {

            file.createNewFile();
            serializator.SaveToFileList(motorcycles, file);


        }
    }

    public void clickAdd(ActionEvent actionEvent) throws IOException {
        Stage addStage = new Stage();
        Parent rootAdd = FXMLLoader.load(getClass().getResource("/view/addFrame.fxml"));
        Scene sceneAdd = new Scene(rootAdd, 300, 300);
        addStage.setTitle("Add");
        addStage.setScene(sceneAdd);
        addStage.show();
    }

    public void showParametrs(Motorcycle motorcycle) {

        if (motorcycle != null)
        {
            GridPane gridPane = factory.getCreatorGrid(motorcycle.getClassModel(), motorcycle);
            border.setCenter(gridPane);

        }

    }

    public void clickEdit(ActionEvent actionEvent) {

        final Motorcycle[] motorcycle = {motorcycles.remove(comboBoxClass.getSelectionModel().getSelectedIndex())};

        Button save = new Button("Save");

        GridPane gridPane = factory.getEditMoto(motorcycle[0].getClassModel(), motorcycle[0]);
        gridPane.add(save, 0, 10);
        border.setCenter(gridPane);

        save.setOnMouseClicked(event -> {
            motorcycle[0] = factory.getCreateMoto(motorcycle[0].getClassModel(),gridPane);
            motorcycles.add(motorcycle[0]);
            comboBoxClass.getItems().add(comboBoxClass.getSelectionModel().getSelectedIndex(), motorcycle[0]);
            comboBoxClass.getItems().remove(motorcycle[0]);
            showParametrs(motorcycle[0]);

        });
    }

    public void clickDelete(ActionEvent actionEvent) {
        Motorcycle motorcycle = comboBoxClass.getSelectionModel().getSelectedItem();
        motorcycles.remove(motorcycle);
        border.setCenter(null);
    }
}
