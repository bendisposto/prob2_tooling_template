# Template for tools that use the ProB Java API

This template can be used to build new tools that use the ProB Java API.
It uses Gradle (https://gradle.org/) as its build tool, but it can also be adapted to use Maven, Ant+Ivy or any other build tool that supports dependency resolution for Maven artifacts.

To run the example use: `gradle run`

If you don't have gradle installed, you can use the gradle wrapper `./gradlew run` which will download the gradle build tool and install it inside the project's folder.

You can also import the project into Eclipse, you should first produce the Eclipse metadata using `gradle eclipse`. Afterwards you can import the project as an existing project into Eclipse.

# ProB Java API source code

The source code for the current development version of the ProB Java API is located at https://github.com/hhu-stups/prob2_kernel

# Bugs

Please report bugs and feature requests at https://github.com/hhu-stups/prob-issues/issues

(c) 2023 Jens Bendisposto et al., all rights reserved
