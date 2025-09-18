package br.com.fiap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSelenium {
    public static void main( String[] args ) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium.dev");
        Thread.sleep(100000);
        driver.quit();
    }
}
