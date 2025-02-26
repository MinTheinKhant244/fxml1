package application;
	
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			// registration.fxml   >   527, 520
			FXMLLoader loader = new FXMLLoader();
			URL xmlUrl = getClass().getResource("registration.fxml");
			loader.setLocation(xmlUrl);
			Parent root = loader.load();
			
			Scene scene = new Scene(root,527,520);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
