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
 * @author ASUS
 */
public class HrManagerController implements Initializable {

    @FXML
    private Button Assigntask;
    @FXML
    private Button Generatestaffreports;
    @FXML
    private Button Performancereports;
    @FXML
    private Button Attendancereport;
    @FXML
    private Button Noticealldepartment;
    @FXML
    private Button Traininganddevelopment;
    @FXML
    private Button Recruitandhireemployees;
    @FXML
    private Button Leaveapplication;
    @FXML
    private Button Next;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void AssigntaskButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Assigned Task1.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void GeneratestaffreportsButton(ActionEvent event) throws IOException {
        Parent root;
        root = FXMLLoader.load(getClass().getResource("Generate Staff Reports.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();

    
    }

    @FXML
    private void PerformancereportsButton(ActionEvent event) throws IOException {
        Parent root;
        root = FXMLLoader.load(getClass().getResource("Performance Reports.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();

    }
    

    @FXML
    private void AttendancereportButton(ActionEvent event) throws IOException {
        Parent root;
        root = FXMLLoader.load(getClass().getResource("Attendance Report.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void NoticealldepartmentButton(ActionEvent event) throws IOException {
        Parent root;
        root = FXMLLoader.load(getClass().getResource("Notice All Department.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();
    } 
    

    @FXML
    private void TraininganddevelopmentButton(ActionEvent event) throws IOException {
        Parent root;
        root = FXMLLoader.load(getClass().getResource("Training And Development.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void RecruitandhireemployeesButton(ActionEvent event) throws IOException {
        Parent root;
        root = FXMLLoader.load(getClass().getResource("Recruit And Hire Employees.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void LeaveapplicationButton(ActionEvent event) throws IOException {
        Parent root;
        root = FXMLLoader.load(getClass().getResource("Leave Application.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void NextButton(ActionEvent event) throws IOException {
        Parent root;
        root = FXMLLoader.load(getClass().getResource("Office assistant.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();

    }
    }
    

