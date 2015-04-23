/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javafx.beans.binding.Bindings;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Narayan
 */
public class DataPaisaje {

    //Properties 
    private SimpleStringProperty titulo = new SimpleStringProperty();
    private SimpleStringProperty descripcion = new SimpleStringProperty();
    private IntegerProperty id= new SimpleIntegerProperty();
    private ObjectProperty<javafx.scene.image.Image> imagen = new SimpleObjectProperty<>();
 

    public DataPaisaje(Paisaje p) { 
        Bindings.bindBidirectional(this.imagen.imageProperty(), GlobalModel.getInstance().getProject().getImageProperty());

        setTitulo(new SimpleStringProperty(p.getTitulo()));
        setImagen(new SimpleStringProperty(url));
        setId(new SimpleIntegerProperty(p.getId()));
        setDescripcion(new SimpleStringProperty(p.getDescripcion()));
    }

    public SimpleStringProperty getTitulo() {
        return titulo;
    }

    public void setTitulo(SimpleStringProperty titulo) {
        this.titulo = titulo;
    }

    public SimpleStringProperty getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(SimpleStringProperty descripcion) {
        this.descripcion = descripcion;
    }

    public StringProperty getImagen() {
        return imagen;
    }

    public void setImagen(StringProperty imagen) {
        this.imagen = imagen;
    }

    public IntegerProperty getId() {
        return id;
    }

    public void setId(IntegerProperty id) {
        this.id = id;
    }

     
}