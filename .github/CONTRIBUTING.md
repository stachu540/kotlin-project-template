Thank you for considering to help us on this project. This guidelines presents: 
* **[How to configure your IDE](#how-to-configure-your-ide)**
* **[How to contribute to ALICE](#how-to-contribute-to-kotlin-dsl-template)**

## How to configure your IDE
Configuring IDE is important to starting contribute. We do like preferred use [IntelliJ IDEA](https://www.jetbrains.com/idea/). 
Considering other IDE is possible if:
* Supporting Gradle project
* Having installed Git (optional supported as plugin or extension)
* Supporting Java Development Kit 8 and late
* Having knowledge about Kotlin and JVM coding

### Prepare your IDE
Before start we need a [Java Development Kit 8 (JDK8)](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html). Install it and configure environmental variables: `JAVA_HOME` if not exist, create and adding to `PATH` - `$JAVA_HOME/bin`.
#### IntelliJ IDEA
[Jetbrains](https://www.jetbrains.com/) provides a most popular IDE for JVM referenced programming language.
It is a great choice to starting journey with this IDE. That's why we recommending it for people who's like programming in Java.

Before starting configuration this IDE we need [download IDE](https://www.jetbrains.com/idea/download/)
* Import project using link for git project.	
	Go to **File** > **New** > **Project from Version Control** > **Git**
	Paste your link in **URL** field and press **Clone** to start cloning repository.
* In *bottom-right corner* will shows pop-out which inform the Gradle project has been founded and ready to link. Click **Import Gradle Project**.
	If you lost this pop-out you can find them in **Event Log** (default: *bottom-right tab*)
* Then will shows a window **Import Module from Gradle**. 
	* Uncheck **Create separate module per source set** - this one makes issue in annotation processing.
	* Select **Use gradle 'wrapper' task configuration** - cause we provide gradle wrapper for this repository. We not recommend using a different gradle version cause about tasks works with bundled wrapper.
	* Set **Gradle JVM** if module couldn't found `JAVA_HOME` variable we should add it manually using three dots (`...`) button.
	* Press **OK** and wait till IDE finished importing dependencies

## How to contribute to Kotlin DSL Template
Of course you can contribute to our repository in 2 ways:
* Creating Issue
* Create Pull Request

### Issue
All your ideas, features, bug reports, etc. must be documented in following comments on [issue](https://github.com/stachu540/kotlin-dsl-template/issues/new) tab.
Questions in issue are not welcome. Use Discord server below to asking developers for your question.

### Pull Requests
So, you are thinking about sending a pull request? Awesome! But... before starting on your pull request, you should read up on
the [pull request](https://github.com/stachu540/kotlin-dsl-template/compare) comment.

Before starting pull request make sure if:

1. All your code will be subject to the project's licence, in this case [MIT](https://github.com/stachu540/kotlin-dsl-template/blob/master/LICENSE).
2. Your code follows a style requirements mentioned below, and you didn't modified project style (ex. indentation style, bracket style, naming, comments, etc). Rewrites of certain systems are kindly welcome too.
3. *Your Pull Request must be created **ONLY** against the `develop` branch!*
4. Your Pull Request have a Description and one of the types:
    - Changes Proposal - if you need add something to this repository
    - Issues Fixed - If there is some bugs has been fix
    - Deprecations - if you want remove something and they will no longer usable for the next releases
    - Incubating - if those proposal changes mentioned on `Changes Proposal` are be unstable and they are be tested on the next releases
    
   Otherwise will be rejected immediately.
   
If those requirements are be met, it will be starting review your PR. After approval your PR will be ready to Push into `develop` branch
