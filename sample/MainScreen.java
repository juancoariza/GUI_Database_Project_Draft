/* Juan Ariza
 * COP 3003 Fall 2018
 * Database GUI Project
 * File: MainScreen.java
 * Purpose: controller class for MainScreen.fxml
 */

package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import java.io.IOException;

public class MainScreen {

    /***************************************************************
     /* Main Screen FXML Elements
     ****************************************************************/

    @FXML
    private AnchorPane mainAchor;

    @FXML
    private Label titleLabel;

    @FXML
    private Label descriptionLabel;

    @FXML
    private Button browseButton;

    /***************************************************************
     /* Methods related to screen actions
     ****************************************************************/
    // used to switch screens
    Stage stageMainMenu;
    Parent rootMainMenu;

    /**
     * Switches screen based on initial button press on the main menu
     * @param event collects which button is pressed, loads
     *              the respective FXML file, and sets values onto Stage and
     *              Parent to switch GUI screens in the same scene.
     */

    @FXML
    void handleButtonOptions(ActionEvent event) throws IOException {

        // if the "search" button is pressed, the GUI will load the Search screen
        if (event.getSource() == browseButton ) {
            stageMainMenu = (Stage) browseButton.getScene().getWindow();
            rootMainMenu = FXMLLoader.load(getClass().getResource(Screenlist.SERIES.toString()));
        }

        Scene scene = new Scene(rootMainMenu);
        stageMainMenu.setScene(scene);
        stageMainMenu.show();

    }

}

