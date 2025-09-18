package br.com.fiap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    WebDriver driver = new ChromeDriver();
    @Test
    public void httpCats() throws InterruptedException{
        driver.get("https://http.cat/status/404");
        Thread.sleep(2000);

        String title = driver.getTitle();
        Thread.sleep(2000);

        assertEquals("429 Too Many Requests | HTTP Cats", title);

        driver.quit();
        // driver.close();
    }
}
