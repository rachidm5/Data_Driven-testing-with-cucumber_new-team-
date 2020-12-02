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
import java.util.concurrent.TimeUnit;

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
        JavascriptExecutor js = (JavascriptExecutor)driver;
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
        js1.executeScript("arguments[0].scrollIntoView();",Resizable_link);
        driver.switchTo().frame(0);
//        Sortable_Item_List.forEach( elem -> System.out.println(elem.getText()));
        for(WebElement elem:Sortable_Item_List){
            System.out.println(elem.getText());
        }
    }

    public void user_should_be_able_to_move_the_desired_in_the_desired_Test(String Source_Item, String Target_Item) throws InterruptedException, IOException {
        Actions ac = new Actions(driver);
        String Source_Item_XPATH="//li[contains(text(),'"+Source_Item+"')]";
        String Target_Item_XPATH="//li[contains(text(),'"+Target_Item+"')]";
        WebElement Target_Item_WE=driver.findElement(By.xpath(Target_Item_XPATH));
        WebElement Source_Item_WE=driver.findElement(By.xpath(Source_Item_XPATH));
        System.out.println(Source_Item_WE.getText());
        System.out.println(Target_Item_WE.getText());
        int X = Target_Item_WE.getLocation().getX();
        int Y = Target_Item_WE.getLocation().getY();
        System.out.println("X= "+X);
        System.out.println("Y= "+Y);
        ac.clickAndHold(Source_Item_WE).dragAndDropBy(Target_Item_WE,X,Y).build().perform();
        takeScreenshot(driver);
        Thread.sleep(10000);
      }

    public void user_clicks_on_Resizable_link_a_small_window_with_the_title_should_appear_Test(String Expected_Text) throws AWTException, InterruptedException {
        // 2 Method to scroll down
        Actions ac = new Actions(driver);
        Resizable_link.click();
        ac.moveToElement(Dialog_link).build().perform();
//        Thread.sleep(5000);
        driver.switchTo().frame(0);
        String Actual_Title=Resizable_Text.getText();
        System.out.println(Actual_Title);
        Assert.assertEquals(Actual_Title,Expected_Text);

    }

    public  void user_should_be_able_to_Resize_the_small_window_to_a_desired_Test(String size) throws InterruptedException, IOException {
        Resizable_Icon.getLocation();
        System.out.println(Resizable_Icon.getLocation());
        takeScreenshot(driver);
        Actions ac= new Actions(driver);
        ac.clickAndHold(Resizable_Icon).moveByOffset(200,200).build().perform();
        takeScreenshot(driver);
//        Thread.sleep(5000);
    }
}
