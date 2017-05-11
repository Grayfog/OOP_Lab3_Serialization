package model.factory;

import javafx.scene.layout.GridPane;
import model.classes.Motorcycle;


/**
 * Created by dmitry on 06.05.17.
 */
public interface CreateMoto {
    Motorcycle getMotorcycle(GridPane gridPane);
}
