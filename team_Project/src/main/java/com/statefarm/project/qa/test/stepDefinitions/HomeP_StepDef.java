package com.statefarm.project.qa.test.stepDefinitions;

import com.statefarm.project.qa.pages.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import java.awt.*;
import java.io.IOException;

import static com.statefarm.project.qa.test.base.Hook.*;

public class HomeP_StepDef extends HomePage {

    //test case 01 Selectable
    @Given("User lands in jqueryui Home page")
    public void user_lands_in_jqueryui_Home_page() {
        homePage.user_lands_in_jqueryui_Home_pag_Test();
    }

    @When("User clicks on Selectable a list of items should appear")
    public void user_clicks_on_Selectable_a_list_of_items_should_appear() {
        homePage.user_clicks_on_Selectable_a_list_of_items_should_appear_Test();
    }

    @Then("User should be able to select desired {string}")
    public void user_should_be_able_to_select_desired(String string) throws InterruptedException {
        homePage.user_should_be_able_to_select_desired_Test(string);
    }

    // test case 02  Sortable
    @When("User clicks on Sortable a list of items should appear")
    public void user_clicks_on_Sortable_a_list_of_items_should_appear() {
        homePage.user_clicks_on_Sortable_a_list_of_items_should_appear_Test();
    }

    @Then("User should be able to move the desired {string} in the desired {string}")
    public void user_should_be_able_to_move_the_desired_in_the_desired(String string, String string2) throws InterruptedException, IOException {
        homePage.user_should_be_able_to_move_the_desired_in_the_desired_Test("Item 1","Item 5");
    }
    // test case 03  Resizable
    @When("User clicks on Resizable link a small window with the title {string} should appear")
    public void user_clicks_on_Resizable_link_a_small_window_with_the_title_should_appear(String string) throws AWTException, InterruptedException {
        homePage.user_clicks_on_Resizable_link_a_small_window_with_the_title_should_appear_Test("Resizable");
    }

    @Then("User should be able to Resize the small window to a desired {string}")
    public void user_should_be_able_to_Resize_the_small_window_to_a_desired(String string) throws InterruptedException, IOException {
        homePage.user_should_be_able_to_Resize_the_small_window_to_a_desired_Test("Size");
    }
}
