package org.selenide.tests;

import com.codeborne.selenide.testng.TextReport;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertTrue;
import org.selenide.pages.LoginPage;
import org.selenide.pages.MyAccountPage;

import com.codeborne.selenide.Condition;

@Listeners(TextReport.class)
public class LoginTest extends BaseTest {
  LoginPage loginPage;
  MyAccountPage myAccountPage;

  @BeforeMethod
  public void setUp() {
    loginPage = new LoginPage();
    myAccountPage = new MyAccountPage ();
    open("http://practice.automationtesting.in/");
  }

  @Test
  public void successfulMethod() {
    $(By.xpath("//li[contains(@class, 'menu-item')]//a[text() = 'My Account']")).shouldBe(Condition.visible).click();
    $(By.xpath("//input[@name='login']")).shouldBe(Condition.appear);

    loginPage.loginToPortal();

    assertTrue(loginPage.isLoaded());
  }
}
