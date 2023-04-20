/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentlap;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author mahmo
 */
public class Converting extends Stage {
    
    public Converting() {
         FXMLLoader fXMLLoader = new FXMLLoader(
                getClass().getResource("ConvertSystem.fxml") );
        Scene scene;
        try {
            scene = new Scene(fXMLLoader.load());
             this.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(Converting.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
}
