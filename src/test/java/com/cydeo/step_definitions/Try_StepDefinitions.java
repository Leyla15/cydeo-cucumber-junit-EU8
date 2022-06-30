package com.cydeo.step_definitions;

import com.cydeo.pages.NextBasePage;
import com.cydeo.pages.WikiSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.security.Key;

public class Try_StepDefinitions {

    NextBasePage nextBasePage = new NextBasePage();

    @When("user click search button")
    public void user_click_search_button() {
        nextBasePage.searchBtn.click();
    }
    @When("user search for {string} and clicks enter")
    public void user_search_for_and_clicks_enter(String string) {
        nextBasePage.searchBtn.sendKeys(string + Keys.ENTER);
    }
    @Then("verify that  {string} related  can be seen")
    public void verify_that_related_can_be_seen(String string) {
     // Assert.assertTrue(Driver.getDriver().getTitle().contains(string));

        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@id=\"pagetitle\"]")).isDisplayed());


    }


}
