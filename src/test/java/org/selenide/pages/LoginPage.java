package org.selenide.pages;
import static com.codeborne.selenide.Selenide.title;
import static com.codeborne.selenide.Selenide.$;
import org.openqa.selenium.By;

public class LoginPage {
    By usernameInput = By.xpath("//input[@name='username']");
    By passwordInput = By.xpath("//input[@id='password']");
    By loginButton =   By.xpath("//input[@name='login']");

    String expectedPageTitle = "My Account – Automation Practice Site";

    public boolean isLoaded(){
        return title().toString().equals(expectedPageTitle);
    }

    public void loginToPortal(){
        $(usernameInput).sendKeys("gawydion@gmail.com");
        $(passwordInput).sendKeys("Jebacpis111");
        $(loginButton).click();
    }
}
