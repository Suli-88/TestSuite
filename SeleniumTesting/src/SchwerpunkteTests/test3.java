package SchwerpunkteTests;

/*
 * Entgelt Testing
 */

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class test3 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://www.dgppn.de/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testSchwerpunttest3() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Schwerpunkte")).click();
    driver.findElement(By.linkText("Entgelt")).click();
    driver.findElement(By.linkText("weiter lesen")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Entgelt')])[2]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'weiter lesen')])[2]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Entgelt')])[2]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'weiter lesen')])[2]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Entgelt')])[2]")).click();
    driver.findElement(By.cssSelector("#c4221 > div.panel.panel-blue-box > div.panel-body > div.greyLineTop.clearfix > div.csc-textpic.csc-textpic-intext-left > div.csc-textpic-text > p > a.more")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Entgelt')])[2]")).click();
    driver.findElement(By.xpath("//div[@id='accordion-19286']/div/div/h4/a/span")).click();
    driver.findElement(By.linkText("Standpunktepapier der Verbände zu den Koalitionsvereinbarungen [PDF; 68 KB]")).click();
    driver.findElement(By.linkText("Gemeinsamer Standpunkt zum neuen Entgeltsystem für Psychiatrie und Psychosomatik [PDF; 114 KB]")).click();
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