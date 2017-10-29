package is.ru.hugb.WebUI;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

public class TestWebUI extends SeleniumTestWrapper {
  @Test
  public void testTitleMatches() {
    driver.get(baseUrl);
    assertEquals("Tic Tac Toe", driver.getTitle());

  }

  @Test
  public void testPickMode() throws Exception {
    driver.get(baseUrl);
    /* Remove Thread.sleep... */
    Thread.sleep(1000);
    assertEquals("1", "1");
    Thread.sleep(3500);
    /* ... finish test! */
  }
  
    @Test
  public void testXWin() throws Exception {
    driver.get(baseUrl);
    /* Remove Thread.sleep... */
    Thread.sleep(1000);
    driver.click("id = 0");
	Thread.sleep(500);
	driver.click("id = 3");
	Thread.sleep(500);
    driver.click("id = 1");
	Thread.sleep(500);
    driver.click("id = 4");
	Thread.sleep(500);
    driver.click("id = 2");
	Thread.sleep(500);
	assertEquals("X is the WINNER!", driver.get("id = gameInfo");
    Thread.sleep(3500);
    /* ... finish test! */
  }
}
