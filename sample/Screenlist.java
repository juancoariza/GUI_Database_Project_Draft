/* Juan Ariza
 * COP 3003 Fall 2018
 * Database GUI Project
 * File: Screenlist.java
 * Purpose: stores the reference to all FXML screens under enumerators
 */

package sample;

public enum Screenlist {

    /* There are several methods to save and edit information into enums. In this case,
     * I've decided to override the existing toString() method of the Object class
     * to store the string name of the FXML files.
     * Based on an example given in Stack Overflow:
     * https://stackoverflow.com/questions/6667243/using-enum-values-as-string-literals
     * */

    CHAR_SELECT{
        @Override
        public String toString() {
            return "CharacterSelect.fxml";
        }
    },

    CHAR_SPECS{
        @Override
        public String toString() {
            return "CharacterSpecifics.fxml";
        }
    },

    MAIN{
        @Override
        public String toString() {
            return "MainScreen.fxml";
        }
    },

    MOVELIST{
        @Override
        public String toString() {
            return "MovelistDisplay";
        }
    },

    SEARCH{
        @Override
        public String toString() {
            return "SearchScreen.fxml";
        }
    },

    SERIES{
        @Override
        public String toString() {
            return "SeriesBrowse.fxml";
        }
    }
}
