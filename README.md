dsffdsf sdf# selenide-maven-testng

**Run TestNG from IDE:**

Element not found {By.name: notvalidname}
Expected: visible

**Screenshot: file:/C:/work/Selenide%20Maven%20TestNG/build/reports/tests/com/reindeermobile/selenide/GoogleTest/failedTest/1456269326671.0.png**
Timeout: 4 s.
Caused by: NoSuchElementException: Unable to locate element: {"method":"name","selector":"notvalidname"}

**Run test with Maven: mvn test**

Element not found {By.name: notvalidname}
Expected: visible
	at com.reindeermobile.selenide.GoogleTest.failedTest(GoogleTest.java:16)
Caused by: org.openqa.selenium.NoSuchElementException: 
Unable to locate element: {"method":"name","selector":"notvalidname"}

