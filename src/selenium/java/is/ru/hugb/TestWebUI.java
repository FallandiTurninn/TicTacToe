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
  public void testXWin() throws Exception {
    driver.get(baseUrl);
    /* Remove Thread.sleep... */
    Thread.sleep(2000);
    driver.findElement(By.id("0")).click();
	Thread.sleep(1000);
    driver.findElement(By.id("3")).click();
	Thread.sleep(1000);
    driver.findElement(By.id("1")).click();
	Thread.sleep(1000);
    driver.findElement(By.id("4")).click();
	Thread.sleep(1000);
    driver.findElement(By.id("2")).click();
	Thread.sleep(2000);
	assertEquals("X is the WINNER!", driver.findElement(By.id("gameInfo")).getAttribute("innerHTML"));
    /* ... finish test! */
  }

  @Test
  public void testOWin() throws Exception {
    driver.get(baseUrl);
    /* Remove Thread.sleep... */
    Thread.sleep(2000);
    driver.findElement(By.id("0")).click();
	Thread.sleep(1000);
    driver.findElement(By.id("3")).click();
	Thread.sleep(1000);
    driver.findElement(By.id("1")).click();
	Thread.sleep(1000);
    driver.findElement(By.id("4")).click();
	Thread.sleep(1000);
    driver.findElement(By.id("6")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("5")).click();
	Thread.sleep(2000);
	assertEquals("O is the WINNER!", driver.findElement(By.id("gameInfo")).getAttribute("innerHTML"));
    /* ... finish test! */
  }
  
  @Test
  public void testTie() throws Exception {
    driver.get(baseUrl);
    /* Remove Thread.sleep... */
    Thread.sleep(2000);
    driver.findElement(By.id("0")).click();
	Thread.sleep(1000);
    driver.findElement(By.id("1")).click();
	Thread.sleep(1000);
    driver.findElement(By.id("3")).click();
	Thread.sleep(1000);
    driver.findElement(By.id("4")).click();
	Thread.sleep(1000);
    driver.findElement(By.id("7")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("6")).click();
	Thread.sleep(1000);
    driver.findElement(By.id("2")).click();
	Thread.sleep(1000);
    driver.findElement(By.id("5")).click();
	Thread.sleep(1000);
    driver.findElement(By.id("8")).click();
	Thread.sleep(2000);
	assertEquals("Tie!", driver.findElement(By.id("gameInfo")).getAttribute("innerHTML"));
    /* ... finish test! */
  }
}
