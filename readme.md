# Spring MVC Project

This is a [Spring MVC](https://spring.io) project using [React](https://reactjs.org/) templates for the frontend, created with the use of the [Spring MVC with React Maven Archetype](https://github.com/Bernardo-MG/spring-mvc-react-maven-archetype). It will ease the development of new Spring MVC projects, setting it up for CI through the use of three free services: [Github](https://github.com/), [Github Workflow](https://docs.github.com/en/actions/configuring-and-managing-workflows) and [Bintray](https://bintray.com/).

Before beginning with the new project there are a few things which should be edited:

- This readme's description has to be adapted to the new project.
- Project info on the POM should be checked.
- The various links on the readme, POM and Maven site (for repositories, issues, etc) should be verified.
- The documentation on the project's [Maven Site](https://maven.apache.org/plugins/maven-site-plugin/) has to be written.
- The license, if not using the MIT one, should be changed. Remember that this is referenced on the POM, readme and LICENSE files.

Note that the Maven site is using the [Docs Maven Skin](https://github.com/Bernardo-MG/docs-maven-skin), which will have a few configuration requirements of its own.

[![Release docs](https://img.shields.io/badge/docs-release-blue.svg)][site-release]
[![Development docs](https://img.shields.io/badge/docs-develop-blue.svg)][site-develop]

[![Release javadocs](https://img.shields.io/badge/javadocs-release-blue.svg)][javadoc-release]
[![Development javadocs](https://img.shields.io/badge/javadocs-develop-blue.svg)][javadoc-develop]

## Features

The project by default comes with a useful series of features:

- Preconfigured POM to begin developing a new [Spring MVC](https://spring.io) project with [Spring Boot}(https://spring.io/projects/spring-boot).
- Initial sample project including working persistence and exception handling
- Integration with [Thymeleaf](http://www.thymeleaf.org/) for the view templates.
- Using [React](https://reactjs.org/) for the UI.
- Using [Liquibase](http://www.liquibase.org/) for database versioning.
- Integration with [iText](https://itextpdf.com/) for generating PDFs.
- Prepared for [Github Workflow](https://docs.github.com/en/actions/configuring-and-managing-workflows), including configuration files and deployment scripts. Check the [Archetype documentation](http://docs.bernardomg.com/maven/library-maven-archetype) to find out more.
- Unit and integration tests suites ready to be run with [JUnit](http://junit.org) just by using the Maven test and verify commands.
- A Maven site, using the [Docs Maven Skin](https://github.com/Bernardo-MG/docs-maven-skin), to contain the documentation, the Javadocs and several reports.
- A bunch of useful files, such as readme, gitignore and gitattributes.

## Documentation

Documentation is always generated for the latest release, kept in the 'master' branch:

- The [latest release documentation page][site-release].
- The [latest release Javadoc site][javadoc-release].

Documentation is also generated from the latest snapshot, taken from the 'develop' branch:

- The [the latest snapshot documentation page][site-develop].
- The [latest snapshot Javadoc site][javadoc-develop].

The documentation site is actually a Maven site, and its sources are included in the project. If required it can be generated by using the following Maven command:

```
mvn verify site -P h2,development
```

The verify phase is required, otherwise some of the reports won't be generated.

## Usage

The application is coded in Java, using Maven to manage the project.

### Prerequisites

The project has been tested on the following Java versions:
* JDK 8

All other dependencies are handled through Maven, and noted in the included POM file.

### Profiles

Maven profiles are included for setting up the database.

| Profile  | Database              |
|----------|-----------------------|
| h2       | H2 in-memory database |

| Profile     | Server                   |
|-------------|--------------------------|
| development | Development settings     |
| production  | Production settings      |

### Installing

The project can be installed by creating the war file and deploying it into a server.

### Running

To run the project locally use the following Maven command:

```
mvn spring-boot:run -P h2,development
```

It will be accessible at [http://localhost:8080/](http://localhost:8080/).

### Running the tests

The project requires a database and a server for being able to run the integration tests.

Just like running the project, an embedded server with an in-memory database can be used:

```
mvn verify -P h2,development
```

### Packaging the WAR

When creating the WAR file the database connection credentials should be read from the environment:

```
mvn package -P production,mysql
```

Check the documentation for more information.

## Collaborate

Any kind of help with the project will be well received, and there are two main ways to give such help:

- Reporting errors and asking for extensions through the issues management
- or forking the repository and extending the project

### Issues management

Issues are managed at the GitHub [project issues tracker][issues], where any Github user may report bugs or ask for new features.

### Getting the code

If you wish to fork or modify the code, visit the [GitHub project page][scm], where the latest versions are always kept. Check the 'master' branch for the latest release, and the 'develop' for the current, and stable, development version.

## License

The project has been released under the [MIT License][license].

[issues]: https://github.com/bernardo-mg/solar-system-d3-spring-example/issues
[javadoc-develop]: https://docs.bernardomg.com/development/maven/solar-system-d3-spring-example/apidocs
[javadoc-release]: https://docs.bernardomg.com/maven/solar-system-d3-spring-example/apidocs
[license]: https://www.opensource.org/licenses/mit-license.php
[scm]: https://github.com/bernardo-mg/solar-system-d3-spring-example
[site-develop]: https://docs.bernardomg.com/development/maven/solar-system-d3-spring-example
[site-release]: https://docs.bernardomg.com/maven/solar-system-d3-spring-example
