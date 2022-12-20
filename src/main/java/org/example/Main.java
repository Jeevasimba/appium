package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static AndroidDriver driver;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities ca = new DesiredCapabilities();

        ca.setCapability("platformName","Android");
        ca.setCapability("platformVersion","11.0");
        ca.setCapability("udid","RZ8M92MDB9B");
        ca.setCapability("deviceName","Galaxy M30s");
        ca.setCapability("appPackage","com.example.login");
        ca.setCapability("appActivity","com.example.login.ui.login.LoginActivity");

        ca.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");

        URL url = new URL("http://0.0.0.0:4723/wd/hub");

        driver = new AndroidDriver(url,ca);

        WebElement username  = driver.findElement(By.id("com.example.login:id/username"));

        WebElement password  = driver.findElement(By.id("com.example.login:id/password"));

        WebElement btn  = driver.findElement(By.id("com.example.login:id/login"));

        username.click();

        username.sendKeys("deprecate@gmail.com");
    
        password.click();

        password.sendKeys("dfiuygfdsgdf");

        btn.click();

    }

}