package junit.org.rapidpm.vaadin.helloworld.server;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 */
public class MyUITest extends BaseTest {

  @Test
  public void test001() throws Exception {

    System.setProperty("webdriver.chrome.driver", "_data/chromedriver");

    final WebDriver driver = new ChromeDriver();
    //final WebDriverWait wait = new WebDriverWait(driver, 10);

    driver.get("http://127.0.0.1:8080/");

    String pageSource = driver.getPageSource();
    Assert.assertTrue(pageSource.contains("Hello World"));

    driver.close();
    driver.quit();
  }
}
