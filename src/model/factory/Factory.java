package model.factory;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import model.classes.*;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dmitry on 25.04.17.
 */
public class Factory {

    private Map<String, CreateGrid> factoryCreatorMotorcycle;
    private Map<String, MotorcycleGrid> factoryCreatorGrid;
    private Map<String, CreateMoto> factoryCreateMotorcycle;
    private Map<String, EditMoto> factoryEditMotorcycle;

    private TextField model = new TextField();
    private TextField capacity = new TextField();
    private TextField year = new TextField();
    private TextField weight = new TextField();
    private TextField hp = new TextField();
    private TextField sound = new TextField();
    private TextField speedLimited = new TextField();
    private CheckBox flow = new CheckBox();
    private CheckBox bag = new CheckBox();


    public Factory()
    {
        factoryCreatorMotorcycle = new HashMap<String, CreateGrid>();
        factoryCreatorGrid = new HashMap<String, MotorcycleGrid>();
        factoryCreateMotorcycle = new HashMap<String, CreateMoto>();
        factoryEditMotorcycle = new HashMap<String, EditMoto>();

        factoryCreatorGrid.put("Motorcycle", new MotorcycleGrid() {
            @Override
            public GridPane getGridMotorcycle(Motorcycle motorcycle){

                GridPane gridPane = new GridPane();

                gridPane.add(new Label("Параметр"), 0, 0);
                gridPane.add(new Label("Свойство"), 1, 0);
                gridPane.add(new Label("Модель"), 0, 1);
                gridPane.add(new Label("Год выпуска"), 0, 2);
                gridPane.add(new Label("Объем"), 0, 3);
                gridPane.add(new Label(motorcycle.getName()), 1, 1);
                gridPane.add(new Label(String.valueOf(motorcycle.getYear())), 1, 2);
                gridPane.add(new Label(String.valueOf(motorcycle.getCapacity())), 1, 3);

                return gridPane;
            }
        });

        factoryCreatorGrid.put("Cruiser", new MotorcycleGrid() {
            @Override
            public GridPane getGridMotorcycle(Motorcycle motorcycle){

                Cruiser cruiser = (Cruiser) motorcycle;
                GridPane gridPane = new GridPane();

                gridPane.add(new Label("Параметр"), 0, 0);
                gridPane.add(new Label("Свойство"), 1, 0);
                gridPane.add(new Label("Модель"), 0, 1);
                gridPane.add(new Label("Год выпуска"), 0, 2);
                gridPane.add(new Label("Объем"), 0, 3);
                gridPane.add(new Label("Максимальная скорость"),0,4);
                gridPane.add(new Label("Сумки"), 0,5);
                gridPane.add(new Label(cruiser.getName()), 1, 1);
                gridPane.add(new Label(String.valueOf(cruiser.getYear())), 1, 2);
                gridPane.add(new Label(String.valueOf(cruiser.getCapacity())), 1, 3);
                gridPane.add(new Label(String.valueOf(cruiser.getSpeedLimited())), 1, 4);
                gridPane.add(new Label(String.valueOf(cruiser.getBags())),1,5);
                return gridPane;
            }
        });

        factoryCreatorGrid.put("Enduro", new MotorcycleGrid() {
            @Override
            public GridPane getGridMotorcycle(Motorcycle motorcycle){

                Enduro enduro = (Enduro) motorcycle;
                GridPane gridPane = new GridPane();

                gridPane.add(new Label("Параметр"), 0, 0);
                gridPane.add(new Label("Свойство"), 1, 0);
                gridPane.add(new Label("Модель"), 0, 1);
                gridPane.add(new Label("Год выпуска"), 0, 2);
                gridPane.add(new Label("Объем"), 0, 3);
                gridPane.add(new Label("HP"), 0, 4);
                gridPane.add(new Label("Звук"), 0,5);
                gridPane.add(new Label(enduro.getName()), 1, 1);
                gridPane.add(new Label(String.valueOf(enduro.getYear())), 1, 2);
                gridPane.add(new Label(String.valueOf(enduro.getCapacity())), 1, 3);
                gridPane.add(new Label(String.valueOf(enduro.getHp())),1,4);
                gridPane.add(new Label(enduro.getSound()),1,5);

                return gridPane;
            }
        });

        factoryCreatorGrid.put("OffRoad", new MotorcycleGrid() {
            @Override
            public GridPane getGridMotorcycle(Motorcycle motorcycle){

                OffRoad offRoad = (OffRoad) motorcycle;
                GridPane gridPane = new GridPane();

                gridPane.add(new Label("Параметр"), 0, 0);
                gridPane.add(new Label("Свойство"), 1, 0);
                gridPane.add(new Label("Модель"), 0, 1);
                gridPane.add(new Label("Год выпуска"), 0, 2);
                gridPane.add(new Label("Объем"), 0, 3);
                gridPane.add(new Label("HP"), 0,4);
                gridPane.add(new Label(offRoad.getName()), 1, 1);
                gridPane.add(new Label(String.valueOf(offRoad.getYear())), 1, 2);
                gridPane.add(new Label(String.valueOf(offRoad.getCapacity())), 1, 3);
                gridPane.add(new Label(String.valueOf(offRoad.getHp())),1,4);
                return gridPane;
            }
        });

        factoryCreatorGrid.put("Street", new MotorcycleGrid() {
            @Override
            public GridPane getGridMotorcycle(Motorcycle motorcycle){

                Street street = (Street) motorcycle;
                GridPane gridPane = new GridPane();

                gridPane.add(new Label("Параметр"), 0, 0);
                gridPane.add(new Label("Свойство"), 1, 0);
                gridPane.add(new Label("Модель"), 0, 1);
                gridPane.add(new Label("Год выпуска"), 0, 2);
                gridPane.add(new Label("Объем"), 0, 3);
                gridPane.add(new Label("Максимальная скорость"), 0,4);
                gridPane.add(new Label(street.getName()), 1, 1);
                gridPane.add(new Label(String.valueOf(street.getYear())), 1, 2);
                gridPane.add(new Label(String.valueOf(street.getCapacity())), 1, 3);
                gridPane.add(new Label(String.valueOf(street.getSpeedLimited())),1,4);
                return gridPane;
            }
        });


        factoryCreatorGrid.put("Sportbike", new MotorcycleGrid() {
            @Override
            public GridPane getGridMotorcycle(Motorcycle motorcycle){

                Sportbike sportbike = (Sportbike) motorcycle;
                GridPane gridPane = new GridPane();

                gridPane.add(new Label("Параметр"), 0, 0);
                gridPane.add(new Label("Свойство"), 1, 0);
                gridPane.add(new Label("Модель"), 0, 1);
                gridPane.add(new Label("Год выпуска"), 0, 2);
                gridPane.add(new Label("Объем"), 0, 3);
                gridPane.add(new Label("Вес"), 0,4);
                gridPane.add(new Label("Максимальная скорость"), 0,5);
                gridPane.add(new Label("Прямоток"), 0,6);
                gridPane.add(new Label(sportbike.getName()), 1, 1);
                gridPane.add(new Label(String.valueOf(sportbike.getYear())), 1, 2);
                gridPane.add(new Label(String.valueOf(sportbike.getCapacity())), 1, 3);
                gridPane.add(new Label(String.valueOf(sportbike.getWeight())), 1, 4);
                gridPane.add(new Label(String.valueOf(sportbike.getSpeedLimited())),1,5);
                gridPane.add(new Label(String.valueOf(sportbike.getFlow())), 1, 6);

                return gridPane;
            }
        });


        factoryCreatorMotorcycle.put("Motorcycle", new CreateGrid() {
            @Override
            public GridPane getGridPane() {

                GridPane gridPane = new GridPane();

                model.setText("");
                year.setText("");
                capacity.setText("");

                gridPane.add(new Label("Параметр"), 0, 0);
                gridPane.add(new Label("Свойство"), 1, 0);
                gridPane.add(new Label("Модель"), 0, 1);
                gridPane.add(new Label("Год выпуска"), 0, 2);
                gridPane.add(new Label("Объем"), 0, 3);

                gridPane.add(model, 1,1);
                gridPane.add(year, 1, 2);
                gridPane.add(capacity, 1, 3);


                return gridPane;
            }
        });

        factoryCreatorMotorcycle.put("Cruiser", new CreateGrid() {
            @Override
            public GridPane getGridPane() {

                GridPane gridPane = new GridPane();

                model.setText("");
                year.setText("");
                capacity.setText("");
                speedLimited.setText("");
                bag.setSelected(false);

                gridPane.add(new Label("Параметр"), 0, 0);
                gridPane.add(new Label("Свойство"), 1, 0);
                gridPane.add(new Label("Модель"), 0, 1);
                gridPane.add(new Label("Год выпуска"), 0, 2);
                gridPane.add(new Label("Объем"), 0, 3);
                gridPane.add(new Label("Максимальная скорость"), 0,4);
                gridPane.add(new Label("Сумки"), 0, 5);

                gridPane.add(model, 1,1);
                gridPane.add(year, 1, 2);
                gridPane.add(capacity, 1, 3);
                gridPane.add(speedLimited, 1,4);
                gridPane.add(bag,1,5);


                return gridPane;
            }
        });

        factoryCreatorMotorcycle.put("Enduro", new CreateGrid() {
            @Override
            public GridPane getGridPane() {

                GridPane gridPane = new GridPane();

                model.setText("");
                year.setText("");
                capacity.setText("");
                sound.setText("");
                hp.setText("");

                gridPane.add(new Label("Параметр"), 0, 0);
                gridPane.add(new Label("Свойство"), 1, 0);
                gridPane.add(new Label("Модель"), 0, 1);
                gridPane.add(new Label("Год выпуска"), 0, 2);
                gridPane.add(new Label("Объем"), 0, 3);
                gridPane.add(new Label("HP"),0,4);
                gridPane.add(new Label("Звук"), 0, 5);

                gridPane.add(model, 1,1);
                gridPane.add(year, 1, 2);
                gridPane.add(capacity, 1, 3);
                gridPane.add(sound,1,5);
                gridPane.add(hp,1,4);

                return gridPane;
            }
        });

        factoryCreatorMotorcycle.put("OffRoad", new CreateGrid() {
            @Override
            public GridPane getGridPane() {

                GridPane gridPane = new GridPane();

                model.setText("");
                year.setText("");
                capacity.setText("");
                hp.setText("");

                gridPane.add(new Label("Параметр"), 0, 0);
                gridPane.add(new Label("Свойство"), 1, 0);
                gridPane.add(new Label("Модель"), 0, 1);
                gridPane.add(new Label("Год выпуска"), 0, 2);
                gridPane.add(new Label("Объем"), 0, 3);
                gridPane.add(new Label("HP"), 0, 4);

                gridPane.add(model, 1,1);
                gridPane.add(year, 1, 2);
                gridPane.add(capacity, 1, 3);
                gridPane.add(hp,1,4);

                return gridPane;
            }
        });

        factoryCreatorMotorcycle.put("Street", new CreateGrid() {
            @Override
            public GridPane getGridPane() {

                GridPane gridPane = new GridPane();

                model.setText("");
                year.setText("");
                capacity.setText("");
                speedLimited.setText("");

                gridPane.add(new Label("Параметр"), 0, 0);
                gridPane.add(new Label("Свойство"), 1, 0);
                gridPane.add(new Label("Модель"), 0, 1);
                gridPane.add(new Label("Год выпуска"), 0, 2);
                gridPane.add(new Label("Объем"), 0, 3);
                gridPane.add(new Label("Максимальная скорость"), 0, 4);

                gridPane.add(model, 1,1);
                gridPane.add(year, 1, 2);
                gridPane.add(capacity, 1, 3);
                gridPane.add(speedLimited,1,4);

                return gridPane;
            }
        });


        factoryCreatorMotorcycle.put("Sportbike", new CreateGrid() {
            @Override
            public GridPane getGridPane() {

                GridPane gridPane = new GridPane();

                model.setText("");
                year.setText("");
                capacity.setText("");
                weight.setText("");
                speedLimited.setText("");
                flow.setSelected(false);

                gridPane.add(new Label("Параметр"), 0, 0);
                gridPane.add(new Label("Свойство"), 1, 0);
                gridPane.add(new Label("Модель"), 0, 1);
                gridPane.add(new Label("Год выпуска"), 0, 2);
                gridPane.add(new Label("Объем"), 0, 3);
                gridPane.add(new Label("Вес"), 0,4);
                gridPane.add(new Label("Максимальная скорость"),0,5);
                gridPane.add(new Label("Прямоток"), 0,6);

                gridPane.add(model, 1,1);
                gridPane.add(year, 1, 2);
                gridPane.add(capacity, 1, 3);
                gridPane.add(weight, 1,4);
                gridPane.add(speedLimited,1,5);
                gridPane.add(flow, 1, 6);


                return gridPane;
            }
        });

        factoryCreateMotorcycle.put("Motorcycle", new CreateMoto(){

            @Override
            public Motorcycle getMotorcycle(GridPane gridPane) {

                Motorcycle motorcycle = new Motorcycle();
                motorcycle.setClassModel("Motorcycle");
                motorcycle.setName(model.getText());
                motorcycle.setYear(Integer.valueOf(year.getText()));
                motorcycle.setCapacity(Double.valueOf(capacity.getText()));
                return motorcycle;
            }
        });

        factoryCreateMotorcycle.put("Cruiser", new CreateMoto(){

            @Override
            public Motorcycle getMotorcycle(GridPane gridPane) {

                Cruiser cruiser = new Cruiser();
                cruiser.setClassModel("Cruiser");
                cruiser.setName(model.getText());
                cruiser.setYear(Integer.valueOf(year.getText()));
                cruiser.setCapacity(Double.valueOf(capacity.getText()));
                cruiser.setSpeedLimited(Integer.valueOf(speedLimited.getText()));
                cruiser.setBags(bag.isSelected());
                return cruiser;
            }
        });

        factoryCreateMotorcycle.put("Enduro", new CreateMoto(){

            @Override
            public Motorcycle getMotorcycle(GridPane gridPane) {

                Enduro enduro = new Enduro();
                enduro.setClassModel("Enduro");
                enduro.setName(model.getText());
                enduro.setYear(Integer.valueOf(year.getText()));
                enduro.setCapacity(Double.valueOf(capacity.getText()));
                enduro.setHp(Integer.valueOf(hp.getText()));
                enduro.setSound(sound.getText());
                return enduro;
            }
        });

        factoryCreateMotorcycle.put("Sportbike", new CreateMoto(){

            @Override
            public Motorcycle getMotorcycle(GridPane gridPane) {

                Sportbike sportbike = new Sportbike();
                sportbike.setClassModel("Sportbike");
                sportbike.setName(model.getText());
                sportbike.setYear(Integer.valueOf(year.getText()));
                sportbike.setCapacity(Double.valueOf(capacity.getText()));
                sportbike.setWeight(Integer.valueOf(weight.getText()));
                sportbike.setSpeedLimited(Integer.valueOf(speedLimited.getText()));
                sportbike.setFlow(flow.isSelected());
                return sportbike;
            }
        });

        factoryCreateMotorcycle.put("Street", new CreateMoto(){

            @Override
            public Motorcycle getMotorcycle(GridPane gridPane) {

                Street street = new Street();
                street.setClassModel("Street");
                street.setName(model.getText());
                street.setYear(Integer.valueOf(year.getText()));
                street.setCapacity(Double.valueOf(capacity.getText()));
                street.setSpeedLimited(Integer.valueOf(speedLimited.getText()));

                return street;
            }
        });

        factoryCreateMotorcycle.put("OffRoad", new CreateMoto(){

            @Override
            public Motorcycle getMotorcycle(GridPane gridPane) {

                OffRoad offRoad = new OffRoad();
                offRoad.setClassModel("OffRoad");
                offRoad.setName(model.getText());
                offRoad.setYear(Integer.valueOf(year.getText()));
                offRoad.setCapacity(Double.valueOf(capacity.getText()));
                offRoad.setHp(Integer.valueOf(hp.getText()));

                return offRoad;
            }
        });

        factoryEditMotorcycle.put("Motorcycle", new EditMoto() {
            @Override
            public GridPane getEditMoto(Motorcycle motorcycle) {
                GridPane gridPane = new GridPane();

                gridPane.add(new Label("Параметр"), 0, 0);
                gridPane.add(new Label("Свойство"), 1, 0);
                gridPane.add(new Label("Модель"), 0, 1);
                gridPane.add(new Label("Год выпуска"), 0, 2);
                gridPane.add(new Label("Объем"), 0, 3);
                gridPane.add(new Label("Вес"), 0,4);
                gridPane.add(new Label("Максимальная скорость"),0,5);
                gridPane.add(new Label("Прямоток"), 0,6);

                model.setText(motorcycle.getName());
                year.setText(String.valueOf(motorcycle.getYear()));
                capacity.setText(String.valueOf(motorcycle.getCapacity()));


                gridPane.add(model, 1,1);
                gridPane.add(year, 1, 2);
                gridPane.add(capacity, 1, 3);

                return gridPane;
            }
        });

        factoryEditMotorcycle.put("Cruiser", new EditMoto() {
            @Override
            public GridPane getEditMoto(Motorcycle motorcycle) {
                GridPane gridPane = new GridPane();
                Cruiser cruiser = (Cruiser) motorcycle;
                gridPane.add(new Label("Параметр"), 0, 0);
                gridPane.add(new Label("Свойство"), 1, 0);
                gridPane.add(new Label("Модель"), 0, 1);
                gridPane.add(new Label("Год выпуска"), 0, 2);
                gridPane.add(new Label("Объем"), 0, 3);
                gridPane.add(new Label("Сумки"), 0,5);
                gridPane.add(new Label("Максимальная скорость"),0,4);

                model.setText(cruiser.getName());
                year.setText(String.valueOf(cruiser.getYear()));
                capacity.setText(String.valueOf(cruiser.getCapacity()));
                speedLimited.setText(String.valueOf(cruiser.getSpeedLimited()));
                flow.setSelected(cruiser.getBags());

                gridPane.add(model, 1,1);
                gridPane.add(year, 1, 2);
                gridPane.add(capacity, 1, 3);

                gridPane.add(speedLimited,1,4);
                gridPane.add(bag, 1, 5);

                return gridPane;
            }
        });

        factoryEditMotorcycle.put("Enduro", new EditMoto() {
            @Override
            public GridPane getEditMoto(Motorcycle motorcycle) {
                GridPane gridPane = new GridPane();
                Enduro enduro = (Enduro) motorcycle;
                gridPane.add(new Label("Параметр"), 0, 0);
                gridPane.add(new Label("Свойство"), 1, 0);
                gridPane.add(new Label("Модель"), 0, 1);
                gridPane.add(new Label("Год выпуска"), 0, 2);
                gridPane.add(new Label("Объем"), 0, 3);
                gridPane.add(new Label("HP"), 0,4);
                gridPane.add(new Label("Звук"),0,5);

                model.setText(enduro.getName());
                year.setText(String.valueOf(enduro.getYear()));
                capacity.setText(String.valueOf(enduro.getCapacity()));
                hp.setText(String.valueOf(enduro.getHp()));
                sound.setText(enduro.getSound());

                gridPane.add(model, 1,1);
                gridPane.add(year, 1, 2);
                gridPane.add(capacity, 1, 3);
                gridPane.add(hp, 1,4);
                gridPane.add(sound,1,5);

                return gridPane;
            }
        });

        factoryEditMotorcycle.put("OffRoad", new EditMoto() {
            @Override
            public GridPane getEditMoto(Motorcycle motorcycle) {
                GridPane gridPane = new GridPane();
                OffRoad offRoad = (OffRoad) motorcycle;
                gridPane.add(new Label("Параметр"), 0, 0);
                gridPane.add(new Label("Свойство"), 1, 0);
                gridPane.add(new Label("Модель"), 0, 1);
                gridPane.add(new Label("Год выпуска"), 0, 2);
                gridPane.add(new Label("Объем"), 0, 3);
                gridPane.add(new Label("HP"), 0,4);


                model.setText(offRoad.getName());
                year.setText(String.valueOf(offRoad.getYear()));
                capacity.setText(String.valueOf(offRoad.getCapacity()));
                hp.setText(String.valueOf(offRoad.getHp()));

                gridPane.add(model, 1,1);
                gridPane.add(year, 1, 2);
                gridPane.add(capacity, 1, 3);
                gridPane.add(hp,1,4);

                return gridPane;
            }
        });

        factoryEditMotorcycle.put("Street", new EditMoto() {
            @Override
            public GridPane getEditMoto(Motorcycle motorcycle) {
                GridPane gridPane = new GridPane();
                Street street = (Street) motorcycle;
                gridPane.add(new Label("Параметр"), 0, 0);
                gridPane.add(new Label("Свойство"), 1, 0);
                gridPane.add(new Label("Модель"), 0, 1);
                gridPane.add(new Label("Год выпуска"), 0, 2);
                gridPane.add(new Label("Объем"), 0, 3);
                gridPane.add(new Label("Максимальная скорость"),0,4);


                model.setText(street.getName());
                year.setText(String.valueOf(street.getYear()));
                capacity.setText(String.valueOf(street.getCapacity()));
                speedLimited.setText(String.valueOf(street.getSpeedLimited()));


                gridPane.add(model, 1,1);
                gridPane.add(year, 1, 2);
                gridPane.add(capacity, 1, 3);
                gridPane.add(speedLimited,1,4);


                return gridPane;
            }
        });

        factoryEditMotorcycle.put("Sportbike", new EditMoto() {
            @Override
            public GridPane getEditMoto(Motorcycle motorcycle) {
                GridPane gridPane = new GridPane();
                Sportbike sportbike = (Sportbike)motorcycle;
                gridPane.add(new Label("Параметр"), 0, 0);
                gridPane.add(new Label("Свойство"), 1, 0);
                gridPane.add(new Label("Модель"), 0, 1);
                gridPane.add(new Label("Год выпуска"), 0, 2);
                gridPane.add(new Label("Объем"), 0, 3);
                gridPane.add(new Label("Вес"), 0,4);
                gridPane.add(new Label("Максимальная скорость"),0,5);
                gridPane.add(new Label("Прямоток"), 0,6);

                model.setText(sportbike.getName());
                year.setText(String.valueOf(sportbike.getYear()));
                capacity.setText(String.valueOf(sportbike.getCapacity()));
                weight.setText(String.valueOf(sportbike.getWeight()));
                speedLimited.setText(String.valueOf(sportbike.getSpeedLimited()));
                flow.setSelected(sportbike.getFlow());

                gridPane.add(model, 1,1);
                gridPane.add(year, 1, 2);
                gridPane.add(capacity, 1, 3);
                gridPane.add(weight, 1,4);
                gridPane.add(speedLimited,1,5);
                gridPane.add(flow, 1, 6);

                return gridPane;
            }
        });

    }

    public GridPane getCreatorGrid(String id, Motorcycle motorcycle)
    {
        return factoryCreatorGrid.get(id).getGridMotorcycle(motorcycle);
    }

    public GridPane getCreatorMotorcycle(String id){
        return factoryCreatorMotorcycle.get(id).getGridPane();
    }

    public Motorcycle getCreateMoto(String id, GridPane gridPane){
        return factoryCreateMotorcycle.get(id).getMotorcycle(gridPane);
    }

    public GridPane getEditMoto(String id, Motorcycle motorcycle){
        return factoryEditMotorcycle.get(id).getEditMoto(motorcycle);
    }

    public Map<String, CreateGrid> getFactoryCreatorMotorcycle(){
        return factoryCreatorMotorcycle;
    }

}
