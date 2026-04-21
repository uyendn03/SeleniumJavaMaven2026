package com.tester.Bai5_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoHTMLAttribute {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Locator HTML Attribute.");

        WebDriver driver;
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");

        // cách dùng HTML: ID
        driver.findElement(By.id("email")).sendKeys("admin@example.com");

        // 2 CÁCH DÙNG HTML: name
        //cach 1: là chấm senKeys phía sau trực tiếp cái cú pháp tìm kiếm
    //    driver.findElement(By.name("password")).sendKeys("123456");

        //cach 2: là tạo cho nó 1 đối tượng element sau đó là mình chấm senKeys sau.
        WebElement inputEmail = driver.findElement(By.name("password"));
        inputEmail.sendKeys("123456");

        // CÁCH DÙNG 4 THUỘC TÍNH KHÁC - Tuy nhiên 4 thuộc tính này không ổn định
    //  driver.findElement(By.linkText("Forgot Password?")).click();

    //  driver.findElement(By.partialLinkText("Forgot")).click();

    //  driver.findElement(By.tagName("button")).click();

    //  driver.findElement(By.className("btn-primary")).click();


        // dùng thử ví dụ Xpath
        driver.findElement(By.xpath("//button")).click();

        Thread.sleep(4000);

        driver.quit();


    }
}
