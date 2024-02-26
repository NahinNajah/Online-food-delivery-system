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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class CustomerSceneController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void GoToReviewScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Review Scene.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void GoToHelp_SupportScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Help_SupportScene.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void GoToComplainScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Complain scene.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void GoBackToLoginScene(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("Login scene.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Login scene");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void GoToResturantOneScene(ActionEvent event) throws IOException {
         Parent root = FXMLLoader.load(getClass().getResource("ViewAllFood.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void GoToResturantTwoScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ViewAllFood.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void GoToResturantThreeScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ViewAllFood.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void GoToResturantFourScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ViewAllFood.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void GoToResturantFiveScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ViewAllFood.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void GoToOrderTrackScene(ActionEvent event) throws IOException {
        
             Parent root = FXMLLoader.load(getClass().getResource("CusOrderTrackScene.fxml"));
             Scene scene = new Scene(root);
             Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
             stage.setTitle("Customer scene");
             stage.setScene(scene);
             stage.show();
    }
    
}
