package Pacote;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class BarProdutoController {

    @FXML
    private Button btnSalvar;
    
    @FXML
    private TableColumn<?, ?> clmQuantidade;

    @FXML
    private TableColumn<?, ?> clmProduto;

    @FXML
    private TableColumn<?, ?> clmPreco;

    @FXML
    private TableView<?> tabelaProduto;
    
    @FXML
    protected void handleSalvarAlteracoes(ActionEvent Event) {
    	
    }
    
}
