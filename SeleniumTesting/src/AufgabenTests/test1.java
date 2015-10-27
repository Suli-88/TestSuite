package AufgabenTests;


import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class test1 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  
  String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);  //open a link in a new tab
  //String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t"); //open empty new tab
  

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://www.dgppn.de/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test11() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Über die DGPPN")).click();
    driver.findElement(By.linkText("Aufgaben")).click();
    driver.findElement(By.linkText("Aus-, Fort- und Weiterbildung")).click();
    driver.findElement(By.xpath("//div[@id='accordion-1040']/div/div/h4/a/span")).click();
    driver.findElement(By.linkText("neue Musterweiterbildungsordnung [32KB; PDF] (Stand: 2003 in der Fassung vom 25.06.2010")).click();
    driver.findElement(By.linkText("Download Weiterbildungsbuch")).click();
    driver.findElement(By.linkText("Aktuelles Weiterbildungsbuch [93 KB]")).click();
    
    driver.findElement(By.linkText("Aktuelles Weiterbildungsbuch [93 KB]")).sendKeys(selectLinkOpeninNewTab);
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}