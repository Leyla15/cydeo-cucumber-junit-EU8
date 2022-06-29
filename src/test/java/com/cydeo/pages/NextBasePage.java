package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cydeo.utilities.Driver;

public class NextBasePage {

  public NextBasePage(){

      PageFactory.initElements(Driver.getDriver(),this);

  }

  @FindBy(name = "USER_LOGIN")
    public WebElement userName;

  @FindBy(name= "USER_PASSWORD")
    public WebElement passWord;

  @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginBtn;

  @FindBy(xpath = "//span[@class='sitemap-menu-lines']")
    public WebElement menuBtn;

  @FindBy(xpath = "//*[@id=\"sitemap-content\"]/div[1]/div/a[5]")
    public WebElement ConversationBtn;


  @FindBy(id = "pagetitle")
  public WebElement ConversationTitle;

  public void loginHelpdesk(){
   userName.sendKeys(ConfigurationReader.getProperty("helpdesk.username"));
    passWord.sendKeys(ConfigurationReader.getProperty("nextBase.password"));
    loginBtn.click();
  }

  public void loginHR(){
    userName.sendKeys(ConfigurationReader.getProperty("h1.username"));
    passWord.sendKeys(ConfigurationReader.getProperty("nextBase.password"));
    loginBtn.click();
  }


  public void loginMarketing(){
    userName.sendKeys(ConfigurationReader.getProperty("marketing.username"));
    passWord.sendKeys(ConfigurationReader.getProperty("nextBase.password"));
    loginBtn.click();
  }


}
