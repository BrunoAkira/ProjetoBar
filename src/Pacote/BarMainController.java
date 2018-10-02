
package Pacote;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class BarMainController {

    @FXML
    private VBox Tela;
	
    @FXML
    private Button btnVenda;

    @FXML
    private Button btnEstoque;  
    
    @FXML
    protected void handleAbrirTelaVenda(ActionEvent Event) {
		Stage VendaStage = new Stage();
		BorderPane rootVenda; 	
		try {
			//carrega o arquivo FXML com a definição da tela
			rootVenda = (BorderPane)FXMLLoader.load(getClass().getResource("BarVenda.fxml"));
			 
			 //define a cena principal
			 Scene sceneVenda = new Scene(rootVenda, 475, 310);
			 
			 //Carrega o arquivo CSS
			 sceneVenda.getStylesheets().add(getClass().getResource("BarVenda.css").toExternalForm());
			 
			 VendaStage.setTitle("Bar Venda");
			 
			 //Carrega e mostra a tela
			 VendaStage.setScene(sceneVenda);
			 VendaStage.show();
			 
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    @FXML
    protected void handleAbrirTelaEstoque(ActionEvent Event) {
		
		Stage EstoqueStage = new Stage();
		BorderPane rootEstoque; 	
		try {
			//carrega o arquivo FXML com a definição da tela
			rootEstoque = (BorderPane)FXMLLoader.load(getClass().getResource("BarEstoque.fxml"));
			 
			 //define a cena principal
			 Scene sceneEstoque = new Scene(rootEstoque, 600, 400);
			 
			 //Carrega o arquivo CSS
			 sceneEstoque.getStylesheets().add(getClass().getResource("BarEstoque.css").toExternalForm());
			 
			 EstoqueStage.setTitle("Bar Estoque");
			 
			 //Carrega e mostra a tela
			 EstoqueStage.setScene(sceneEstoque);
			 EstoqueStage.show();
			 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	} 
}
