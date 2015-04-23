package controladores;
 
import clases.Paisaje;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
//import pestañas.Paisaje;

/**
 *
 * @author Sixto
 */
public class VerController implements Initializable {
    
    
    @FXML
    private ImageView ima;
    
    @FXML
    private AnchorPane panel;
    
    @FXML
    private Label la;
     @FXML
    private ListView listView;

    public void setImage(Image imagen){
        ima.setImage(imagen);
    }

    public ImageView getIma() {
        return ima;
    }

    public String getLa() {
        return la.getText();
    }

    public void setLa(String la) {
        this.la.setText(la);
    }
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         PostaController ControladorPosta = new PostaController();
        List<Paisaje> paisajes = ricas.Ricas.listarPaisajes();
        System.err.println("paisajes");
        System.err.println(paisajes);
    }

    @FXML
    public void listarPaisajes(){
        PostaController ControladorPosta = new PostaController();
        List<Paisaje> paisajes = ricas.Ricas.listarPaisajes();
        System.err.println("paisajes");
        System.err.println(paisajes);
        Iterator it = paisajes.iterator();
        
        TableView<Paisaje> table = new TableView<Paisaje>();
        table.setTableMenuButtonVisible(true);

        TableColumn id = new TableColumn("Id");
        id.setCellValueFactory(new PropertyValueFactory("id"));
        id.setPrefWidth(120);
        
        TableColumn title = new TableColumn("Titulo");
        title.setCellValueFactory(new PropertyValueFactory("titulo"));
        title.setPrefWidth(120); 

        TableColumn descripcion = new TableColumn("Descripcion");
        descripcion.setCellValueFactory(new PropertyValueFactory("descripcion"));
        descripcion.setPrefWidth(120); 

        TableColumn image = new TableColumn("Imagen");
        image.setCellValueFactory(new PropertyValueFactory("imagen"));
        image.setPrefWidth(120);
        
        
//        while(it.hasNext()){
//            Paisaje p = (Paisaje) it.next();
//            
//            AnchorPane.
//            listView.set
//        }
        
        
        
                
        listView.setItems(FXCollections.observableList(paisajes));
    }

}             

    
    
