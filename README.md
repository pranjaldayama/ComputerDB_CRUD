
# ComputerDB CRUD Tests

Prerequisites:
-------------
1. Eclipse (Used Version: Kepler Service Release 1)

2. Chrome Driver : (Used Version :Version 68.0.3440.106)
Download link - https://chromedriver.storage.googleapis.com/index.html?path=2.41/

3. Add Maven, Cucumber plugin to eclipse

Steps:

       a. Click on "Help" > "Install New software"
       b. Add the link 'http://cucumber.github.com/cucumber-eclipse/update-site' in Work with text box.
       Link for Maven : http://download.eclipse.org/technology/m2e/releases
       c. Cucumber feature will be shown, expand the tree node then verify the version.
       d. Tick the checkbox of Cucumber
       e. Click on Next button then Finish button. 
       
Manual Test Cases:
------
Folder 'resources' contains Functional, GUI, Security, Device Compatibilty and Performance tests

Purpose:
-------
Automated and Manual tests for http://computer-database.herokuapp.com/computers

Description of the automation framework:
------------
Test cases are automated using Selenium + Java, Cucumber, BDD, Junit, Maven
Created Maven Project and added dependencies for selenium and Junit
Used Page Object Model (POM) i.e created separate page for each web page and defined objects on respective pages.

1. src/test/java - dataProvider : ConfigFileReader - Java class to read the config
file
2. src/test/java - features : Entry point to cucumber tests. Test cases are
described in english language
3. src/main/java -pageObjects : Object oriented class that is the interface to all the
pages of the AUT (Application Under Test). To enhance code maintenance and
reducing code duplication. Page objects for Computer database home page, edit page , add new computer page
4. src/test/java -runner : TestRunner class is used to run our test cases.
5. src/test/java - stepDefinitions : Java class that contains java methods that links to
the steps (Given,When,Then) of the Gherkin language in the Scenario present in
feature file
6. Maven Dependencies : Contains all the jar files of JUnit, Cucumber, Selenium etc.
provided in the Maven file : pom.xml
7. Configs - Configuration.properties : Properties file to maintain project configuration
data like application url, browser exe, data-base configurations etc.
8. Target : Contains cucumber, JUnit reports
9. Pom.xml : Maven (pom.xml) configures dependencies for building testing and
running code.
10. resources : Test cases present of the application : Functional , GUI, Security and Performance tests


How to execute the test scripts ?
----------
Run the Features : 

To run the features/test scripts, in runner package, go to testRunner.java, right click , runAs JUnit.
It will execute all the features of the application.

If we want to run a single feature, then open the feature file, right click RunAs Cucumber Feature.

If we want to run specific features in certain order then , you can specify the same in testrunner.java and excute it as JUnit Test
features ={"src/test/java/features/AddComputer.feature","src/test/java/features/DeleteComputer.feature"}


This project automates the full CRUD (Create, Read, Update, Delete) flow of the [Computer Database app]((http://computer-database.herokuapp.com/computers)) using **Selenium WebDriver**, **Java**, and **TestNG**.

---

## 🚀 Tech Stack

- 🧪 **Test Framework:** TestNG
- 🧭 **Automation Tool:** Selenium WebDriver
- 🧱 **Build Tool:** Maven
- 🌐 **Test Target:** http://computer-database.herokuapp.com/computers

---

## 📁 Project Structure

```

├── src/
│   ├── main/java/           ← Page Objects & Utility classes
│   └── test/java/           ← Test cases for CRUD operations
├── pom.xml                  ← Maven build config
└── README.md                ← You're looking at it 😊

````


## ✅ Functional Coverage

- ✅ **Add Computer**
- ✅ **Search Computer**
- ✅ **Update Computer Details**
- ✅ **Delete Computer**
- ✅ **Negative Tests & Validations**

---

## 🛠️ Getting Started

### 1. Clone the repo
```bash
git clone https://github.com/pranjaldayama/ComputerDB_CRUD.git
cd ComputerDB_CRUD
````

### 2. Run Tests via Maven

```bash
mvn clean test
```

> Make sure your system has Java 11+ and Maven installed.

---

## 📸 Sample Test Report

Reports (e.g., TestNG HTML reports) will be generated in:

```
/test-output/index.html
```

Open it in your browser to view the results.

---

## 🧠 Author

* **Pranjal Dayama**
  💼 [LinkedIn](https://linkedin.com/in/pranjaldayama)
  🔗 [GitHub Profile](https://github.com/pranjaldayama)




