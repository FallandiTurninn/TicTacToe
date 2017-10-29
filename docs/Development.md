# Tic Tac Toe - Decelopment Manual

### Introduction
These are some steps on how to set up for development of tic tac toe for either new developers or new teams. The manual gives an overview of the system, the requirements needed to run and build the program and where to find

### System Overview
The tic tac toe system’s main back end syntax is java and front end is written with HTML, CSS and javascript. The front end also uses the java spark ([spark documentation](http://sparkjava.com/documentation#getting-started)) UI framework to handle http requests between logic and UI. 

### System Requirements
The following are some software and package requirements needed to run.
  - Java JDK 8
  - Gradle
  - Git
  - Heroku
  - Any web brower

#### Installations

###### Java JDK 8 installation
In the following link you will find instructions on how to install java jdk for windows, mac or linux.
[Java JDK 8](https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html)

###### Git installation
Follow the instruction below to install git for windows, mac and linux and git bash for windows.
[Gradle installation](https://gradle.org/install/)

###### Gradle installation
In the link below are instructions on how to install gradle for windows, mac and linux.
[Gradle installation](https://gradle.org/install/)

###### Text editor
You can use any text editor you want. We recommend using vim from inside terminal or sublime as an editor ([downloadable here](https://www.sublimetext.com/3))	

### Source control client
We use GitHub as a source control client and you will need your own account. When you have your own account you need to clone the remote repository from github which contains all the source code to your local machine. Instructions are below.

1. Create a [github](www.github.com) account

2. Locate the tic tac toe repository here: https://github.com/FallandiTurninn/TicTacToe
3. Open either terminal for mac or Git bash for windows and navigate to a folder to add the repository.
4. Type the following to terminal or git bash
    ```sh
    $ git clone git@github.com:FallandiTurninn/TicTacToe.git
    ```

5. Now you have a working local repository for tic tac toe.

### Running the program
To run the program on your local machine do the following:
1. Inside the root directory of the repository enter the following in terminal or git bash to run the program on your local server.
    ```sh
    $ ./gradlew run
    ```

2. Open any browser and run your localhost with port 4567. Check: http://localhost:4567/

### Build environment
Run the build file in the root directory of the repository inside terminal or git bash with following: 

        $ ./gradlew

This clears older build files and builds new with the new modified source code and relocates additional files.

### Dependencies

##### Travis
Travis is an automated continuous integration server and is used as such for unit testing on server. All configurations are inside of file in the root directory (filename is .travis.yml). Below are few links to either documentation or home page for registry which we reccommend.

* https://travis-ci.org/ - Sign up with GitHub account in upper left corner
* [Documentation](https://docs.travis-ci.com/) - Documentations with a get started feature

##### Heroku
Heroku is a container-based cloud Platform which developers use to deploy their apps. The tic tac toe already
has all files set up for connection on heroku. Please refer to administrator about location. It is reccomended that
decelopers have an account with heroku and read the documentation.

* https://www.heroku.com/- Sign up from main site
* [Java documentation](https://devcenter.heroku.com/categories/java) - Heroku java documentation center

##### Spark
Is a java web UI micro framework which uses http requests to send data.

* [Documentation](http://sparkjava.com/documentation) - Documentations with a get started feature

##### Selenium
Selenium is for automating web applications for testing purposes and is used in 
this application for testing the UI. 

* [Documentation](http://www.seleniumhq.org/docs/) - The selenium documentation