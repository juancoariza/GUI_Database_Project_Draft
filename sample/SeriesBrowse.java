/* Juan Ariza
 * COP 3003 Fall 2018
 * Database GUI Project
 * File: SeriesBrowse.java
 * Purpose: controller class for SeriesBrowse.fxml
 */

package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SeriesBrowse {

    /***************************************************************
     /* Series Browse FXML Elements
     ****************************************************************/

    @FXML
    private AnchorPane seriesAnchor;

    @FXML
    private GridPane seriesList;

    @FXML
    private Label seriesBrowseDESC;

    @FXML
    private Button backToMainHere;

    @FXML
    private Button SFButton;

    @FXML
    private Button KOFButton;

    @FXML
    private Button MKButton;

    @FXML
    private Button TKButton;


    /***************************************************************
     /* Switching screens on button press methods
     ****************************************************************/
    Stage stageHere;
    Parent rootHere;
    static int chosenSeries;

    @FXML
    void manageButtons(ActionEvent event) throws IOException {

        // if the back button is pressed, the program returns to the main menu
        if (event.getSource() == backToMainHere) {

            stageHere = (Stage) backToMainHere.getScene().getWindow();
            //load up main menu FXML document
            rootHere = FXMLLoader.load(getClass().getResource(Screenlist.MAIN.toString()));
            chosenSeries = 0;

        }

        /* Based on the user's button choice, the list of characters from that respective franchise will appear in
         * in the next screen. Rather than creating new scene and stage objects, to replace the new screen,
         * replace the objects in the screen before loading it. */
        else {

            if (event.getSource() == SFButton) {
                // add series-specific data into character select listview for the CHAR_SELECT screen
                stageHere = (Stage) SFButton.getScene().getWindow();
                rootHere = FXMLLoader.load(getClass().getResource(Screenlist.CHAR_SELECT.toString()));
                chosenSeries = 1;

            } else if (event.getSource() == TKButton) {
                // add series-specific data into character select listview for the CHAR_SELECT screen
                stageHere = (Stage) TKButton.getScene().getWindow();
                rootHere = FXMLLoader.load(getClass().getResource(Screenlist.CHAR_SELECT.toString()));
                chosenSeries = 2;

            } else if (event.getSource() == KOFButton) {
                // add series-specific data into character select listview for the CHAR_SELECT screen
                stageHere = (Stage) SFButton.getScene().getWindow();
                rootHere = FXMLLoader.load(getClass().getResource(Screenlist.CHAR_SELECT.toString()));
                chosenSeries = 3;

            } else if (event.getSource() == MKButton) {
                // add series-specific data into character select listview for the CHAR_SELECT screen
                stageHere = (Stage) MKButton.getScene().getWindow();
                rootHere = FXMLLoader.load(getClass().getResource(Screenlist.CHAR_SELECT.toString()));
                chosenSeries = 4;
            }

        }

        Scene scene = new Scene(rootHere);
        stageHere.setScene(scene);
        stageHere.show();


    }

}
