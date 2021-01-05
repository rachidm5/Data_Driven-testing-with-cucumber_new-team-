package com.statefarm.project.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class HomeP_WebElement {
    public static final String Insurance_click_XP="//span[contains(text(),'INSURANCE')]";
    @FindBy(how=How.XPATH, using=Insurance_click_XP)
    public static WebElement Insurance_click;
    // zip cod check
    public static final String zip_code_enter_ID="quote-main-zip-code-input";
    @FindBy(how=How.ID,using=zip_code_enter_ID)
    public static WebElement zip_code_enter;
    public static final String quot_click_button_ID = "quote-main-zip-btn";
    @FindBy(how=How.ID,using=quot_click_button_ID)
    public static WebElement quot_click_button;

    public static final String popup_alert_click_id = "billOfRightsModalCloseLinkId";
    @FindBy(how=How.ID,using=popup_alert_click_id)
    public static WebElement popup_alert_click;
    public static final String  getPopup_alert_XP="//div[@id='billOfRightsModal']";
    @FindBy(how=How.XPATH,using=getPopup_alert_XP)
    public static WebElement getPopup_alert;
    public static final String  First_Name_Enter_XP ="//input[@id='first_name']";
    @FindBy(how=How.XPATH,using=First_Name_Enter_XP )
    public static WebElement First_Name_Enter ;
    public static final String search_link_click_XP="//span[text()='Search']";
    @FindBy(how=How.XPATH,using=search_link_click_XP)
    public static WebElement search_link_click;
    public static final String search_box_XP="//input[@id='util-sf-search']";
    @FindBy(how=How.XPATH,using=search_box_XP)
    public static WebElement search_box;

    public static final String search_button_click_XP="//button[text()='Search']";
    @FindBy(how=How.XPATH,using=search_button_click_XP)
    public static WebElement search_button_click;
    public static final String state_farm_logo_click_XP="//img[@id='oneX-sf-logo']";
    @FindBy(how=How.XPATH,using=state_farm_logo_click_XP)
    public static WebElement state_farm_logo_click;

    public static final String get_Expected_search_text_XP="//body/div[@id='__next']/div[1]/div[2]/div[1]/section[2]/div[5]/div[2]/div[1]/div[2]/div[1]/h4[1]/a[1]";
    @FindBy(how=How.XPATH,using=get_Expected_search_text_XP)
    public static WebElement get_Expected_search_text;
}
