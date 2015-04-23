/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ricas;

import clases.Paisaje;
import controladores.AdvertenciaController;
import controladores.LoginController;
import controladores.PostaController;
import controladores.PrincipalController;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Sixto
 */
public class Ricas extends Application {
    
    private Stage stagePrincipal;
    
    private Stage stageIngreso;
    
    private Stage stageAdvertencia;
    
    private Stage stageAlta;
    
    private Stage ventana;
    
    private String nombre;
    
    private String titulo;
    
    private String descripcion;
    
    private static int id;
    
    private Image imagen;
    
    private static List<Paisaje> paisajes = new ArrayList<>();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    private AnchorPane VentanaLogin; 
    private AnchorPane VentanaPrincipal;
    private AnchorPane VentanaPosta;
    private AnchorPane VentanaAdvertencia;
    private AnchorPane VentanaAlta;

    
     @Override
    public void start(Stage stagePrincipal) throws Exception {
        this.stagePrincipal = stagePrincipal;
        mostrarVentanaLogin();
    }

    public static List<Paisaje> getPaisajes() {
        return paisajes;
    }

    public static void setPaisajes(List<Paisaje> paisajes) {
        Ricas.paisajes = paisajes;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }
    public static void guardarPaisaje(Paisaje p){
        Ricas.paisajes.add(p);
    }
    public static List<Paisaje> listarPaisajes(){
        return Ricas.paisajes;
    }
    public void mostrarVentanaLogin(){
        try{
        FXMLLoader loader = new FXMLLoader(Ricas.class.getResource("/vistas/Login.fxml"));
        VentanaLogin = (AnchorPane) loader.load();
        Scene scene = new Scene(VentanaLogin);
        stagePrincipal.setTitle("Login");
        stagePrincipal.setScene(scene);
        LoginController controlador = loader.getController();
        controlador.setProgramaPrincipal(this); 
        stagePrincipal.show();
        } catch (IOException e){
        }
    }
     
//    public void mostrarVentanaprincipal(){
//        try{
//            FXMLLoader loader = new FXMLLoader(Ricas.class.getResource("/vistas/Principal.fxml"));
//            VentanaPrincipal = (AnchorPane) loader.load();
//            stageIngreso = new Stage();
//            stageIngreso.setTitle("Principal");
//            stageIngreso.initOwner(stagePrincipal);
//            Scene scene = new Scene(VentanaPrincipal);
//            stageIngreso.setScene(scene);
//            PrincipalController controlador = loader.getController();
//            controlador.setProgramaPrincipal(this);  
//            controlador.setENombre(nombre);
//            stageIngreso.show();
//        }catch (IOException e){
//        }
//    }
     
    public void mostrarVentanaposta(){
        try{
            stagePrincipal.close();
            FXMLLoader loader = new FXMLLoader(Ricas.class.getResource("/vistas/Posta.fxml"));
            VentanaPosta = (AnchorPane) loader.load();
            ventana = new Stage();
            ventana.setTitle("Principal");
            ventana.initOwner(stagePrincipal);
            Scene scene = new Scene(VentanaPosta);
            ventana.setScene(scene);
            PostaController controladorPosta = loader.getController();
            controladorPosta.setProgramaPrincipal(this);  
            controladorPosta.setENombre(nombre);
            ventana.show();
        }catch (IOException e){
        }
    }
             
    public void mostrarVentanAdvertencia(){
        try{
            FXMLLoader loader = new FXMLLoader(Ricas.class.getResource("/vistas/Advertencia.fxml")); 
            VentanaAdvertencia = (AnchorPane) loader.load();
            stageAdvertencia = new Stage();
            stageAdvertencia.setTitle("Advertencia");
            stageAdvertencia.initOwner(ventana);
            Scene scene = new Scene(VentanaAdvertencia);
            stageAdvertencia.setScene(scene);
            AdvertenciaController controladorAdvertencia = loader.getController();
            AdvertenciaController controlador = loader.getController();
            controladorAdvertencia.setProgramaPrincipal(this);
            stageAdvertencia.show();
    }catch (IOException e){
  }
           }

    public void cerrarAdvertencia() {
        stageAdvertencia.close();
    }
     
    public void grabarPaisaje() {
        Paisaje paisaje = new Paisaje(id, titulo, descripcion, imagen);
//        paisajes.add(paisaje);
        id++;
        Ricas.guardarPaisaje(paisaje);
        cerrarAdvertencia();
        mostrarAlta();
        
    }
    
   // public void listarPaisajes(){
     //   PostaController controladorPosta = new PostaController();
        //controladorPosta.setProgramaPrincipal(this);
      //  controladorPosta.cambiarAVer();
 //   }
        public void mostrarAlta(){
        try{
            FXMLLoader loader = new FXMLLoader(Ricas.class.getResource("/vistas/Alta.fxml")); 
            VentanaAlta = (AnchorPane) loader.load();

            stageAlta = new Stage();
            stageAlta.setTitle("Alta");
            stageAlta.initOwner(stageAdvertencia);
            Scene scene = new Scene(VentanaAlta);
            stageAlta.setScene(scene);
            
            AdvertenciaController controladorAdvertencia = loader.getController();
            AdvertenciaController controlador = loader.getController();
            
            controladorAdvertencia.setProgramaPrincipal(this);
            stageAlta.show();
            }catch (IOException e){}
        }

    public void cerrarVentanaAlta() {
        stageAlta.close();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

  
    
}
