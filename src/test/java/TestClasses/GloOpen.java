package TestClasses;

import PageObjects.GloLoginPage;
import Utility.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javax.swing.*;
import java.io.IOException;

public class GloOpen extends BaseClass {

    @Test
    public void GloLoginPage() throws IOException {
        driver = initializer();

        driver.get(prop.getProperty("url"));

        GloLoginPage glp =PageFactory.initElements(driver,GloLoginPage.class);
        glp.Glo_Login("anubhav.dalela","Fwreck1235$");

        System.out.println("home page");

       // WebElement ele = driver.findElement(By.id("qeda"));

//        WebDriverWait wait = new WebDriverWait(driver,30);
//        wait.until(ExpectedConditions.visibilityOf(ele));
//
//        Actions act = new Actions(driver) ;




    }

}
