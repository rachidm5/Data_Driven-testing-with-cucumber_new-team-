package com.statefarm.project.qa.test.stepDefinitions;


import com.statefarm.project.qa.pages.HomePage;
import com.statefarm.project.qa.test.base.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.statefarm.project.qa.test.base.Setup.*;


public class HomeP_StepDef extends HomePage {
    @When("user enter the state farm url on the browser")
    public void user_enter_the_state_farm_url_on_the_browser() {
        homePage.user_enter_the_state_farm_url_on_the_browser_Test();
    }

    @Then("user should see the state farm home page lunched")
    public void user_should_see_the_state_farm_home_page_lunched() throws InterruptedException {
        homePage.user_should_see_the_state_farm_home_page_lunched_Test();
    }
    // scenario 02:
    @Given("the user Lands in Stat farm home page")
    public void the_user_Lands_in_Stat_farm_home_page() {

    }

    @When("user enter valid {string} in the zip code text box")
    public void user_enter_valid_in_the_zip_code_text_box(String Zip_Code) throws InterruptedException {
        homePage.user_enter_valid_in_the_zip_code_text_box_test( Zip_Code);
    }

    @When("user click on the Start quote button")
    public void user_click_on_the_Start_quote_button() {
        homePage.user_click_on_the_Start_quote_button_test();
    }

    @Then("new page appears to file up the information needed for the quot")
    public void new_page_appears_to_file_up_the_information_needed_for_the_quot() {

    }
    // scenario 03
    @When("user click on search link search field should appears")
    public void user_click_on_search_link_search_field_should_appears() {
        homePage.user_click_on_search_link_search_field_should_appears_test();
    }

    @When("user enter {string} in the search box And click on search button")
    public void user_enter_in_the_search_box_And_click_on_search_button(String string) throws Exception {

        homePage.user_enter_in_the_search_box_And_click_on_search_button_Test(string);
    }

    @Then("new Result page should appears")
    public void new_Result_page_should_appears() {

    }
    // scenario 04
    @When("I click on search link search field should appears")
    public void i_click_on_search_link_search_field_should_appears() {
        homePage.i_click_on_search_link_search_field_should_appears_Test();
    }

    @When("I Enter {string} in search input field")
    public void i_Enter_in_search_input_field(String service) {
        homePage.i_Enter_in_search_input_field_Test( service);
    }

    @When("I click search button")
    public void i_click_search_button() {
        homePage.i_click_search_button_Test();
    }

    @Then("I should see {string}")
    public void i_should_see(String ExpectedResult) {
        homePage.i_should_see_test(ExpectedResult);
    }


}
