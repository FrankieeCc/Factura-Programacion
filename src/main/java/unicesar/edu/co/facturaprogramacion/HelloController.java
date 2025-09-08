package unicesar.edu.co.facturaprogramacion;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.lang.reflect.Field;

public class HelloController {
    @FXML
    private Label NombreText;
    @FXML
    private Label IdText;
    @FXML
    private Label EmailText;
    @FXML
    private Label DireccionText;
    @FXML
    private Button btnGuardar;
    @FXML
    private Button btnActualizar;
    @FXML
    private TextField DireccionField;
    @FXML
    private TextField IdField;
    @FXML
    private TextField EmailField;
    @FXML
    private TextField NombreField;
    @FXML
    private Button GuardarButtonCP;
    @FXML
    private Button ActualizarButtonCP;
    @FXML
    private TextField IdFieldCP;
    @FXML
    private TextField NombreFieldCP;
    @FXML
    private TextField CantidadFieldCP;
    @FXML
    private TextField PrecioFieldCP;
    @FXML
    private Label IDTextCP;
    @FXML
    private Label NombreTextCP;
    @FXML
    private Label CantidadTextCP;
    @FXML
    private Label PrecioTextCP;



    @FXML
    protected void onbtnGuardarClick() {
        NombreText.setText("Welcome to JavaFX Application!");
    }
}
