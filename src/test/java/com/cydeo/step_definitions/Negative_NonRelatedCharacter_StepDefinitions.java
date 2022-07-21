package com.cydeo.step_definitions;

import com.cydeo.pages.BasePagee;
import com.cydeo.pages.NextBasePage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.Keys;

public class Negative_NonRelatedCharacter_StepDefinitions {

    NextBasePage nextBasePage = new NextBasePage();

    @Given("{string} is on homepage")
    public void is_on_homepage(String string) {
        switch (string.toLowerCase()){
            case "hr":
                BasePagee.loginAsHR();
                break;
            case "helpdesk":
                BasePagee.loginAsHelpdesk();
                break;
            case "marketing":
                BasePagee.loginAsMarketing();
                break;
        }
    }

    @Given("clicks search button with non-releated {string}")
    public void clicks_search_button_with_non_releated(String string) {
        nextBasePage.searchBtn.sendKeys(string + Keys.ENTER);
    }
    @Then("verify that user has get Nothing found title")
    public void verify_that_user_has_get_nothing_found_title() {
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@id=\"feed-empty-wrap\"]/div")).isDisplayed());
    }



}
