package pages_and_Webelemens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class HomeP_WebElement {
    public static final String selectable_link_LinkText="Selectable";
    @FindBy(how=How.LINK_TEXT, using=selectable_link_LinkText)
    public static WebElement selectable_link;

    public static final String Item_List_XPATH="//li[contains(text(),'Item')]";
    @FindBy(how=How.XPATH, using=Item_List_XPATH)
    public static List<WebElement> Item_List;

}
