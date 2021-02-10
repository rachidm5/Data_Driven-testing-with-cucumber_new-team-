package com.statefarm.project.qa.pages;

import common.WebAPI;
import databases.ConnectToSqlDB;
import org.openqa.selenium.By;
import org.testng.Assert;
import utilities.DataReader;

import java.util.List;

import static com.statefarm.project.qa.pages.HomeP_WebElement.*;

public class HomePage extends WebAPI {

    //method for scenario 01
    public void user_enter_the_state_farm_url_on_the_browser_Test() {
        System.out.println("state farm bebe");
    }

    public void user_should_see_the_state_farm_home_page_lunched_Test() throws InterruptedException {

        Insurance_click.click();
        sleepFor(4);
        String expectedResult = "https://www.statefarm.com/";
        String actuelResult = driver.getCurrentUrl();
        System.out.println(actuelResult);

        Assert.assertEquals(actuelResult, expectedResult);
    }

    //methods for scenario 02
    String path = "C:/Users/ssbra/Desktop/New Microsoft Office Excel Worksheet.xlsx";

    public void user_enter_valid_in_the_zip_code_text_box_test(String Zip_Code) throws InterruptedException {
        List<String> myList = DataReader.readExcelFile(path);

        for (String element : myList) {
            System.out.println(element);
            zip_code_enter.clear();
            zip_code_enter.sendKeys(element);
            user_click_on_the_Start_quote_button_test();
            Thread.sleep(3000);
            //    driver.switchTo().frame(0);

            //  driver.switchTo().alert().dismiss();
//           if (getPopup_alert.isEnabled()) {
//                popup_alert_click.click();
//                navigatebackWindow();
//                Thread.sleep(3000);
//            }else {
            //   First_Name_Enter.sendKeys("brahim");
            navigatebackWindow();
            Thread.sleep(3000);
        }

    }

    public void user_click_on_the_Start_quote_button_test() {
        quot_click_button.click();
    }

    // method to check search box
    public void user_click_on_search_link_search_field_should_appears_test() {

        //  search_link_click.click();
    }

    public void user_enter_in_the_search_box_And_click_on_search_button_Test(String string) throws Exception {
        //  ConnectToSqlDB.connectToSqlDatabase();
        List<String> list = ConnectToSqlDB.readDataBase("state_farm_search", "search_text");
        for (String element : list) {
            search_link_click.click();
            search_box.sendKeys(element);
            search_button_click.click();
            Thread.sleep(1000);
            state_farm_logo_click.click();
            Thread.sleep(1000);
        }

    }

    // methods for scenario 04
    public void i_click_on_search_link_search_field_should_appears_Test() {
        search_link_click.click();
    }

    public void i_Enter_in_search_input_field_Test(String service) {
        search_box.sendKeys(service);
    }

    public void i_click_search_button_Test() {
        search_button_click.click();
    }

    public void i_should_see_test(String expectedResult) {

        String actual = get_Expected_search_text.getText();

        String[] myList = actual.split(",");
        boolean Result = false;
        for (int i=0;i< myList.length;i++) {
            if (myList[i].trim().equalsIgnoreCase(expectedResult)) {
                System.out.println("the actual and the expected result match");
                Result = true;
                break;
            }
        }
        Assert.assertTrue(Result);
    }
}