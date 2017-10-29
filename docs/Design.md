# Design Report

### Introduction
Tic Tac Toe is a two-player game with a 3x3 playing board. The players take turns in placing either an X (if you are the first player) or an O (if you are the second player) on the board. A player wins if they get 3 tokens in a line in a vertical, horizontal or a diagonal way. If all 9 slots on the board are filled and no winner has been crowned, the game ends in a tie. The assignment was to develop the game with continuous integration which is a practice of committing every day and integrate often in order to avoid integration conflicts. The main purpose of the exercise is to learn about continuous integration as well as implementing it using suggested methods. 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;In the project we will mainly be using the programming language Java. We will be using text editors like Sublime Text 3, Notepad++ and Vim. We will be using the Spark framework to implement our game as a web application which will require us to write some JavaScript and HTML code. GitHub will be used as source control for hosting our project and share code between team members. Gradle will keep track of all of our dependencies, it will also be used for building, testing and running our application. To make sure no faulty commits get to the master, we will use Travis CI to build and test all commits. Travis CI will also deploy master branches to our website hosting service Heroku if build and tests succeed. Lastly we will use Selenium for end to end tests on the WebUI.
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Our plan is to have three layered design, but we are not going to implement a database. We think it does not apply to our project. To be using database only for keeping how many times X or O have won is not something we think is a necessity. We don't plan to keep track of any information other than the current status of the game.


### Programming rules

1.Indentation:
Tab should be used as the unit of indentation.

2.Comments:
In-fuction comments:
```sh
//this is a single-line comment
```
Outside function comments:
```sh
/**
*this is block comment
*/
```
3.Brackets:
Curly brackets should stay in the same line as any statement/function/etc.
Example:
```sh
public void main {
    ...
}
```
4.Statements:
if statements and for statements should always have a space between for/if and the brackets.
Example:
```sh
if (condition) {
    ...
}
```

5.Naming Conventions:
We will be using Java’s default naming conventions, camelCase and CamelCase.
Class
Should have first letter capitalized and the first letter in each internal word after that should be the same.
Example: TicTacToe

Functions
Should have the first letter lowercase and the first letter in each internal word after that should be capitalized.
Example: getPlayer

Variable
Should have the first letter lowercase  and the first letter in each internal word after that should be capitalized.
Example: currentPlayer

Final
Should be all uppercase and words should be separated by underscores.
Example: MAX_WINS

### Class diagram
![Class Diagram](https://image.ibb.co/kr50qm/Design_Report_Upphaflegt_1.png)

[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does its job. There is no need to format nicely because it shouldn't be seen. Thanks SO - http://stackoverflow.com/questions/4823468/store-comments-in-markdown-syntax)


   [dill]: <https://github.com/joemccann/dillinger>
   [git-repo-url]: <https://github.com/joemccann/dillinger.git>
   [john gruber]: <http://daringfireball.net>
   [df1]: <http://daringfireball.net/projects/markdown/>
   [markdown-it]: <https://github.com/markdown-it/markdown-it>
   [Ace Editor]: <http://ace.ajax.org>
   [node.js]: <http://nodejs.org>
   [Twitter Bootstrap]: <http://twitter.github.com/bootstrap/>
   [jQuery]: <http://jquery.com>
   [@tjholowaychuk]: <http://twitter.com/tjholowaychuk>
   [express]: <http://expressjs.com>
   [AngularJS]: <http://angularjs.org>
   [Gulp]: <http://gulpjs.com>

   [PlDb]: <https://github.com/joemccann/dillinger/tree/master/plugins/dropbox/README.md>
   [PlGh]: <https://github.com/joemccann/dillinger/tree/master/plugins/github/README.md>
   [PlGd]: <https://github.com/joemccann/dillinger/tree/master/plugins/googledrive/README.md>
   [PlOd]: <https://github.com/joemccann/dillinger/tree/master/plugins/onedrive/README.md>
   [PlMe]: <https://github.com/joemccann/dillinger/tree/master/plugins/medium/README.md>
   [PlGa]: <https://github.com/RahulHP/dillinger/blob/master/plugins/googleanalytics/README.md>
