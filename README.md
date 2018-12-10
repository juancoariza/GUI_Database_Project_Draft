# GUI_Database_Project_Draft
Draft version of COP 3003 Assignment GUI Database 


# Movelist Reference 
The purpose of this program is to store and display the secret moves used in arcade fighting games from the 1990's.
For this draft, the selection is limited to 4 franchises: Street Fighter, Tekken, Mortal Kombat, and The King of Fighters.

The user will be able to choose from said 4, then choose a character from within the series. The character's movelist is then displayed and loaded on another screen.

*The database organization plan is detailed below*

## Database Design
The database stores two tables of information: Character and Movelist

***Character***

The character database stores the character's addition order to the table, the character's name, and their series of origin. the SERIESMARK is used to organize the characters by series of origin. When the user pressed the button corresponding to the series - e.g.the Tekken Button - the database will be organized into a column of alphabetical order by SERIESMARK TK 

![](https://github.com/juancoariza/GUI_Database_Project_Draft/blob/master/sample/Icons/Database1.PNG)

***Movelists***

A character's "movelist" is a series of joystick movement and button combinations used to give several techniques to a character. Born from technical limitations of the 90's, these movements and their use are essential to mastering retro and modern figthing games. There are two columns: NUMPADNOTATION and BUTTONS. Explanations for the data presented in the table are below.

*Numberpad Notation*

When viewing a joystick from above, there are 8 input directions the player can choose: up, down, left, right, and the diagonal combinations (up/right, up/left, down/right, down/left). These can be mapped using a standard computer numberpad as such:

![](https://github.com/juancoariza/GUI_Database_Project_Draft/blob/master/sample/Icons/NumpadNotation.jpg)


*Buttons*

While buttons may vary from game to game, the functionality of the buttons remains the same: each button corresponds to a strength of an attack - in Street Fighter there are 6 buttons (Light Punch, Medium Punch, Heavy Punch) and (Light Kick, Medium Kick, Heavy Kick); whereas in Tekken there are 4 buttons (Left Punch, Right Punch, Left Kick, Right Kick). Regardless of these differences, they can all be treated under the same notation.

NOTE: The vast majority of these games also use the same button/movement combinations, so the movelist table is vastly smaller in comparison to the list of characters.

![](https://github.com/juancoariza/GUI_Database_Project_Draft/blob/master/sample/Icons/Database2.PNG)




