package controladores;

import clases.Paisaje;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
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

//    void cerrarVentanaAdvertencia() {
//        ProgramaPrincipal.cerrarAdvertencia();
//    }


//    public void cambiarPestana(){
//    ver.getSelectionModel().selectedItemProperty().addListener(
//    new ChangeListener<Tab>() {
//        @Override
//        public void changed(ObservableValue<? extends Tab> ov, Tab t, Tab t1) {
//            System.out.println("Tab Selection changed");
//            }    
//        });
//    }

   //public void cambiarAVer() {
      //  SingleSelectionModel<Tab> selectionModel = null;
      //  selectionModel.select(TVer);
        //SingleSelectionModel<Tab> selectionModel = TVer.setSelectionModel();
   // }
    
//    public void listarPaisaje(){
//        String lasdas="momo";
//        FXMLLoader loader = new FXMLLoader(Ricas.class.getResource("Ver.fxml")); 
//        VerController controladorVer = loader.getController();
//        controladorVer.setLa(lasdas);
//        
//    }
}
    
