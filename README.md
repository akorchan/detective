Detective
==========

Training project using GWT, Spring, Hibernate, Maven, etc.
===

---
# How To:

[russian]: http://git-scm.com/book/ru/
[Pro Git]: http://git-scm.com/book/
[GWT first run]: http://antonkirillov.wordpress.com/2011/03/22/creating-and-running-gwt-project-using-maven-and-intellij-idea-10/

How to create and run project with Idea
---
1. Install Java 1.7
2. Add JAVA_HOME enviroment variable
3. Add Java to Path
4. Download Maven 3
5. Add M2_HOME evniroment variable
6. Add Maven to Path
7. Install MySQL server at leas version 6.0
8. Create new MySQL user with name 'root' and password '1'
9. Create new scheme in MySQL with name 'detective'
10. Install Intellij Idea (our case v.12 Ultimate)
11. Go to the folder, where you want to create project.
 * Run command: mvn archetype:generate -DarchetypeGroupId=org.codehaus.mojo -DarchetypeArtifactId=gwt-maven-plugin -DarchetypeVersion=2.5.0-rc2 -DgroupId=com.training.detective -DartifactId=Detective
 * Answer all asked question by default instead of 'module' which should be changed to 'Detective'.
 * Go to created directory 'Detective' and remove all stuff instead of 'src' folder, 'target' folder and pom.xml file.
 * Run command:	mvn idea:idea
12. Run Idea. Go to 'File' -> Open. Choose pom.xml file from newly created 'Detective' project.
13. Go to 'Run' -> "Edit configurations". Create new 'GWT Configuration' and select module 'Detective' and Chrome as default browser. Click 'Apply'.
 * Run application in debug mode by 'Run' -> 'Debug...' and select 'Detective' configuration.
 * You will need 'GWT Development plugin', so install it.
 * Now you can run application in Chrome bowser and debug it.
14. Go to 'Run' -> "Edit configurations". Create new 'Tomcat' -> 'local' and select module 'Detective' and Chrome as default browser. Click 'Apply'.
 * Run application in debug mode by 'Run' -> 'Debug...' and select 'Detective' configuration.
 * You will need 'GWT Development plugin', so install it.
 * Now you can run application in Chrome bowser and debug it.
15. More info about first run go to [GWT first run]

How to add jar file to mvn local repository
---
1. Download jar file
2. Run command:mvn install:install-file -Dfile=spring4gwt-0.0.1.jar -DgroupId=com.google.code -DartifactId=spring4gwt -Dversion=0.0.1 -Dpackaging=jar

Info about how to work with Git you can read in book [Pro Git] \(you can also read it on [russian]\)