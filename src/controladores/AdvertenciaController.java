package controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import ricas.Ricas;

/**
 *
 * @author Sixto
 */
public class AdvertenciaController implements Initializable{
    
    private Ricas ProgramaPrincipal;
    
    private Stage stagePrincipal;
   
    
    @FXML
    private Button BSi;
    
    @FXML
    public void setProgramaPrincipal(Ricas ProgramaPrincipal){
    this.ProgramaPrincipal= ProgramaPrincipal;
    }
    
    @FXML
    public void setStagePrincipal(Stage stagePrincipal){
    this.stagePrincipal= stagePrincipal;
    }
    
    @FXML
    private void CerrarVentana(ActionEvent event){
        ProgramaPrincipal.cerrarAdvertencia();
    }
    
    @FXML
     void GrabarPaisaje(ActionEvent event) { 
        ProgramaPrincipal.grabarPaisaje();
        }
     
     @FXML
     void CerrarAlta(ActionEvent event) {
         ProgramaPrincipal.cerrarVentanaAlta();
     }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
}
