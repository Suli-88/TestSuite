package SchwerpunkteTests;
/*
 * Internationalisieung Testing
 */



import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class test4 {
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
  public void test444444() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Schwerpunkte")).click();
    driver.findElement(By.linkText("Internationalisierung")).click();
    driver.findElement(By.xpath("//div[@id='accordion-1906']/div/div/h4/a/span")).click();
    driver.findElement(By.linkText("American Psychiatric Association (APA)")).click();
    driver.findElement(By.linkText("Department of Mental Health and Substance Abuse der World Health Organization (WHO )")).click();
    driver.findElement(By.linkText("European Brain Council")).click();
    driver.findElement(By.linkText("European Psychiatric Association (EPA)")).click();
    driver.findElement(By.linkText("International Federation of Psychotherapy (IFP)")).click();
    driver.findElement(By.linkText("International Initiative for Mental Health Leadership")).click();
    driver.findElement(By.linkText("Union of European Medical Specialties (UEMS)")).click();
    driver.findElement(By.linkText("Mehr Kontaktdetails")).click();
    driver.findElement(By.linkText("weiter lesen")).click();
    driver.findElement(By.xpath("//div[@id='accordion-1904']/div/div/h4/a/span")).click();
    driver.findElement(By.linkText("World Psychiatric Association (WPA)")).click();
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