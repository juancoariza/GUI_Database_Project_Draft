/* Juan Ariza
 * COP 3003 Fall 2018
 * Database GUI Project
 * File: CharacterSelect.java
 * Purpose: controller class for CharacterSelect.fxml
 */

package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;

public class CharacterSelect {

    /***************************************************************
     /* Character Select FXML Elements
     ****************************************************************/

    @FXML
    private AnchorPane charPane;

    @FXML
    private Button backToSeries;

    @FXML
    private static ListView<String> charList;

    /***************************************************************
     /* Methods related to available buttons
     ****************************************************************/
    Stage stageHere;
    Parent rootHere;

    static String DatabaseCharacters;

    static String CHARACTER_QUERY;

    static ObservableList<String> characterList = FXCollections.observableArrayList();


    @FXML
    void backToSeriesAction(ActionEvent event) throws IOException {

        stageHere = (Stage) backToSeries.getScene().getWindow();
        //load up main menu FXML document
        rootHere = FXMLLoader.load(getClass().getResource(Screenlist.SERIES.toString()));
        Scene scene = new Scene(rootHere);
        stageHere.setScene(scene);
        stageHere.show();

    }

    @FXML
    static void loadCharacterDataFromSeries() {

        // The database contains a Varchar dataset named SERIESMARK that indicates the series of origin for a character
        // SF for Street Fighter, TK for Tekken, KOF for King of Fighters, and MK for Mortal Kombat
        // Note: the database will be created with an existing alphabetical order for all character inputs regardless of 
        // their series, so as to remove the need to alphabetize query results in other sections of the program
        try {

            // static reference to variable set by SeriesBrowse.java on an user's button press
            switch (SeriesBrowse.chosenSeries) {
                    // The character query sorts the database values aand return a list of all characters belonging to a 
                    // given series, then places these values into the DatabaseCharacters variable
                    
                    // TODO: replace DatabaseCharacters with an array for multiple character references
                case 1:
                    CHARACTER_QUERY = "SELECT FIRSTNAME INTO DatabaseCharacters FROM CHARNAME WHERE SERIESMARK = 'SF'";
                    break;
                case 2:
                    CHARACTER_QUERY = "SELECT FIRSTNAME INTO DatabaseCharacters FROM CHARNAME WHERE SERIESMARK = 'TK'";
                    break;
                case 3:
                    CHARACTER_QUERY = "SELECT FIRSTNAME INTO DatabaseCharacters FROM CHARNAME WHERE SERIESMARK = 'KOF'";
                    break;
                case 4:
                    CHARACTER_QUERY = "SELECT FIRSTNAME INTO DatabaseCharacters FROM CHARNAME WHERE SERIESMARK = 'MK'";
                    break;
                default:
                    break;

            }

            /* Once the correct value has been chosen, the program connects to the Database and provides the values in a row/
             * Sample output for Case 2 (list of characters from Tekken in the Database): 
             * Akuma 
             * Asuka Kazama
             * Alisa Bosconovitch
             * ...
             * */
            
            Connection connection = DriverManager.getConnection(
                    Main.DATABASE_URL, "deitel", "deitel");
            Statement statement = connection.createStatement();
            //ResultSet resultSet = statement.executeQuery(CHARACTER_QUERY);
            characterList.add(DatabaseCharacters);
            charList.setItems(characterList);
        }

        catch (SQLException | NullPointerException sqlException) {
            sqlException.printStackTrace();
        }
    }

}
