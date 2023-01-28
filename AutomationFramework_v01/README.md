**[**Introduction:**]()** 
This Test Automation Framework is created using Java + Selenium Web Driver + JUnit. Which can be used across different web based applications. In this approach, the endeavor is to build a lot of applications independent reusable keyword components so that they can directly used for another web application without spending any extra effort. With this framework in place, whenever we need to automate a web based application, we would not need to start from scratch, but use the application independent keyword components to the extent possible and create application specific components for the specific needs.

**[**Stack & Libraries**]()**
* Java
* Selenium WebDriver
* JUnit
* Cucumber
* Maven
* Html Reports and logging

**[**Prerequisites:**]()**
- Java jdk-8 or higher
- Apache Maven 3 or higher

[**Execution:**]()
- Clone the repository.
- Open command prompt and go to web-test directory.
- To run on local environment use command - mvn clean test

**[How to run tests]()**
In terminal:

Change directory to the location of cloned project folder and run Maven clean
`mvn clean`

To run the test
`mvn test`

**[Project components]()**
* Page objects are in the directory src/test/java/pages
* Test classes are in the the directory src/test/java/tests

**Screenshot:**
- Most of the time we think to Capture Screenshot in WebDriver when some kind of error or exception surfaces while practicing testing, to resolve the same the framework has a method.
- getScreenshot() is used to indicates driver to capture a screenshot and store it in //screenshot/packageName directory.

**Reporting:**
[overview-features.html](target%2Fcucumber-html-reports%2Foverview-features.html)