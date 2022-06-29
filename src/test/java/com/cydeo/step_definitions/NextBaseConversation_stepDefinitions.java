package com.cydeo.step_definitions;

import com.cydeo.pages.NextBasePage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NextBaseConversation_stepDefinitions {

    NextBasePage nextBasePage = new NextBasePage();
    @Given("user is on the next base login page")
    public void user_is_on_the_next_base_login_page1() {
        Driver.getDriver().get(ConfigurationReader.getProperty("nextBase.url"));
    }
    @Given("HR is on home page")
    public void hr_is_on_home_page() {
        nextBasePage.loginHR();

    }

//    @When("user clicks Menu button")
//    public void user_clicks_menu_button1() {
//        nextBasePage.menuBtn.click();
//
//    }
//    @And("user clicks Conversations button")
//    public void user_clicks_conversations_button1() {
//        nextBasePage.ConversationBtn.click();
//
//    }


   @Given("Helpdesk is on home page")
    public void helpdesk_is_on_home_page() {
        nextBasePage.loginHelpdesk();
  }

   @Given("Marketing is on home page")
   public void marketing_is_on_home_page() {
        nextBasePage.loginMarketing();

  }

//   @And("verify that user displayes Conversations")
//   public void verifyThatUserDisplayesConversations() {
//
//       Assert.assertTrue(nextBasePage.ConversationTitle.isDisplayed());
//
//   }


    @When("user clicks {string} button and {string} button")
    public void userClicksMenuButtonAndConversationsButton(String menu, String conversation) {
        nextBasePage.menuBtn.click();
        nextBasePage.ConversationBtn.click();
    }

    @Then("verify that user displayes {string}")
    public void verifyThatUserDisplayesConversations(String conversationPage) {
        Assert.assertTrue(nextBasePage.ConversationTitle.isDisplayed());
    }



}
