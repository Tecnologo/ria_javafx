package controladores;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import ricas.Ricas;

/**
 *
 * @author Sixto
 */
public class IngresoController implements Initializable {

    
    private Ricas ProgramaPrincipal;
     
    private PrincipalController controladorPrincipal;

    @FXML private TextField TTitulo;
//    @FXML public static TextField TTitulo;
    @FXML private TextField TDescripcion;
    //@FXML public static Button btn1;
        
//    private Zoologico ProgramaPrincipal = new Zoologico();

    private Stage stagePrincipal;
    
//    private Stage stageAdvertencia;
    
    Stage stageAdvertencia;
    
    private AnchorPane VentanaAdvertencia;
    
    @FXML
    private ImageView IVImagen;
    
    private PostaController controladorPosta = new PostaController();

    
    @FXML
    public void setProgramaPrincipal(Ricas ProgramaPrincipal){
        this.ProgramaPrincipal= ProgramaPrincipal;
    }
    
    @FXML
    public void setStagePrincipal(Stage stagePrincipal){
        this.stagePrincipal= stagePrincipal;
    }

    @FXML
    private void agregarImagen(ActionEvent event) throws IOException{
        InputStream inputStream = null;
        try {
            final FileChooser fileChooser = new FileChooser();
            File file = fileChooser.showOpenDialog(null);
            if(file!=null){
                inputStream = new FileInputStream(file);
                Image imagen = new Image(inputStream);
                IVImagen.setImage(imagen);
            }
        } catch (FileNotFoundException ex) {}
    }
    
    @FXML
    private void MostrarVentanaAdvertencia(ActionEvent event){
        controladorPosta.pasarDatos(TTitulo.getText(), TDescripcion.getText(), IVImagen.getImage());
        TTitulo.clear();
        TDescripcion.clear();
        IVImagen.setImage(null);
        controladorPosta.mostrarVentanAdvertencia();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

}             

    
    
