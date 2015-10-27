package BibliothekTests;



import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Multimedia_ErsteSeite {
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
  public void testTt() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("DGPPN Bibliothek")).click();
    driver.findElement(By.cssSelector("a.facetvalue-title")).click();
    /*
    driver.findElement(By.cssSelector("div.result-icon > a > img.img-responsive")).click();
    driver.findElement(By.linkText("Stöbern")).click();
    driver.findElement(By.cssSelector("a.facetvalue-title")).click();
    driver.findElement(By.xpath("//div[@id='ep-search-result']/ul/li[2]/div/a/img")).click();
    driver.findElement(By.linkText("Stöbern")).click();
    driver.findElement(By.cssSelector("a.facetvalue-title")).click();
    driver.findElement(By.xpath("//div[@id='ep-search-result']/ul/li[3]/div/a/img")).click();
    driver.findElement(By.linkText("Stöbern")).click();
    driver.findElement(By.cssSelector("a.facetvalue-title")).click();
    driver.findElement(By.xpath("//div[@id='ep-search-result']/ul/li[4]/div/a/img")).click();
    driver.findElement(By.linkText("Stöbern")).click();
    driver.findElement(By.cssSelector("a.facetvalue-title")).click();
    driver.findElement(By.xpath("//div[@id='ep-search-result']/ul/li[5]/div/a/img")).click();
    driver.findElement(By.linkText("Stöbern")).click();
    driver.findElement(By.cssSelector("a.facetvalue-title")).click();
    driver.findElement(By.xpath("//div[@id='ep-search-result']/ul/li[5]/div/a/img")).click();
    driver.findElement(By.linkText("Stöbern")).click();
    driver.findElement(By.cssSelector("a.facetvalue-title")).click();
    driver.findElement(By.xpath("//div[@id='ep-search-result']/ul/li[7]/div/a/img")).click();
    driver.findElement(By.linkText("Stöbern")).click();
    driver.findElement(By.cssSelector("a.facetvalue-title")).click();
    driver.findElement(By.xpath("//div[@id='ep-search-result']/ul/li[6]/div/a/img")).click();
    driver.findElement(By.linkText("Stöbern")).click();
    driver.findElement(By.cssSelector("a.facetvalue-title")).click();
    driver.findElement(By.xpath("//div[@id='ep-search-result']/ul/li[7]/div/a/img")).click();
    driver.findElement(By.linkText("Stöbern")).click();
    driver.findElement(By.cssSelector("a.facetvalue-title")).click();
    driver.findElement(By.xpath("//div[@id='ep-search-result']/ul/li[6]/div/a/img")).click();
    driver.findElement(By.linkText("Stöbern")).click();
    driver.findElement(By.cssSelector("a.facetvalue-title")).click();
    driver.findElement(By.xpath("//div[@id='ep-search-result']/ul/li[7]/div/a/img")).click();
    driver.findElement(By.linkText("Stöbern")).click();
    driver.findElement(By.cssSelector("a.facetvalue-title")).click();
    driver.findElement(By.xpath("//div[@id='ep-search-result']/ul/li[8]/div/a/img")).click();
    driver.findElement(By.linkText("Stöbern")).click();
    driver.findElement(By.cssSelector("a.facetvalue-title")).click();
    driver.findElement(By.xpath("//div[@id='ep-search-result']/ul/li[9]/div/a/img")).click();
    driver.findElement(By.linkText("Stöbern")).click();
    driver.findElement(By.cssSelector("a.facetvalue-title")).click();
    driver.findElement(By.xpath("//div[@id='ep-search-result']/ul/li[10]/div/a/img")).click();
    driver.findElement(By.linkText("Stöbern")).click();
    driver.findElement(By.cssSelector("a.facetvalue-title")).click();
    driver.findElement(By.xpath("//div[@id='ep-search-result']/ul/li[11]/div/a/img")).click();
    driver.findElement(By.linkText("Stöbern")).click();
    driver.findElement(By.cssSelector("a.facetvalue-title")).click();
    driver.findElement(By.xpath("//div[@id='ep-search-result']/ul/li[12]/div/a/img")).click();
    driver.findElement(By.linkText("Stöbern")).click();
    driver.findElement(By.cssSelector("a.facetvalue-title")).click();
    driver.findElement(By.xpath("//div[@id='ep-search-result']/ul/li[13]/div/a/img")).click();
    driver.findElement(By.linkText("Stöbern")).click();
    driver.findElement(By.cssSelector("a.facetvalue-title")).click();
    driver.findElement(By.xpath("//div[@id='ep-search-result']/ul/li[14]/div/a/img")).click();
    driver.findElement(By.linkText("Stöbern")).click();
    driver.findElement(By.cssSelector("a.facetvalue-title")).click();
    driver.findElement(By.xpath("//div[@id='ep-search-result']/ul/li[15]/div/a/img")).click();
    driver.findElement(By.linkText("Stöbern")).click();
    driver.findElement(By.cssSelector("a.facetvalue-title")).click();
    driver.findElement(By.xpath("//div[@id='ep-search-result']/ul/li[16]/div/a/img")).click();
    
    driver.findElement(By.linkText("Stöbern")).click();
    driver.findElement(By.cssSelector("a.facetvalue-title")).click();
    driver.findElement(By.xpath("//div[@id='ep-search-result']/ul/li[17]/div/a/img")).click();
    driver.findElement(By.linkText("Stöbern")).click();
    driver.findElement(By.cssSelector("a.facetvalue-title")).click();
    driver.findElement(By.xpath("//div[@id='ep-search-result']/ul/li[18]/div/a/img")).click();
    driver.findElement(By.linkText("Stöbern")).click();
    driver.findElement(By.cssSelector("a.facetvalue-title")).click();
    driver.findElement(By.xpath("//div[@id='ep-search-result']/ul/li[19]/div/a/img")).click();
    driver.findElement(By.linkText("Stöbern")).click();
    driver.findElement(By.cssSelector("a.facetvalue-title")).click();
    driver.findElement(By.xpath("//div[@id='ep-search-result']/ul/li[20]/div/a/img")).click();
    driver.findElement(By.linkText("Stöbern")).click();
    driver.findElement(By.cssSelector("a.facetvalue-title")).click();
*/  }

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