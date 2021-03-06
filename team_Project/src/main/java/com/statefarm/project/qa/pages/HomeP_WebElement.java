package com.statefarm.project.qa.pages;

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

    public static final String Resizable_link_LinkText="Resizable";
    @FindBy(how=How.LINK_TEXT, using=Resizable_link_LinkText)
    public static WebElement Resizable_link;
    public static final String Dialog_link_LinkText="Dialog";
    @FindBy(how=How.LINK_TEXT, using=Dialog_link_LinkText)
    public static WebElement Dialog_link;

    public static final String Resizable_Text_XPATH="//div/h3[contains(text(),'Resizable')]";
    @FindBy(how=How.XPATH, using=Resizable_Text_XPATH)
    public static WebElement Resizable_Text;

    public static final String Resizable_Icon_XPATH="//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']";
    @FindBy(how=How.XPATH, using=Resizable_Icon_XPATH)
    public static WebElement Resizable_Icon;

}
