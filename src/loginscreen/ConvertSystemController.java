/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginscreen;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author mahmo
 */
public class ConvertSystemController implements Initializable {

    @FXML
    private Button LogoutBtn;
    @FXML
    private TextField USDField;
    @FXML
    private TextField NISField;
    @FXML
    private Button ConvertBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logoutAction(ActionEvent event) throws Exception {
          
   
     Stage stage = (Stage) LogoutBtn.getScene().getWindow();
    stage.close();

    Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
    Stage loginStage = new Stage();
    loginStage.setScene(new Scene(root));
    loginStage.show();
   
    }

    @FXML
    private void convertAction(ActionEvent event) {
        
        double nis = Double.parseDouble(NISField.getText());
        double usd = Double.parseDouble(USDField.getText());
        
        if (NISField.getText().length() > 0) {
            double usdValue = nis / 3.52; 
            USDField.setText(Double.toString(usdValue)); 
        } 
        else if (USDField.getText().length() > 0) {
            double nisValue = usd * 3.52; 
            NISField.setText(Double.toString(nisValue)); 
        }
   
    }
    
}
