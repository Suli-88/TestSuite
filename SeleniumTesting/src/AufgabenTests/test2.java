package AufgabenTests;


import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class test2 {
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
  public void test111() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Über die DGPPN")).click();
    driver.findElement(By.linkText("Aufgaben")).click();
    driver.findElement(By.linkText("Leitlinien")).click();
    driver.findElement(By.linkText("F0 Organische, einschließlich symptomatischer psychischer Störungen")).click();
    driver.findElement(By.linkText("Kurzfassung [560 KB; PDF]")).click();
    driver.findElement(By.linkText("Langfassung [719 KB; PDF]")).click();
    driver.findElement(By.linkText("Methodenreport [709 KB; PDF]")).click();
    driver.findElement(By.linkText("Leitliniensynopse [565 KB; PDF]")).click();
    driver.findElement(By.linkText("S1-Behandlungsleitlinie Demenz_Kurfassung [52 KB; PDF]")).click();
    driver.findElement(By.linkText("F1 Psychische und Verhaltensstörungen durch psychotrope Substanzen")).click();
    driver.findElement(By.linkText("Langfassung [1,7 MB; PDF]")).click();
    driver.findElement(By.linkText("Leitlinienreport [453 KB; PDF]")).click();
    driver.findElement(By.linkText("Evidenzbericht [1,3 MB; PDF]")).click();
   
    driver.findElement(By.linkText("Sonderkapitel [4,4 MB; PDF]")).click();
    driver.findElement(By.linkText("Langfassung [13 MB; PDF]")).click();
    driver.findElement(By.linkText("Leitlinienreport [790 KB; PDF]")).click();
    driver.findElement(By.linkText("Tabellenband [4,4 MB; PDF]")).click();
    driver.findElement(By.linkText("F2 Schizophrenie, schizotype und wahnhafte Störungen")).click();
    driver.findElement(By.linkText("Kurzfassung [309 KB; PDF]")).click();
    driver.findElement(By.linkText("Methodenreport [409 KB; PDF]")).click();
    driver.findElement(By.linkText("F3 Affektive Störungen")).click();
    driver.findElement(By.linkText("Langfassung [6,4 MB; PDF]")).click();
    driver.findElement(By.linkText("Langfassung [1.8 MB; PDF]")).click();
    driver.findElement(By.linkText("Kurzfassung [548 KB; PDF]")).click();
    driver.findElement(By.linkText("Inhaltsverzeichnis und Zusammenfassung [57 KB; PDF]")).click();
    driver.findElement(By.linkText("Kurzfassung [77 KB; PDF]")).click();
    
    driver.findElement(By.linkText("F4 Neurotische-, Belastungs- und somatoforme Störungen")).click();
    driver.findElement(By.linkText("Langfassung_April 2014 [PDF; 3,8 MB]")).click();
    
    driver.findElement(By.linkText("Kurzfassung_April 2014 [PDF; 419 KB]")).click();
    
    
    
    /*
    driver.findElement(By.linkText("F4 Neurotische-, Belastungs- und somatoforme Störungen")).click();
    driver.navigate().back();
    
    driver.findElement(By.linkText("S1-Leitlinien zur Diagnostik und Therapie von Angsterkrankungen_Kurzfassung [88 KB; PDF]")).click();
    driver.navigate().back();
    
    driver.findElement(By.linkText("Langfassung_Endversion 14.05.2013 [1,3 MB; PDF]")).click();
    driver.findElement(By.linkText("Kurzfassung_Endversion 14.05.2013 [83 KB; PDF]")).click();
    driver.findElement(By.linkText("Leitlinienreport_Endversion 19.08.2013 [330 KB; PDF]")).click();
    driver.findElement(By.linkText("F4 Neurotische-, Belastungs- und somatoforme Störungen")).click();
    driver.findElement(By.linkText("F5 Verhaltensauffälligkeiten mit körperlichen Störungen und Faktoren")).click();
    driver.findElement(By.linkText("Kurzfassung [58 KB; PDF]")).click();
    driver.findElement(By.linkText("F6 Persönlichkeits- und Verhaltensstörungen")).click();
    driver.findElement(By.linkText("Kurzfassung [256 KB; PDF]")).click();
    driver.findElement(By.linkText("Kurzfassung [152 KB; PDF]")).click();
    driver.findElement(By.linkText("F9 Verhaltens- und emotionale Störungen mit Beginn in der Kindheit und Jugend")).click();
    driver.findElement(By.linkText("ADHS im Erwachsenenalter [216 KB; PDF]")).click();
    driver.findElement(By.linkText("Störungsübergreifende Behandlungsleitlinien")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Langfassung [6,4 MB; PDF]')])[2]")).click();
    driver.findElement(By.linkText("Leitlinienreport [3 MB; PDF]")).click();
    driver.findElement(By.linkText("Kurzfassung [1,35 MB; PDF]")).click();
    driver.findElement(By.xpath("//div[@id='panel-23349-0']/div/div/div/div[2]/p[4]/a[2]/strong[2]")).click();
    driver.findElement(By.xpath("//div[@id='panel-23349-0']/div/div/div/div[2]/p[5]/a/strong")).click();
    driver.findElement(By.xpath("//div[@id='panel-23349-0']/div/div/div/div[2]/p[5]/a[2]/strong")).click();
    driver.findElement(By.linkText("S1-Behandlungsleitlinie Psychosoziale Therapien_Kurzfassung [448 KB; PDF]")).click();
    driver.findElement(By.linkText("Kurzfassung [181 KB; PDF]")).click();
    driver.findElement(By.xpath("//div[@id='accordion-1819']/div/div/h4/a/span")).click();
    driver.findElement(By.linkText("Langfassung [1 MB; PDF]")).click();
    driver.findElement(By.linkText("Kurzfassung [33 KB; PDF]")).click();
    driver.findElement(By.linkText("Langfassung_Januar 2014 [PDF; 1,4 MB]")).click();
    driver.findElement(By.linkText("Psychotherapeutische Behandlung bei somatischen Erkrankungen")).click();
    driver.findElement(By.linkText("Kurzfassung_Januar 2014 [PDF; 733 KB]")).click();
    driver.findElement(By.linkText("Psychotherapeutische Behandlung bei somatischen Erkrankungen")).click();
    driver.findElement(By.linkText("Leitlinienreport_Januar 2014 [PDF; 5,3 MB]")).click();
  */
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