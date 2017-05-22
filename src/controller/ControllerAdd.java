package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.classes.Motorcycle;
import model.factory.Factory;


/**
 * Created by dmitry on 06.05.17.
 */
public class ControllerAdd {

    private ObservableList<String> motoClass = FXCollections.observableArrayList();

    @FXML
    private ComboBox<String> comboBoxMotoClass;
    @FXML
    private BorderPane border;

    private GridPane gridPane;

    public void initialize(){
        motoClass.add("Motorcycle");
        motoClass.add("Sportbike");
        motoClass.add("Enduro");
        motoClass.add("OffRoad");
        motoClass.add("Street");
        motoClass.add("Cruiser");
        motoClass.sorted();
        comboBoxMotoClass.setItems(motoClass);

        comboBoxMotoClass.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> showAddGrid(newValue));

    }

    public void showAddGrid(String id){
        gridPane = Controller.getInstance().factory.getCreatorMotorcycle(id);
        border.setCenter(gridPane);
    }

    public void onClickAdd(ActionEvent actionEvent) {

        Controller.getInstance().motorcycles.add(Controller.getInstance().factory.getCreateMoto(comboBoxMotoClass.getSelectionModel().getSelectedItem(), gridPane));
        //Controller.getInstance().comboBoxClass.getItems().add(Controller.getInstance().motorcycles.get(Controller.getInstance().motorcycles.size() - 1));
    }



}
