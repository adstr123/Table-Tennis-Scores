# Table Tennis Tournament Score Tracker - Year 2 University Project

## Task
Create a program to track scores from table tennis games in a hypothetical tournament. Two teams of two players play each other across four matches. Finally, a doubles match is held. The program needs to record:

- Team names
- Player Names
- Scores for each game
- Set number

From this data the program needs to calculate:
- Whether the winner was the home or away team
- The overall winner across the five matches
- (extension) Submit the scores to be saved in a database

The program also needs to:
- Have a button to display the team names and their current scores
- Have a button to read-in scores from a text file, for marking purposes

## Assessment
The code was compared with the provided class and sequence diagrams and marks were awarded for accuracy - proper class/object/method names, correct program flow, bug-free execution etc.

## Code
###### TTScoreGUI1
The file containing code necessary to render a Swing GUI. Also contains logic executed for each button press event.

###### MatchLog
Save match scores entered in GUI. Classes call methods in this class when they want scores (not implemented).

###### RegistrationManager
Adds teams to a list, checks team validities, gets all teams and passes to GUI when "List Teams" button pressed.

###### Team
Creates Team objects, which possess a list of team members. Adds and gets players, calculates total matches won by the team, to pass when "List Teams" and "Submit Scores" buttons are pressed.

###### Player
Creates Player objects ready to be added to Teams. Calculates points and sets won, to pass when "List Teams" and "Submit Scores" buttons are pressed.

###### MatchScore
Gets information from the GUI (should have gone through MatchScore), has logic to calculate match winners

###### SetScore
Abstract class that gets information from the GUI (should have gone through MatchScore), implements functionality to calculate set winners

###### SingleSet
Implementation of SetScore for a set with single players

###### DoubleSet
Implementation of SetScore for a set with double players

###### GameScore
Gets information from the GUI (should have gone through MatchScore), has logic to calculate game winners

## Result
I got 70%, a first.

![Table Tennis Score Tracker Screenshot](https://github.com/adstr123/Table-Tennis-Scores/blob/master/demo.jpg)