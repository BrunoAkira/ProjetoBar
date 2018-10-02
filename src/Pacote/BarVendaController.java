package Pacote;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BarVendaController {

    @FXML
    private TextField txtData;

    @FXML
    private ComboBox<?> cbListaProduto;

    @FXML
    private Button btnExcluirProduto;

    @FXML
    private Button btnConsultaVenda;

    @FXML
    private TextField txtComanda;

    @FXML
    private TableColumn<?, ?> clmQtd;

    @FXML
    private Button btnRegistrarVenda;

    @FXML
    private TextField txtTotal;

    @FXML
    private TextField txtQtd;

    @FXML
    private TableColumn<?, ?> clmProduto;

    @FXML
    private TableColumn<?, ?> clmPreco;

    @FXML
    private TableView<?> tabelaItens;

    @FXML
    private Button btnAddProduto;

    @FXML
    void handleAddProduto(ActionEvent event) {

    }

    @FXML
    void handleRegistrarVenda(ActionEvent event) {

    }

    @FXML
    void handleExcluirProduto(ActionEvent event) {

    }

    
    @FXML
    protected void handleAbrirTelaConsultaVenda(ActionEvent Event) {
    	
		Stage HistoricoStage = new Stage();
		BorderPane rootHistorico; 	
		try {
			//carrega o arquivo FXML com a definição da tela
			rootHistorico = (BorderPane)FXMLLoader.load(getClass().getResource("BarHistorico.fxml"));
			 
			 //define a cena principal
			 Scene sceneHistorico = new Scene(rootHistorico, 430, 400);
			 
			 //Carrega o arquivo CSS
			 sceneHistorico.getStylesheets().add(getClass().getResource("BarHistorico.css").toExternalForm());
			 
			 HistoricoStage.setTitle("Bar Historico");
			 
			 //Carrega e mostra a tela
			 HistoricoStage.setScene(sceneHistorico);
			 HistoricoStage.show();
			 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
    }
}