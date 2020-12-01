package pages_and_Webelemens;

import common.WebAPI;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static pages_and_Webelemens.HomeP_WebElement.*;

public class HomePage extends WebAPI {
    public static void takeScreenshot(WebDriver driver) throws IOException {
        Object Timestamp =new SimpleDateFormat(" yy-MM-dd HH-mm-ss").format(new Date());
        TakesScreenshot shot=(TakesScreenshot)driver;
        File file =shot.getScreenshotAs(OutputType.FILE);
        File screensho_Destination = new File("../team_Project/target/Screenshots/ScShot"+ Timestamp +".png");
        FileUtils.copyFile(file,screensho_Destination);
    }
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

    public void user_clicks_on_Sortable_a_list_of_items_should_appear_Test() {
        Sortable_link.click();
        JavascriptExecutor js1 = (JavascriptExecutor)driver;
        js1.executeScript("arguments[0].scrollIntoView();",Sortable_link);
        driver.switchTo().frame(0);
//        Sortable_Item_List.forEach( elem -> System.out.println(elem.getText()));
        for(WebElement elem:Sortable_Item_List){
            System.out.println(elem.getText());
        }
    }

    public void user_should_be_able_to_move_the_desired_in_the_desired_Test(String string, String string2) throws InterruptedException, IOException {
        Actions ac = new Actions(driver);
        System.out.println(Item_6.getAttribute("class"));
        int X=Item_6.getLocation().x;
        int Y=Item_6.getLocation().y;

        System.out.println(Y);
        string="Item 2";
        for(int i=0;i<Sortable_Item_List.size();i++){

            if(Sortable_Item_List.get(i).getText().equalsIgnoreCase(string)){

                takeScreenshot(driver);
//                ac.dragAndDrop(Sortable_Item_List.get(i),Item_6).release().build().perform();
               ac.dragAndDropBy(Sortable_Item_List.get(i),X,150).release().build().perform();
//             ac.clickAndHold(Sortable_Item_List.get(i)).moveByOffset(X,Y).release().build().perform();
                takeScreenshot(driver);
                Thread.sleep(5000);
                break;
            }

        }
    }
}
