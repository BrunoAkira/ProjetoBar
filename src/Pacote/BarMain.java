package Pacote;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BarMain  extends Application{
		
	@Override 
	public void start(Stage PrimaryStage) {
		
	BorderPane root; 
		
		try {
			//carrega o arquivo FXML com a definição da tela
			 root = (BorderPane)FXMLLoader.load(getClass().getResource("BarMain.fxml"));
			 
			 //define a cena principal
			 Scene scene = new Scene(root, 160, 200);
			 
			 //Carrega o arquivo CSS
			 scene.getStylesheets().add(getClass().getResource("BarMain.css").toExternalForm());
			 
			 PrimaryStage.setTitle("Bar Menu Inicial");
			 
			 //Carrega e mostra a tela
			 PrimaryStage.setScene(scene);
			 PrimaryStage.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
		
	public static void main(String[] args) {
		launch(args);
	}
}

