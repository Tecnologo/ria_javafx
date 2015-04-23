package controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import ricas.Ricas;


/**
 *
 * @author Sixto
 */
public class LoginController implements Initializable {
    
    private Ricas ProgramaPrincipal;

    private Stage stagePrincipal;
    
    @FXML 
    private TextField TUsuario;
    
    
    @FXML
    private void MostrarVentanaPosta(ActionEvent event){
    ProgramaPrincipal.setNombre(TUsuario.getText());
    ProgramaPrincipal.mostrarVentanaposta();
    }
    
    
    @FXML
    public void setProgramaPrincipal(Ricas ProgramaPrincipal){
    this.ProgramaPrincipal= ProgramaPrincipal;
    }
    
    @FXML
    public void setStagePrincipal(Stage stagePrincipal){
        this.stagePrincipal= stagePrincipal;
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
}
