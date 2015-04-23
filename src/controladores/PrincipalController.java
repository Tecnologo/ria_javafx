package controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import ricas.Ricas;


/**
 *
 * @author Sixto
 */
public class PrincipalController implements Initializable {
        
    private Ricas ProgramaPrincipal;
    
    private Stage stagePrincipal;
    
   
    @FXML
    private Label ENombre;

    public Label getENombre() {
        return ENombre;
    }

    public void setENombre(String ENombre) {
        this.ENombre.setText(ENombre);
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

    
