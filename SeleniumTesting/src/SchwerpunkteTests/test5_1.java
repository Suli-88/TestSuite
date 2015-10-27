package SchwerpunkteTests;
/*
 * Weitere Themen Test1
 */

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class test5_1 {
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
  public void test5555() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Schwerpunkte")).click();
    driver.findElement(By.linkText("Weitere Themen")).click();
    driver.findElement(By.cssSelector("#c15804 > ul > li > a")).click();
    driver.findElement(By.linkText("Expertise „Die Arbeitssituation von Menschen mit schweren psychischen Erkrankungen in Deutschland“ (PDF, 1,3 MB)")).click();
    driver.findElement(By.linkText("Studie: Innereuropäischer Vergleich der Gefährdungsbeurteilung durch den Arbeitgeber bezüglich psychischer Belastungen am Arbeitsplatz (PDF; 564KB)")).click();
    driver.findElement(By.linkText("Studie (Langfassung): Innereuropäischer Vergleich der Gefährdungsbeurteilung durch den Arbeitgeber bezüglich psychischer Belastungen am Arbeitsplatz (PDF; 545KB)")).click();
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
