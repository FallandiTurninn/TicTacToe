package is.ru.hugb.WebUI;

import java.util.concurrent.TimeUnit;


//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public abstract class SeleniumTestWrapper {
  ChromeOptions options = new ChromeOptions();
  //options.addExtensions(new File("/path/to/extension.crx"))
  options.setBinary(new File("/home/travis/")); //"


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
