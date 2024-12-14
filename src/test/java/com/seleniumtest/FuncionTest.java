package com.seleniumtest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FuncionTest {
    WebDriver driver;

    @BeforeEach

    public void setup(){

        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        driver.manage().window().maximize();

    }

    @Test

    public void TestFunction() throws InterruptedException {

        WebElement addRemoveElement = driver.findElement(By.xpath("//h3[substring(text(), 1, 10)='Add/Remove']"));
        Thread.sleep(1000);
        System.out.println("Texto extraido del xpath: "+addRemoveElement.getText());

    }

    @AfterEach

    public void tearDown(){

        driver.close();

    }

}
