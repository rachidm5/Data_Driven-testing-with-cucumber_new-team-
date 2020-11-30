package hooks;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.support.PageFactory;
import pages_and_Webelemens.HomeP_WebElement;
import pages_and_Webelemens.HomePage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hook extends WebAPI {
    public static HomePage homePage;
    public static HomeP_WebElement homeP_webElement;

    public static void Init(){
        homePage= PageFactory.initElements(driver,HomePage.class);
        homeP_webElement= PageFactory.initElements(driver,HomeP_WebElement.class);
    }

    @Before
    public void SetUp() throws IOException {
        setUp(false, "browserstack", "ox", "Big Sur", "chrome", "87", "https://jqueryui.com/draggable/");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Init();
    }
    @After
    public void TearDown(){
        driver.close();
    }

}
