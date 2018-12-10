/* Juan Ariza
 * COP 3003 Fall 2018
 * Database GUI Project
 * File: CharacterSpecifics.java
 * Purpose: controller class for CharacterSpecifics.fxml
 */

package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollBar;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class CharacterSpecifics {

    @FXML
    private AnchorPane charSpecificLoadout;

    @FXML
    private Label charSpecName;

    @FXML
    private ImageView charSpecImage;

    @FXML
    private Label firstApp;

    @FXML
    private Label fightStyle;

    @FXML
    private Button backToMainButton;

    @FXML
    private Label charSpecFirstApp;

    @FXML
    private Label charSpecFightStyle;

    @FXML
    private ListView<?> movelistDisplay;

    @FXML
    private ScrollBar movelistScrollbar;

}
