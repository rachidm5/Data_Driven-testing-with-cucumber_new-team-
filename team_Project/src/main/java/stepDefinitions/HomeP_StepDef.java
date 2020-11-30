package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages_and_Webelemens.*;

import static hooks.Hook.*;

public class HomeP_StepDef extends HomePage {
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
}
