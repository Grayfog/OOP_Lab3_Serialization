import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import model.Sportbike;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.undercouch.bson4jackson.BsonFactory;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view/frame.fxml"));
        Scene scene = new Scene(root, root.getLayoutX(), root.getLayoutY());
        primaryStage.setTitle("");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /*public static void main(String[] args) {
	// write your code here

        launch(args);


        Sportbike honda = new Sportbike("CBR 600RR", 2015, 999.9);
        honda.setWeight(180);

        //serialize data
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectMapper mapper = new ObjectMapper(new BsonFactory());
        try {
            mapper.writeValue(baos, honda);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //deserialize data
        Sportbike clone_of_honda;
        try (ByteArrayInputStream bais = new ByteArrayInputStream(
                baos.toByteArray())) {
            clone_of_honda = mapper.readValue(bais, Sportbike.class);
        }

        assert honda.getWeight() == clone_of_honda.getWeight();

        System.out.print(honda.getWeight());



    }*/
}
