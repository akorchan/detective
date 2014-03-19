Boilerplate application for GWT, Spring, Hibernate stack.
==========

# FAQ

[russian]: http://git-scm.com/book/ru/
[Pro Git]: http://git-scm.com/book/
[GWT first run]: http://antonkirillov.wordpress.com/2011/03/22/creating-and-running-gwt-project-using-maven-and-intellij-idea-10/
[spring4gwt]: http://code.google.com/p/spring4gwt/downloads/detail?name=spring4gwt-0.0.1.jar

How to create and run project with Idea
---
1. Install Java 1.7
2. Add JAVA_HOME environment variable
3. Add Java to Path
4. Download Maven 3
5. Add M2_HOME environment variable
6. Add Maven to Path
7. Install MySQL server at leas version 6.0
8. Create new MySQL user with name 'root' and password '1'
9. Create new scheme in MySQL with name 'detective'
10. Install Intellij Idea (our case v.12 Ultimate)
11. Download [spring4gwt] jar and add it to maven repository (see below how to do it)
12. Go to the folder, where you want to clone project from git repository and run command 'git clone https://github.com/akorchan/detective.git'.
13. Run Idea. Go to 'File' -> Open. Choose pom.xml file from newly cloned 'detective' project.
14. Go to 'Run' -> "Edit configurations". Create new 'GWT Configuration' and select module 'detective' and Chrome as default browser. Click 'Apply'.
 * Run application in debug mode by 'Run' -> 'Debug...' and select 'detective' configuration.
 * You will need 'GWT Development plugin', so install it.
 * Now you can run application in Chrome browser and debug it.
15. Go to 'Run' -> "Edit configurations". Create new 'Tomcat' -> 'local' and select module 'detective' and Chrome as default browser. Click 'Apply'.
 * Run application in debug mode by 'Run' -> 'Debug...' and select 'detective' configuration.
 * You will need 'GWT Development plugin', so install it.
 * Now you can run application in Chrome browser and debug it.
16. More info about first run go to [GWT first run]

How to add jar file to mvn local repository
---
1. Download jar file
2. Run command:mvn install:install-file -Dfile=spring4gwt-0.0.1.jar -DgroupId=com.google.code -DartifactId=spring4gwt -Dversion=0.0.1 -Dpackaging=jar

Info about how to work with Git you can read in book [Pro Git] \(you can also read it on [russian]\)