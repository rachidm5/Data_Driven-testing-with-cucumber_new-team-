package com.statefarm.project.qa.test.base;

import common.WebAPI;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.PageFactory;
import com.statefarm.project.qa.pages.HomeP_WebElement;
import com.statefarm.project.qa.pages.HomePage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Setup extends WebAPI {
    public static HomePage homePage;
    public static HomeP_WebElement homeP_webElement;
    public static void Init(){
        homePage= PageFactory.initElements(driver,HomePage.class);
        homeP_webElement= PageFactory.initElements(driver,HomeP_WebElement.class);
    }
    @Before
    public void SetUp() throws IOException {
        Config config = new Config();
        config.loadProperties();
        Init();
    }
    @After
    public void TearDown(Scenario scenario) throws IOException {

        if (scenario.isFailed()) {
            try {
                Object Timestamp = new SimpleDateFormat(" yy-MM-dd HH-mm-ss").format(new Date());
                TakesScreenshot shot = (TakesScreenshot) driver;
                File file = shot.getScreenshotAs(OutputType.FILE);
                File screensho_Destination = new File("../com.statefarm.project.qa/target/Screenshot/Screenshot"+ scenario.getName() + Timestamp + ".png");
                FileUtils.copyFile(file, screensho_Destination);
            } catch (WebDriverException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
              scenario.getName();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Setup.driver.quit();
    }

        }

