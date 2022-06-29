package com.cydeo.step_definitions;

import com.cydeo.pages.NextBasePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class FindingItem_StepDefinitions {

    NextBasePage nextBasePage = new NextBasePage();


    @When("user clicks search button")
    public void user_clicks_search_button() {
        nextBasePage.searchBtn.click();
    }

    @And("user searches for {string} and clicks enter")
    public void userSearchesForItemAndClicksEnter(String string) {

      nextBasePage.searchBtn.sendKeys(string + Keys.ENTER);
        BrowserUtils.waitFor(2);

    }

    @Then("verify that {string} related items can be seen")
    public void verify_that_related_items_can_be_seen(String string) {
//        Assert.assertTrue(nextBasePage.mailPage.isDisplayed());
//        Assert.assertTrue(nextBasePage.calendarPage.isDisplayed());
//        Assert.assertTrue(nextBasePage.drivePage.isDisplayed());

        BrowserUtils.waitFor(2);
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(string,actualTitle);


    }

    @Given("<User> is on home page")
    public void user_is_on_home_page() {
    }




}






