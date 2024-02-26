/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food_delivery_system;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class UserTypeController implements Initializable {
    @FXML
    private Button customerButton;
    @FXML
    private Button Restaurant;
    @FXML
    private Button delivery;
    @FXML
    private Button Accountant;
    @FXML
    private Button HelpManager;
    @FXML
    private Button HR;
    @FXML
    private Button Office;
    @FXML
    private Button Return;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void CustomerButtonHandler(ActionEvent event) throws IOException {
        Parent root;
        root = FXMLLoader.load(getClass().getResource("Customer scene.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void Restaurant(ActionEvent event)throws IOException {
        Parent root;
        root = FXMLLoader.load(getClass().getResource("ResturantManagerScene.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();

    }
    @FXML
    private void Delivery(ActionEvent event) throws IOException {
        Parent root;
        root = FXMLLoader.load(getClass().getResource("Rider scene.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();

    }
    @FXML
    private void Accountant(ActionEvent event) throws IOException {
        Parent root;
        root = FXMLLoader.load(getClass().getResource("AccountantScene.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();

    }
    @FXML
    private void HelpandSupportManager(ActionEvent event) throws IOException {
        Parent root;
        root = FXMLLoader.load(getClass().getResource("Help_SupportScene.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void HR(ActionEvent event) throws IOException {
        Parent root;
        root = FXMLLoader.load(getClass().getResource("HRmangerScene.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void Office(ActionEvent event) throws IOException {
        Parent root;
        root = FXMLLoader.load(getClass().getResource("OfficeAssistant.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void Return(ActionEvent event) throws IOException {
        Parent root;
        root = FXMLLoader.load(getClass().getResource("CeoScene.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();

    }
    
}

    /**
     * Initializes the controller class.
     */
    
    

