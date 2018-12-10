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

        try {

            switch (SeriesBrowse.chosenSeries) {
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
