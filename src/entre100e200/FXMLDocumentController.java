package entre100e200;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController {
Integer valor, result;

    @FXML
    private Button button;

    @FXML
    private TextField cxnum;

    @FXML
    private Label label;

    @FXML
    private TextField cxresult;

    @FXML
    void verificar(ActionEvent event) {
        valor=Integer.valueOf(cxnum.getText());
        cxresult.setText(verificaValor(result));
        
    }

    private String verificaValor(Integer result) {
    String resultado;
        
        if (valor > 100 & valor < 200)
            resultado="Está entre 100 e 200";
        else
            resultado="Não está entre 100 e 200";
        return resultado;    
    }

}
