/* Juan Ariza
 * COP 3003 Fall 2018
 * Database GUI Project
 * File: Main.java
 * Purpose: program launcher
 */

package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    /* Default application launcher created by default in JavaFX project. The root is replaced with the first screen to
     * load in the program, be it a login screen or other beginning options for the user */

    final static String DATABASE_URL = "jdbc:derby:lib/books";

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource(Screenlist.MAIN.toString()));
        primaryStage.setTitle("Movelist Collection");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
