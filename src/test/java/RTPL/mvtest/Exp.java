package RTPL.mvtest;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

 public class Exp
 {
//Test 
@Test
public void testgooglrsearch(){
	//System.setProperty("webdriver.gecko.driver", "F://geckodriver-v0.13.0-win64//geckodriver.exe");

	System.setProperty("webdriver.chrome.driver", "F://MY DOWNLOADS//chromedriver_win32//chromedriver.exe");
	WebDriver driver = new ChromDriver();

	//WebDriver driver = new FirefoxDriver();
//it will open the goggle page
driver.get("http://google.in");

//we expect the title �Google � should be present
String Expectedtitle = "Google";

//it will fetch the actual title
String Actualtitle = driver.getTitle();

System.out.println("Before Assetion " + Expectedtitle + Actualtitle);

//it will compare actual title and expected title

Assert.assertEquals(Actualtitle, Expectedtitle);
//print out the result

System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");

 }

}

