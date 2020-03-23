package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
				Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("Login.fxml"));
		        primaryStage.setTitle("UCF IREC SEDS/AIAA Telemetry");
		        primaryStage.setScene(new Scene(root, 865, 448));
		        primaryStage.centerOnScreen();
		        primaryStage.show();
		        
	
		        	    
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	

	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void whatsup() {
		System.out.println("SUp");
	}
		
	
}


