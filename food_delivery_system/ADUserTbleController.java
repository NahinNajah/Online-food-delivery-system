/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food_delivery_system;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SortEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ADUserTbleController implements Initializable {

    @FXML
    private TableView<Table> tabletxt;
    @FXML
    private TableColumn<Table, String> nme;
    @FXML
    private TableColumn<Table, String> eml;
    @FXML
    private TableColumn<Table, String> pss;
    @FXML
    private TextField nametxt;
    
    @FXML
    private Button addButton;
    @FXML
    private Button removetxt;
    static ArrayList<Table>UserArrayList;
    private TableView<Table> tabletxt1;
    @FXML
    private Button returnButton;
    @FXML
    private TextField itemtxt;
    @FXML
    private TextField pricetxt;
    /**
     * Initializes the controller class.
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        UserArrayList= new ArrayList<Table>();
        nme.setCellValueFactory(new PropertyValueFactory<Table, String>("name"));
        eml.setCellValueFactory(new PropertyValueFactory<Table, String>("item"));
        pss.setCellValueFactory(new PropertyValueFactory<Table, String>("price"));
    }    

    


    

    @FXML
    private void RemoveButton(MouseEvent event) {
        int selectedID = tabletxt.getSelectionModel().getSelectedIndex();
        tabletxt.getItems().remove(selectedID);
    }

    
    @FXML
   private void AddButton(ActionEvent event) {
              

   
        boolean datavalid = true;
        
        String nameStr =  nametxt.getText().trim();
        
        String itemStr =  itemtxt.getText().trim();
        String priceStr = pricetxt.getText().trim();
        if (datavalid == true) 
        {
            if(nameStr.length() == 0){
                
            
            
             
             JOptionPane.showMessageDialog(null,"Fill the Item name option");
             datavalid=false;
                
          } 
        }
        
            
        
            
             
        if (datavalid==true)
        {
            if(itemtxt.getText().contains("tk") == false) {
                
                JOptionPane.showMessageDialog(null," Error  fill the full statemenet");
              
                datavalid= false;
                
            }
            if(itemStr.length() == 0){
                
            
             JOptionPane.showMessageDialog (null, "Error: Item Nmae cannot be blank.");
             datavalid = false;
            }
            
            }
        if(datavalid == true){
            if(priceStr.length() == 0){
                
            
             JOptionPane.showMessageDialog (null, "Error: Price cannot be blank.");
             datavalid = false;
            }
        }
        File f = null;
        FileOutputStream fos = null;
        //BufferedOutputStream bos = null;
        DataOutputStream dos = null;
        
        try {
            f = new File("Payment.bin");
            if(f.exists()) fos = new FileOutputStream(f,true);
            else fos = new FileOutputStream(f);
            
            //bos = new BufferedOutputStream(fos);
            //dos = new DataOutputStream(bos);
            dos = new DataOutputStream(fos);
            
            
            dos.writeUTF(nametxt.getText());
            dos.writeUTF(itemtxt.getText());
            dos.writeUTF(pricetxt.getText());
            

        } catch (IOException ex) {
            Logger.getLogger(ADUserTbleController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(dos != null) dos.close();
            } catch (IOException ex) {
                Logger.getLogger(ADUserTbleController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
   
   
        if(datavalid == true){
        Table t  = new Table(nametxt.getText(),
                itemtxt.getText(),
                pricetxt.getText());
        ObservableList<Table> users= tabletxt.getItems();
        users.add(t);
        tabletxt.setItems(users);
        nametxt.setText(null);  itemtxt.setText(null);  pricetxt.setText(null);
        //t.display();
        }   
       /* File f = null;
        FileOutputStream fos = null;
        //BufferedOutputStream bos = null;
        DataOutputStream dos = null;
        
        try {
            f = new File("EmpData.bin");
            if(f.exists()) fos = new FileOutputStream(f,true);
            else fos = new FileOutputStream(f);
            
            //bos = new BufferedOutputStream(fos);
            //dos = new DataOutputStream(bos);
            dos = new DataOutputStream(fos);
            
            
            dos.writeUTF(nametxt.getText());
            dos.writeUTF(itemtxt.getText());
            dos.writeUTF(pricetxt.getText());
            

        } catch (IOException ex) {
            Logger.getLogger(ADUserTbleController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(dos != null) dos.close();
            } catch (IOException ex) {
                Logger.getLogger(ADUserTbleController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        

   }
   }*/

   }
    @FXML
    private void ReturnButton(ActionEvent event) throws Exception {
        //System.out.println("You clicked me!");
        //label.setText("Hello World!");
        Parent root = FXMLLoader.load(getClass().getResource("ResturantManagerScene.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();
    }

    /*@FXML
    private void AddButton(MouseEvent event) {
         boolean datavalid = true;
        
        String nameStr =  nametxt.getText().trim();
        
        String emailStr =  emailtxt.getText().trim();
        String passStr = passtxt.getText().trim();
        if (datavalid == true) 
        {
            if(nameStr.length() == 0){
                
            
            
             
             JOptionPane.showMessageDialog(null,"Fill the name option");
             datavalid=false;
                
          } 
        }
        
            
        
            
             
        if (datavalid==true)
        {
            if(emailtxt.getText().contains("@gmail.com") == false) {
                
                JOptionPane.showMessageDialog(null,"error email not valid");
              
                datavalid= false;
                
            }
            if(emailStr.length() == 0){
                
            
             JOptionPane.showMessageDialog (null, "Error: Email cannot be blank.");
             datavalid = false;
            }
            
            }
        if(datavalid == true){
            if(passStr.length() == 0){
                
            
             JOptionPane.showMessageDialog (null, "Error: PASSWORD cannot be blank.");
             datavalid = false;
            }
        }
        
        Table t  = new Table(nametxt.getText(),
                emailtxt.getText(),
                passtxt.getText());
        ObservableList<Table> users= tabletxt.getItems();
        users.add(t);
        tabletxt.setItems(users);
        nametxt.setText(null);  emailtxt.setText(null);  passtxt.setText(null);
        //t.display();
        
       
      
      
        File f = null;
        FileOutputStream fos = null;
        //BufferedOutputStream bos = null;
        DataOutputStream dos = null;
        
        try {
            f = new File("EmpData.bin");
            if(f.exists()) fos = new FileOutputStream(f,true);
            else fos = new FileOutputStream(f);
            
            //bos = new BufferedOutputStream(fos);
            //dos = new DataOutputStream(bos);
            dos = new DataOutputStream(fos);
            
            
            dos.writeUTF(nametxt.getText());
            dos.writeUTF(emailtxt.getText());
            dos.writeUTF(passtxt.getText());
            

        } catch (IOException ex) {
            Logger.getLogger(ADUserTbleController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(dos != null) dos.close();
            } catch (IOException ex) {
                Logger.getLogger(ADUserTbleController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        

   
    }*/

    @FXML
    private void Table(SortEvent<Table> event) {
    }

    @FXML
    private void ViewButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ViewPayment.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();
    }


    
    }