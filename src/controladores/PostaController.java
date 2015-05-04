package controladores;

import clases.Paisaje;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import ricas.Ricas;


/**
 *
 * @author Sixto
 */
public class PostaController implements Initializable {

    private Ricas ProgramaPrincipal = new Ricas();
    
    private Stage stagePrincipal;
    
    @FXML
    private Tab TVer;
    
    @FXML
    private Label ENombre;
    private Object loader;

    public Label getENombre() {
        return ENombre;
    }

    public void setENombre(String ENombre) {
        this.ENombre.setText(ENombre);
    }
    
    public void setImagen(Image imagen){
        //controladorVer.setImage(imagen);
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
    
    public void pasarDatos(String tit, String des, Image im) {
        ProgramaPrincipal.setTitulo(tit);
        ProgramaPrincipal.setDescripcion(des);
        ProgramaPrincipal.setImagen(im);
    }
    
    void mostrarVentanAdvertencia() {
        ProgramaPrincipal.mostrarVentanAdvertencia();
    }
    
    public List<Paisaje> conseguirPaisajes() {
        return ProgramaPrincipal.getPaisajes();
    }
}
    
