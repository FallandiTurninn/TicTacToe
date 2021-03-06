# Tic Tac Toe - Administration Manual

### Introduction
In this manual we will go over how to setup, run, deploy and maintain the product for administration purposes. The manual starts from scratch as the administrator has no account and the computer has none of the requiered software install. If you have the requirered software then skip ahead to the next part as you please.

### System Requirements
##### Required software
To run and maintain the software you will need the following:
  - Java JDK 8
  - Gradle
  - Git
  - Heroku
  - Any web brower
 
###### Java JDK 8 installation
In the following link you will find instructions on how to install java jdk for windows, mac or linux.
[Java JDK 8](https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html)

###### Gradle installation
In the following link are instructions on how to install gradle for windows, mac and linux.
[Gradle installation](https://gradle.org/install/)

###### Git installation
In the following link are instruction to install git for windows, mac and linux and git bash for windows.
[Gradle installation](https://gradle.org/install/)

###### GitHub
1. If you don�t have a github account already then use the following link and join up, its free.
[GitHub](www.github.com)

2. Open a command terminal or git bash and follow the instructions on how to connect to github remote repositories locally.
[GitHub Instructions](https://help.github.com/articles/setting-your-commit-email-address-in-git/)

###### Heroku Installation
1. You will need a heroku account. Sign up for free from the following link. 
[Heroku](https://www.heroku.com/)

2. Use the following link to download and install for window, mac or linux the heroku toolbelt. 
[Heroku install](https://devcenter.heroku.com/articles/heroku-cli#download-and-install)
3. Open either terminal in mac or git bash for windows and check the heroku version installed with the following command: 
    ```sh
    $ heroku --version
    ```
    The outcome should look something like this:
    heroku-cli/6.14.35-e0fe5a3 (darwin-x64) node-v8.6.0
    If so then heroku is installed.

We reccomend to take a look at [getting started with gradle on heroku guide](https://devcenter.heroku.com/articles/getting-started-with-gradle-on-heroku#introduction)

##### Product Files
In order to run and maintain the project you will need the product files.
1. Log into github with your new account.
2. Find the project repository: [https://github.com/FallandiTurninn/TicTacToe/](https://github.com/FallandiTurninn/TicTacToe/)
3. Fork the repository by clicking fork in the upper right corner and choose your profile in the pop up. Now you have a forked project on your github account.
4. Go to your github profile and choose repositories. You should find the newly forked repository there under the name �TicTacToe�. Click the repository.
5. Click �clone or download� on the right side of the screen. Copy the URL from the pop up.
6. Open shell terminal or git bash for windows and navigate to the folder you want to install the repository. Example:

    ```sh
    $ cd subfolder/anotherfolder/theappfolder
    ```
7. Use the terminal or git bash to write the following command with the copied URL. 
    ```sh
    $ git clone the_url_goes_here
    ```
Now the product files and repository is ready to use on your local device.

### System Deployment

##### How to run locally
If you have finished the instructions above then we can get to the fun part.

1. Start either shell terminal or git bash for windows.

2. Navigate to the root directory of the repository. Example: 
    ```sh
    $ cd subfolder/anotherfolder/TicTacToe
    ```
3. When you are in the root directory you can run the program with a simple command which uses the file gradlew in the root directory: 
    ```sh
    $ ./gradlew clean build run
    ```
4. Now the server is running on your localhost under port 4567. Open any browser and type the URL: [http://localhost:4567/](http://localhost:4567/)
5. Have fun!

##### How to deploy on Heroku

1. Open your shell terminal or git bash for windows.

2. Login to heruko with the following command. You will need to provide the email and password you registered with heroku. 
    ```sh
    $ heroku login
    ```

3. Go to [Travis-ci](www.travis-ci.org) and sign in with your github account. 

4. In the Travis dashboard turn ON the tic tac toe repo button. 
    
5. Navigate to the Tic Tac Toe root directory. Example: 
    ```sh
    $ cd subfolder/anotherfolder/TicTacToe
    ```
    
6. Create three new app in heroku from the root directory of tic tac toe. Copy the names of each app and place in the .travis.yml file 
    ```sh
    $ heroku apps:create
    ```

    ```sh
    $ heroku apps:create
    ```

    ```sh
    $ heroku apps:create
    ```

7. Print the auth token and use this token in the .travis.yml file
    ```sh
    $ heroku auth:token
    ```

8. Use git to commit and push the changes to heroku. 
    ```sh
    $ git commit -m �Added Heroku� | git push heroku master
    ```
    
9. Log into [heroku](www.heroku.com) and you should have a new application in your dashboard.
10. Open the app from the dashboard and click �Open app� on the right side.
11. A new window opens up with your application. Copy the URL and send to your friends!

### System Maintenance
When modifications to the code are done they should be on a feature branch (dev).
Feature branches should request pull request to the staging branch.
To deploy changes to production the admin should accept pull requests only from the staging branch to the master branch.
