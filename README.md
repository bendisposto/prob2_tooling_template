# Template for tools that use ProB 2.0

This template can be used to build new tools that use ProB 2.0 as a library.
It uses gradle (http://www.gradle.org/) as its build tool, but it can also be adapted to use Maven, Ant+Ivy or any other build tool that supports dependency resolution for Maven artifacts.  

To run the example use: ``gradle run``

If you don't have gradle installed, you can use the gradle wrapper ```./gradlew run``` which will download the gradle build tool and install it inside the project's folder.

You can also import the project into Eclipse, you should first produce the Eclipse metatdata using ```gradle eclipse```. Afterwards you can import the projekt as an existing project into Eclipse.

# ProB 2.0 source code
The source code of the current ProB 2.0 development is located at http://github.com/bendisposto/prob2

# Bugs
Please report bugs and feature requests at https://probjira.atlassian.net

(c) 2014 Jens Bendisposto et.al. , all rights reserved
