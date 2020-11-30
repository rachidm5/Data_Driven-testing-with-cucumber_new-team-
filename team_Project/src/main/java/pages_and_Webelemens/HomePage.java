package pages_and_Webelemens;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static pages_and_Webelemens.HomeP_WebElement.*;

public class HomePage extends WebAPI {
    public void user_lands_in_jqueryui_Home_pag_Test() {
        String ActualURL=driver.getCurrentUrl();
        String ExpectedURL="https://jqueryui.com/draggable/";
        Assert.assertEquals(ActualURL,ExpectedURL);
    }

    public void user_clicks_on_Selectable_a_list_of_items_should_appear_Test() {
        selectable_link.click();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",selectable_link);
        driver.switchTo().frame(0);
//        Item_List.forEach(Elem -> System.out.println(Elem));
        for(WebElement element :Item_List){
            element.isDisplayed();
            System.out.println("This is the text      :"+element.getText());
        }
    }

    public void user_should_be_able_to_select_desired_Test(String string) throws InterruptedException {
        string="ITEM 4";
        for(WebElement element :Item_List){
            if(element.getText().equalsIgnoreCase(string)){
               String before_click=element.getAttribute("class");
            element.click();
            Thread.sleep(2000);
            String After_click=element.getAttribute("class");
                System.out.println("before_click "+before_click);
                System.out.println("After_click "+After_click);
                Assert.assertNotEquals(After_click,before_click);
            break;
        }

    }
 }
}
