/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package javafxapplicationtest69;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JavaFXApplicationTEST69 extends Application {
    
    @Override
    public void start(Stage Primarystage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("LoginFXML.fxml"));
        
        Scene scene = new Scene(root);
        
        Primarystage.setScene(scene);
        Primarystage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
