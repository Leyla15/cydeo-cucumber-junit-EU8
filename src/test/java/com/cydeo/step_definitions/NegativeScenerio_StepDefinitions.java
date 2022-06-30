package com.cydeo.step_definitions;

import com.cydeo.pages.NextBasePage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class NegativeScenerio_StepDefinitions {

    NextBasePage nextBasePage = new NextBasePage();
    String currentURLBefore = "";
    String currentURLAfter = "";


    @Given("HR is on homepage")
    public void hr_is_on_homepage() {
        nextBasePage.loginHR();
    }
    @Given("clicks search button without providing input")
    public void clicks_search_button_without_providing_input() {
       // nextBasePage.searchBtn.click();
        String currentURLBefore = Driver.getDriver().getCurrentUrl();
        nextBasePage.searchBtn.sendKeys("" + Keys.ENTER);
        String currentURLAfter = Driver.getDriver().getCurrentUrl();


    }
    @Then("verify that any page can not opened")
    public void verify_that_any_page_can_not_opened() {
        //Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@id=\"pagetitle\"]")).isDisplayed());
        Assert.assertEquals(currentURLBefore,currentURLAfter);

    }


    @Given("Helpdesk is on homepage")
    public void helpdesk_is_on_homepage() {
      nextBasePage.loginHelpdesk();
    }



    @Given("Marketing is on homepage")
    public void marketing_is_on_homepage() {
     nextBasePage.loginMarketing();
    }

}
