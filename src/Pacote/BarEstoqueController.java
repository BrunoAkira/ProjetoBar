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

public class BarEstoqueController {

    @FXML
    private TableColumn<?, ?> clmQuantidade;

    @FXML
    private Button btnConsultarPreco;

    @FXML
    private ComboBox<?> cbFiltro;

    @FXML
    private Button btnExcluirLote;

    @FXML
    private TableColumn<?, ?> clmTotal;

    @FXML
    private Button btnAdicionarLote;

    @FXML
    private Button btnPesquisar;

    @FXML
    private TableColumn<?, ?> clmDescricao;

    @FXML
    private Button btnSalvar;

    @FXML
    private TableView<?> tabelaEstoque;

    @FXML
    private TableColumn<?, ?> clmFonecedor;

    @FXML
    private TextField txtPesquisar;

    @FXML
    private TableColumn<?, ?> clmProduto;

    @FXML
    private TableColumn<?, ?> clmValidade;

    @FXML
    private TableColumn<?, ?> clmData;

    @FXML
    void handleSalvarAlteracoes(ActionEvent event) {

    }

    @FXML
    void handleAdicionarLote(ActionEvent event) {

    }

    @FXML
    void handleExcluirLote(ActionEvent event) {

    }

    @FXML
    void handlePesquisarProduto(ActionEvent event) {

    }
    
    @FXML
    void handleAbrirTelaPreco(ActionEvent event) {
    	
		Stage ProdutoStage = new Stage();
		BorderPane rootProduto; 	
		try {
			//carrega o arquivo FXML com a definição da tela
			rootProduto = (BorderPane)FXMLLoader.load(getClass().getResource("BarProduto.fxml"));
			 
			 //define a cena principal
			 Scene sceneProduto = new Scene(rootProduto, 300, 400);
			 
			 //Carrega o arquivo CSS
			 sceneProduto.getStylesheets().add(getClass().getResource("BarProduto.css").toExternalForm());
			 
			 ProdutoStage.setTitle("Bar Produtos");
			 
			 //Carrega e mostra a tela
			 ProdutoStage.setScene(sceneProduto);
			 ProdutoStage.show();
			 
		} catch (IOException e) {
			e.printStackTrace();
		}		
    }

}
