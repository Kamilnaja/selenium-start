package com.selenium.selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestSelenium {
    public static void main(String[] args) {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Javalib\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        driver.get(baseUrl);

        actualTitle = driver.getTitle();

        if (actualTitle.contentEquals(expectedTitle)) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed");
        }
        driver.close();
    }
}
