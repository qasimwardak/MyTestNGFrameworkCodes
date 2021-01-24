package com.hrms.pages;


import com.hrms.utils.CommonMethods;
import com.hrms.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends CommonMethods {

    @FindBy(id = "welcome")
    public WebElement welcomeMessage;

    @FindBy(id = "menu_pim_viewPimModule")
    public WebElement PIM;

    @FindBy(linkText = "Add Employee")
    public WebElement addEmployee;

    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }
}
