# songr

## Overview
- **Lab 11:Building Full-Stack Web Apps**
  - In this Lab I will use the Spring Initializr to create a new application with artifact songr with Web and Thymeleaf (and optionally Devtools) dependencies.
  - This is a simple web site which uses a backend written in Java. The site has `/hello`, `/capitalize/{word}`and `/albums`.
- **Lab 12:Spring RESTful Routing**
  - In this lab, I will update Album model to save it  in a DataBase.
  - create routes to  add album , and show details for all of added albums.
- **Lab 13: Related Resources and Integration Testing**
  - In this lab, I will create a new model for songs and set a relation between them and their albums .
#
## Setup and Running
- clone down the repo.
-  Refer to the [application.properties](src/main/resources/application.properties) file for  of what is necessary to setup the app to work with a database.
-   The app can be run running `./gradlew bootRun` in the terminal.


#
## Routes
- `/home` :The home page contain a links for the webapp pages.
- `/addAlbum` : To add new album to your DateBase.
- `/addsong` : To add a new song for any exists album.
- `/album/{id}` : To show the details for any album and its songs. 
- `/songs` :To show the list of added lists.
  #
 
