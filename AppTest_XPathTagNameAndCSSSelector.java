package com.example;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import javax.swing.Action;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.dsaRMD160;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
public class AppTest_XPathTagNameAndCSSSelector {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void byTagAndCSS() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement tagNameElement = driver.findElement(By.tagName("input"));
        WebElement cssSelectorElement = driver.findElement(By.cssSelector("input[id='userEmail']"));
        tagNameElement.sendKeys("Using TagName");
        Thread.sleep(1000);
        cssSelectorElement.sendKeys("css@example.com");
        Thread.sleep(2000);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
