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
    public static final String Sortable_link_LinkText="Sortable";
    @FindBy(how=How.LINK_TEXT, using=Sortable_link_LinkText)
    public static WebElement Sortable_link;
    public static final String Sortable_Item_List_XPATH="//li[@class='ui-state-default ui-sortable-handle']";
    @FindBy(how=How.XPATH, using=Sortable_Item_List_XPATH)
    public static List<WebElement> Sortable_Item_List;
    public static final String Item_1_XPATH="//li[contains(text(),'Item 1')]";
    @FindBy(how=How.XPATH, using=Item_1_XPATH)
    public static WebElement Item_1;
    public static final String Item_6_XPATH="//li[contains(text(),'Item 6')]";
    @FindBy(how=How.XPATH, using=Item_6_XPATH)
    public static WebElement Item_6;
    public static final String Resizable_link_LinkText="Resizable";
    @FindBy(how=How.LINK_TEXT, using=Resizable_link_LinkText)
    public static WebElement Resizable_link;

//li[@class='ui-state-default ui-sortable-handle'][1]
}
