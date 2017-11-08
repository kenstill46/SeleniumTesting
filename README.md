# SeleniumTesting
First, I made a new github repo, and a fresh Maven project in 
intelliJ. Next I searched google for "Selenium setup Java", 
which brought me here: http://seleniumsimplified.com/get-started/ 
. Next, I downloaded the chrome webDriver and added the selenium 
dependancies to the pom.xml file. After that, I was able to write 
tests very similar to regular JUnit, but using css selectors like 
.findElement(By.id("id")). I also had to use By.xpath formore 
specific elements that didn't have ids. One part of the test that 
tripped me up for a moment was when you are setting up the chrome 
web driver in the start() method you need to give the path of the 
chromedriver.exe.
