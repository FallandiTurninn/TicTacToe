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
    driver.findElement(By.id("0")).click();
	Thread.sleep(500);
    driver.findElement(By.id("3")).click();
	Thread.sleep(500);
    driver.findElement(By.id("1")).click();
	Thread.sleep(500);
    driver.findElement(By.id("4")).click();
	Thread.sleep(500);
    driver.findElement(By.id("2")).click();
	Thread.sleep(500);
	assertEquals("X is the WINNER!", driver.findElement(By.id("gameInfo")).getAttribute("innerHTML"));
    /* ... finish test! */
  }
}
