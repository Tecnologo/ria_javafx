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
    private SimpleStringProperty  descripcion = new SimpleStringProperty();
    private IntegerProperty id= new SimpleIntegerProperty();
    private ObjectProperty imagen = new SimpleObjectProperty();
 

    public DataPaisaje(Paisaje p) { 

        setTitulo(p.getTitulo());
        setImagen(p.getImagen());
        setId(p.getId());
        setDescripcion(p.getDescripcion());
    }

    public SimpleStringProperty tituloProperty() {
        return titulo;
    }
    public String getTitulo() {
        return titulo.get();
    }
    public void setTitulo(String titulo) {
        this.titulo.set(titulo);
    }

    public String getDescripcion() {
        return descripcion.get();
    }
    public SimpleStringProperty descripcionProperty() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion.set(descripcion);
    }
    public ObjectProperty imagenProperty() {
        return imagen;
    }
    public Object getImagen() {
        return imagen.get();
    }

    public void setImagen(Object imagen) {
        this.imagen.set(imagen);
    }
    public IntegerProperty idProperty() {
        return id;
    }
    public Integer getId() {
        return id.get();
    }

    public void setId(Integer id) {
        this.id.set(id);
    }

     
}