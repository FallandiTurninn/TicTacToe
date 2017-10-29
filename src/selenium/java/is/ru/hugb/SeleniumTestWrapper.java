package is.ru.hugb.WebUI;

import java.util.concurrent.TimeUnit;


//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public abstract class SeleniumTestWrapper {
  static ChromeOptions options = new ChromeOptions();//.setBinary("/usr/local/share/").addArguments("--headless").addArguments("--disable-gpu");


  static ChromeDriver driver;
  static String baseUrl;
  static String port;

  @BeforeClass
  public static void openBrowser() {
    driver = new ChromeDriver(options);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    port = System.getenv("PORT");
    if (port == null) {
        port = "4567";
    }
    //baseUrl = "http://localhost:" + port;
    baseUrl = "https://ancient-gorge-29926.herokuapp.com";
  }

  @AfterClass
  public static void closeBrowser(){
    driver.quit();
  }
}
