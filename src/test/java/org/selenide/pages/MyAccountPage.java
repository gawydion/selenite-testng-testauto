package org.selenide.pages;
import static com.codeborne.selenide.Selenide.title;
import static org.testng.Assert.assertEquals;
import static com.codeborne.selenide.Selenide.$;
import org.openqa.selenium.By;

public class MyAccountPage {
    String expectedPageTitle = "My Account – Automation Practice Site";

    public boolean isLoaded(){
        return title().toString().equals(expectedPageTitle);
    }
}
