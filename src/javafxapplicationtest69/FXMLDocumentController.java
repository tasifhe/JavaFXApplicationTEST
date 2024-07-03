/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package javafxapplicationtest69;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author CSE
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TextField userTF;
    @FXML
    private TextField passTF;
    @FXML
    private Button loginBTN;
    @FXML
    //private Stage stage;
    
//    private void handleButtonAction(ActionEvent event) {
//        System.out.println("You clicked me!");
//        label.setText("Hello World!");
//    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    

    @FXML
    private void login(ActionEvent event) throws IOException
    {
        if(event.getSource() == loginBTN){
            String username = userTF.getText();
            String password = passTF.getText();
        
        
        if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin"))
        {
//            System.out.println(username);
//            System.out.println(password);
            System.out.println("Login Successfully");
            
            //For opening Profile Window
            Parent root = FXMLLoader.load(getClass().getResource("ProfileFXML.fxml"));
        
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            stage.show();
        }
        else
                System.err.println("INVALID!!");
        }
        
    }
    
}
