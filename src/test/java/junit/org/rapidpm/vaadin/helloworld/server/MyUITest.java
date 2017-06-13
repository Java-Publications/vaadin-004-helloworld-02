package junit.org.rapidpm.vaadin.helloworld.server;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.rapidpm.vaadin.helloworld.server.MyUI;

/**
 *
 */
public class MyUITest extends BaseTest {


  @Test
  public void test001() throws Exception {

    System.setProperty("webdriver.chrome.driver", "_data/chromedriver");

    final WebDriver driver = new ChromeDriver();
    final WebDriverWait wait = new WebDriverWait(driver, 10);

    driver.get("http://127.0.0.1:8080/");

    Assert.assertEquals("", output(driver).getText());

    input(driver).sendKeys("Hello World");

    final WebElement button = button(driver);

    Assert.assertNotNull(button);
    String text = button.getText();
    Assert.assertEquals("click me", text);

    button.sendKeys(Keys.ENTER);

    String outputText = output(driver).getAttribute("value");
    System.out.println("outputText = " + outputText);

    Assert.assertEquals("Hello World", outputText);

    driver.close();
    driver.quit();
  }



  private WebElement button(WebDriver driver) {
    return driver.findElement(By.id(MyUI.BUTTON_ID));
  }

  private WebElement output(WebDriver driver) {
    return driver.findElement(By.id(MyUI.OUTPUT_ID));
  }

  private WebElement input(WebDriver driver) {
    return driver.findElement(By.id(MyUI.INPUT_ID));
  }



}
