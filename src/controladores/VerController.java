package controladores;
 
import clases.DataPaisaje;
import clases.Paisaje;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.util.Callback;
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
    private AnchorPane anchorPane;

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
    }

    @FXML
    public void listarPaisajes(){
        PostaController ControladorPosta = new PostaController();
        List<Paisaje> paisajes = ricas.Ricas.listarPaisajes();
    
        Iterator it = paisajes.iterator();
        
        TableView<DataPaisaje> table = new TableView<>();
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

        TableColumn image = new TableColumn("imagen");
        image.setCellValueFactory(new PropertyValueFactory("imagen"));
        image.setPrefWidth(120);
        
        
        // SETTING THE CELL FACTORY FOR THE ALBUM ART                 
        image.setCellFactory(new Callback<TableColumn<Paisaje,Image>,TableCell<Paisaje,Image>>(){        
	@Override
	public TableCell<Paisaje, Image> call(TableColumn<Paisaje, Image> param) {                
		TableCell<Paisaje, Image> cell = new TableCell<Paisaje, Image>(){
			ImageView imageview = new ImageView();
			@Override
			public void updateItem(Image item, boolean empty) {         
                            if(item!=null){                            
					HBox box= new HBox();
					box.setSpacing(10) ;
					 
					imageview.setFitHeight(50);
					imageview.setFitWidth(50);
					imageview.setImage(item); 
					//SETTING ALL THE GRAPHICS COMPONENT FOR CELL
                                        box.getChildren().addAll(imageview);
					setGraphic(box);
				}
			}
		};              
		return cell;
	}

});
        table.getColumns().addAll(id, title, descripcion, image);   
        ObservableList paisajeToDisplay = FXCollections.observableArrayList();
        while(it.hasNext()){
            Paisaje p = (Paisaje) it.next();
            paisajeToDisplay.add(new DataPaisaje(p));
        } 
        table.setItems(paisajeToDisplay); 
        anchorPane.getChildren().addAll(table);
    }
}             

    
    
